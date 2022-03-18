package de.project.cinemaapi.services;

import de.project.cinemaapi.data.TicketRepository;
import de.project.cinemaapi.data.UserRepository;
import de.project.cinemaapi.generated.model.LoginResponseTO;
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

    public LoginResponseTO checkLogin(LoginTO body) {
        LoginResponseTO loginResponseTO = new LoginResponseTO();
        User user = userRepository.getUserViaLoginInformation(body.getUsername(), body.getPassword());
        if (user == null) {
            loginResponseTO.isAdmin(false);
            loginResponseTO.isCorrect(false);
            return loginResponseTO;
        }
        loginResponseTO.setIsCorrect(true);
        loginResponseTO.setIsAdmin(user.isAdmin());
        return loginResponseTO;
    }

    /*
    Mapping
     */
    private List<TicketTO> mapTicketsToTicketTOs(List<Ticket> ticketList) {
        List<TicketTO> ticketTOList = new ArrayList<>();
        for (Ticket ticket: ticketList) {
            TicketTO ticketTO = new TicketTO();
            ticketTO.setShowId(ticket.getShow().getShowId());
            ticketTO.setTicketId(ticket.getTicketId());
            ticketTO.setMoviename(ticket.getShow().getMovie().getMovieName());
            ticketTO.setPrice(ticket.getPrice());
            ticketTO.setTime(ticket.getShow().getStartTime().toString());
            ticketTOList.add(ticketTO);
        }
        return ticketTOList;
    }

}
