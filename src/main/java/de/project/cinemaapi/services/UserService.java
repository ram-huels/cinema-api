package de.project.cinemaapi.services;

import de.project.cinemaapi.data.TicketRepository;
import de.project.cinemaapi.data.UserRepository;
import de.project.cinemaapi.generated.model.LoginTO;
import de.project.cinemaapi.generated.model.TicketTO;
import de.project.cinemaapi.generated.model.UserTO;
import de.project.cinemaapi.persistence.Ticket;
import de.project.cinemaapi.persistence.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    private final TicketRepository ticketRepository;

    public UserService(UserRepository userRepository, TicketRepository ticketRepository) {
        this.userRepository = userRepository;
        this.ticketRepository = ticketRepository;
    }

    public UserTO deliverUserInformation(int userId) {
        UserTO userTO = new UserTO();
        userTO.setUsername(this.userRepository.getUser(userId).getUserName());
        userTO.setTickets(this.mapTicketsToTicketTOs(this.ticketRepository.getTickets(userId)));
        return userTO;
    }

    public boolean checkLogin(LoginTO body) {
        return userRepository.checkLogin(body.getUsername(), body.getPassword());
    }

    /*
    Mapping
     */
    private List<TicketTO> mapTicketsToTicketTOs(List<Ticket> ticketList) {
        List<TicketTO> ticketTOList = new ArrayList<>();
        for (Ticket ticket: ticketList) {
            TicketTO ticketTO = new TicketTO();
            ticketTO.setShowId(ticket.getShow().getShowId());
            ticketTO.setMoviename(ticket.getShow().getMovie().getMovieName());
            ticketTO.setTime(ticket.getShow().getStartTime().toString());
            ticketTOList.add(ticketTO);
        }
        return ticketTOList;
    }

}
