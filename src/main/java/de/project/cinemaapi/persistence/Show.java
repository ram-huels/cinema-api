package de.project.cinemaapi.persistence;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Show {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int showId;

    @ManyToOne(fetch = FetchType.EAGER)
    private CinemaHall cinemaHall;

    @ManyToOne(fetch = FetchType.EAGER)
    private Movie movie;

    @Column
    private boolean is3D;

    @Column
    private LocalDateTime startTime;

    public Show(CinemaHall cinemaHall, Movie movie, boolean is3D, LocalDateTime startTime) {
        this.cinemaHall = cinemaHall;
        this.movie = movie;
        this.is3D = is3D;
        this.startTime = startTime;
    }

    public Show() {

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
