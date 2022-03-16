package de.project.cinemaapi.data;

import de.project.cinemaapi.persistence.Movie;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class MovieRepository {

    public void saveMovie(Movie movie) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:kino.db");
            PreparedStatement statement = conn.prepareStatement("INSERT INTO Film(F_ID, Name) VALUES (?, ?)");
            statement.setInt(1, movie.getMovieId());
            statement.setString(2, movie.getMovieName());

            statement.executeUpdate();

            conn.close();
            statement.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public Movie getMovie(Integer id) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:kino.db");
            PreparedStatement statement = conn.prepareStatement("SELECT * FROM Film WHERE F_ID = ?");
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();

            Movie movie = null;

            while (rs.next()) {
                movie = new Movie(id, rs.getString("Name"));
            }

            rs.close();
            conn.close();
            statement.close();

            return movie;
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return null;
    }

    public List<Movie> getAllMovies() {
        try {
            List<Movie> list = new ArrayList<>();

            Connection conn = DriverManager.getConnection("jdbc:sqlite:kino.db");
            PreparedStatement statement = conn.prepareStatement("SELECT * FROM Film");
            ResultSet rs = statement.executeQuery();

            Movie movie;

            while (rs.next()) {
                movie = new Movie(rs.getInt("F_ID"), rs.getString("Name"));
                list.add(movie);
            }

            rs.close();
            conn.close();
            statement.close();

            return list;
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return Collections.emptyList();
    }
}
