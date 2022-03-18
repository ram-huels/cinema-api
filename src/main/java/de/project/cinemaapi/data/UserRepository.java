package de.project.cinemaapi.data;

import de.project.cinemaapi.persistence.Movie;
import de.project.cinemaapi.persistence.User;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@Repository
public class UserRepository {

    public User getUser(int userId) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:kino.db");
            PreparedStatement statement = conn.prepareStatement("SELECT * FROM Benutzer WHERE B_ID = ?");
            statement.setInt(1, userId);
            ResultSet rs = statement.executeQuery();

            User user = null;

            while (rs.next()) {
                user = new User(userId, rs.getString("Benutzername"), rs.getString("Kennwort"), intToBoolean(rs.getInt("isAdmin")));
            }

            rs.close();
            conn.close();
            statement.close();

            return user;
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return null;
    }

    public User getUserViaLoginInformation(String username, String password) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:kino.db");
            PreparedStatement statement = conn.prepareStatement("SELECT * FROM Benutzer WHERE  Benutzername = ? AND Kennwort = ?");
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet rs = statement.executeQuery();

            User user = null;

            while (rs.next()) {
                user = new User(rs.getInt("B_ID"), rs.getString("Benutzername"), rs.getString("Kennwort"), intToBoolean(rs.getInt("isAdmin")));
            }

            rs.close();
            conn.close();
            statement.close();

            return user;
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return null;
    }

    /*
    Hilfsfunktionen
    */
    private boolean intToBoolean(int x) {
        return x == 1;
    }
}
