package de.project.cinemaapi.data;

import de.project.cinemaapi.persistence.Ticket;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TicketRepository {

    private final UserRepository userRepository;

    private final ShowRepository showRepository;

    public TicketRepository(UserRepository userRepository, ShowRepository showRepository) {
        this.userRepository = userRepository;
        this.showRepository = showRepository;
    }

    public void saveTicket(Ticket ticket) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:kino.db");
            PreparedStatement statement = conn.prepareStatement("INSERT INTO Ticket(T_ID, Preis, V_ID, B_ID, isLogenplatz) VALUES (?,?,?,?,?)");
            statement.setInt(1, ticket.getTicketId());
            statement.setDouble(2, ticket.getPrice());
            statement.setInt(3, ticket.getShow().getShowId());
            statement.setInt(4, ticket.getUser().getUserId());
            statement.setInt(5, booleanToInt(ticket.isBoxSeat()));

            statement.executeUpdate();

            conn.close();
            statement.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public void cancelTicket(int id) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:kino.db");
            PreparedStatement statement = conn.prepareStatement("DELETE FROM Ticket WHERE T_ID = ?");
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();

            rs.close();
            conn.close();
            statement.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public List<Ticket> getTickets(int id) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:kino.db");
            PreparedStatement statement = conn.prepareStatement("SELECT * FROM Ticket WHERE B_ID = ?");
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();

            List<Ticket> ticketList = new ArrayList<>();
            Ticket ticket = null;

            while (rs.next()) {
                ticket = new Ticket(rs.getDouble("Preis"), showRepository.getShow(rs.getInt("V_ID")), userRepository.getUser(id), intToBoolean(rs.getInt("isLogenplatz")));
                ticketList.add(ticket);
            }

            rs.close();
            conn.close();
            statement.close();

            return ticketList;
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return null;
    }

    /*
    Hilfsfunktionen
     */
    private int booleanToInt(boolean x) {
        return x ? 1 : 0;
    }

    private boolean intToBoolean(int x) {
        return x == 1;
    }
}
