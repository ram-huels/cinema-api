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

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
}
