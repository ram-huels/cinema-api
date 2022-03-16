package de.project.cinemaapi.persistence;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Show {

    private static int id = 0;

    @Id
    private int showId;

    @ManyToOne(fetch = FetchType.EAGER, targetEntity = CinemaHall.class)
    private CinemaHall cinemaHall;

    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Movie.class)
    private Movie movie;

    @Column
    private boolean is3D;

    @Column
    private LocalDateTime startTime;

    public Show(CinemaHall cinemaHall, Movie movie, boolean is3D, LocalDateTime startTime) {
        this.showId = id;
        this.cinemaHall = cinemaHall;
        this.movie = movie;
        this.is3D = is3D;
        this.startTime = startTime;
        id++;
    }

    public Show(int showId, CinemaHall cinemaHall, Movie movie, boolean is3D, LocalDateTime startTime) {
        this.showId = showId;
        this.cinemaHall = cinemaHall;
        this.movie = movie;
        this.is3D = is3D;
        this.startTime = startTime;
    }

    public Show() {
        id++;
    }

    public int getShowId() {
        return showId;
    }

    public void setShowId(int showId) {
        this.showId = showId;
    }

    public CinemaHall getCinemaHall() {
        return cinemaHall;
    }

    public void setCinemaHall(CinemaHall cinemaHall) {
        this.cinemaHall = cinemaHall;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public boolean isIs3D() {
        return is3D;
    }

    public void setIs3D(boolean is3D) {
        this.is3D = is3D;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }
}
