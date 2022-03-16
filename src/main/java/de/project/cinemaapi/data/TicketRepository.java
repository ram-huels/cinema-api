package de.project.cinemaapi.data;

import de.project.cinemaapi.persistence.Ticket;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@Repository
public class TicketRepository {

    public void saveTicket(Ticket ticket) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:kino.db");
            PreparedStatement statement = conn.prepareStatement("INSERT INTO Ticket(T_ID, Preis, V_ID, B_ID, isLogenplatz) VALUES (?,?,?,?,?)");
            statement.setInt(1, ticket.getTicketId());
            statement.setDouble(2, ticket.getPrice());
            statement.setInt(3, ticket.getShow().getShowId());
            statement.setInt(4, ticket.getUser().getUserId());
            statement.setInt(5, intToBoolean(ticket.isBoxSeat()));

            statement.executeUpdate();

            conn.close();
            statement.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    private int intToBoolean(boolean x) {
        return x ? 1 : 0;
    }
}
