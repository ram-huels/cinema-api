package de.project.cinemaapi.services;

import de.project.cinemaapi.data.ShowRepository;
import de.project.cinemaapi.data.TicketRepository;
import de.project.cinemaapi.data.UserRepository;
import de.project.cinemaapi.generated.model.BookingTO;
import de.project.cinemaapi.generated.model.TicketPushTO;
import de.project.cinemaapi.persistence.Price;
import de.project.cinemaapi.persistence.Show;
import de.project.cinemaapi.persistence.Ticket;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    private final TicketRepository ticketRepository;

    private final ShowRepository showRepository;

    private final UserRepository userRepository;

    public BookingService(TicketRepository ticketRepository, UserRepository userRepository, ShowRepository showRepository) {
        this.ticketRepository = ticketRepository;
        this.userRepository = userRepository;
        this.showRepository = showRepository;
    }

    public BookingTO getBookingInformation(int showId) {
        return mapToBookingTO(this.showRepository.getShow(showId));
    }

    public void bookTicket(TicketPushTO toBeTicket) {
        ticketRepository.saveTicket(mapToTicket(toBeTicket));
    }

    public double getTicketPrice(TicketPushTO ticketPushTO) {
        Show show = showRepository.getShow(ticketPushTO.getShowId());
        return this.calculatePrice(ticketPushTO.isWithDiscount(), ticketPushTO.isIsBoxSeat(), show.isIs3D());
    }

    /*
    Hilfsmethoden
     */
    private double calculatePrice(boolean isReduced, boolean isBoxSeat, boolean is3D) {
        double price = 5;
        if (isReduced) {
            price -= 2;
        }
        if (isBoxSeat) {
            price += 1.5;
        }
        if (is3D) {
            price += 1.5;
        }
        return price;
    }

    /*
    Mapping
     */
    private BookingTO mapToBookingTO(Show show) {
        BookingTO result = new BookingTO();
        result.setMoviename(show.getMovie().getMovieName());
        result.setTime(show.getStartTime().toString());
        result.setIs3D(show.isIs3D());
        return result;
    }

    private Ticket mapToTicket(TicketPushTO ticketPushTO) {
        Show show = showRepository.getShow(ticketPushTO.getShowId());
        Ticket ticket = new Ticket();
        ticket.setShow(show);
        ticket.setBoxSeat(ticketPushTO.isIsBoxSeat());
        ticket.setUser(userRepository.getUser(ticketPushTO.getUserId()));
        ticket.setPrice(this.calculatePrice(ticketPushTO.isWithDiscount(), ticketPushTO.isIsBoxSeat(), show.isIs3D()));
        return ticket;
    }
}
