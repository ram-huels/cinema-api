package de.project.cinemaapi.data;

import de.project.cinemaapi.persistence.Movie;
import de.project.cinemaapi.persistence.Show;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ShowRepository {

    private final CinemaHallRepository cinemaHallRepository;

    private final MovieRepository movieRepository;

    public ShowRepository(CinemaHallRepository cinemaHallRepository, MovieRepository movieRepository) {
        this.cinemaHallRepository = cinemaHallRepository;
        this.movieRepository = movieRepository;
    }

    public void saveShow(Show show) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:kino.db");
            PreparedStatement statement = conn.prepareStatement("INSERT INTO Vorstellungen(V_ID, K_ID, F_ID, is3D, Startzeit) VALUES (?,?,?,?,?)");
            statement.setInt(1, show.getShowId());
            statement.setInt(2, show.getCinemaHall().getCinemaHallId());
            statement.setInt(3, show.getMovie().getMovieId());
            statement.setInt(4, booleanToInt(show.isIs3D()));
            statement.setString(5, show.getStartTime().toString());

            statement.executeUpdate();

            conn.close();
            statement.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public Show getShow(Integer id) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:kino.db");
            PreparedStatement statement = conn.prepareStatement("SELECT * FROM Vorstellung WHERE V_ID = ?");
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();

            Show show = null;

            while (rs.next()) {
                show = new Show(id, cinemaHallRepository.getCinemaHall(rs.getInt("K_ID")), movieRepository.getMovie(rs.getInt("F_ID")),
                        intToBoolean(rs.getInt("is3D")), LocalDateTime.parse(rs.getString("Startpunkt")));
            }

            rs.close();
            conn.close();
            statement.close();

            return show;
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return null;
    }

    public List<Show> getShowsOnTheDay(LocalDateTime withNeededDay, int movieId) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:kino.db");
            PreparedStatement statement = conn.prepareStatement("SELECT * FROM Vorstellung WHERE F_ID = ? AND Startzeit LIKE ?");
            statement.setInt(1, movieId);
            statement.setString(2, withNeededDay.toString().substring(0, 9) + "%");
            ResultSet rs = statement.executeQuery();

            List<Show> showList = new ArrayList<>();
            Show show = null;

            while (rs.next()) {
                show = new Show(rs.getInt("V_ID"), cinemaHallRepository.getCinemaHall(rs.getInt("K_ID")), movieRepository.getMovie(rs.getInt("F_ID")),
                        intToBoolean(rs.getInt("is3D")), LocalDateTime.parse(rs.getString("Startpunkt")));
                showList.add(show);
            }

            rs.close();
            conn.close();
            statement.close();

            return showList;
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return null;
    }

    private int booleanToInt(boolean data) {
        if (data) {
            return 1;
        } else {
            return 0;
        }
    }

    private boolean intToBoolean(int x) {
        return x == 1;
    }
}
