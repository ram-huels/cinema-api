package de.project.cinemaapi.data;

import de.project.cinemaapi.persistence.Movie;

import java.util.Collections;
import java.util.List;

public class MovieRepository {

    public void saveMovie(Movie movie) {
        System.out.println("Movie has been saved");
    }

    public List<Movie> getAllMovies() {
        return Collections.emptyList();
    }
}
