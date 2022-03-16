package de.project.cinemaapi.data;

import de.project.cinemaapi.persistence.CinemaHall;
import de.project.cinemaapi.persistence.Movie;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class CinemaHallRepository {

    public CinemaHall getCinemaHall(Integer id) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:kino.db");
            PreparedStatement statement = conn.prepareStatement("SELECT * FROM Kinosall WHERE K_ID = ?");
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();

            CinemaHall cinemaHall = null;

            while (rs.next()) {
                cinemaHall = new CinemaHall(id, rs.getInt("Logenplaetze"), rs.getInt("Parkettplaetze"));
            }

            rs.close();
            conn.close();
            statement.close();

            return cinemaHall;
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return null;
    }

    public List<CinemaHall> getAllCinemaHalls() {
        try {
            List<CinemaHall> list = new ArrayList<>();
            
            Connection conn = DriverManager.getConnection("jdbc:sqlite:kino.db");
            PreparedStatement statement = conn.prepareStatement("SELECT * FROM Kinosaal");
            ResultSet rs = statement.executeQuery();

            CinemaHall cinemaHall;

            while (rs.next()) {
                cinemaHall = new CinemaHall(rs.getInt("K_ID"), rs.getInt("Logenplaetze"), rs.getInt("Parkettplaetze"));
                list.add(cinemaHall);
            }

            rs.close();
            conn.close();
            statement.close();

            return list;
        } catch (Exception ex){
            System.out.println(ex.toString());
        }
        return Collections.emptyList();
    }

    public CinemaHall getCinemaHall(int id) {
        return new CinemaHall();
    }
}
