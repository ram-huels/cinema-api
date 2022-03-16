package de.project.cinemaapi.persistence;

import javax.persistence.*;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int movieId;

    @Column
    private String movieName;

    public Movie(String movieName) {
        this.movieName = movieName;
    }

    public Movie() {

    }

    public Movie(int f_id, String name) {
        movieId = f_id;
        movieName = name;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }
}
