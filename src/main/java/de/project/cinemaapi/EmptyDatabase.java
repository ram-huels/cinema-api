package de.project.cinemaapi;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

@Component
public class EmptyDatabase {

    @PostConstruct
    public void init() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:kino.db");
            PreparedStatement emptyMovie = conn.prepareStatement("DELETE FROM Film");
            PreparedStatement emptyShow = conn.prepareStatement("DELETE FROM Vorstellungen");
            PreparedStatement emptyTicket = conn.prepareStatement("DELETE FROM Ticket");

            PreparedStatement[] statements = {emptyMovie, emptyShow, emptyTicket};

            for (PreparedStatement statement: statements) {
                statement.executeUpdate();
                statement.close();
            }

            conn.close();

        } catch (Exception exception){
            System.out.println(exception.toString());
        }
    }
}
