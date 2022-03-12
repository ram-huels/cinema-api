package de.project.cinemaapi.persistence;

import javax.persistence.*;

@Entity
public class CinemaHall {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cinemaHallId;

    @Column
    private int boxSeats;

    @Column
    private int parquetSeats;

    public CinemaHall(int boxSeats, int parquetSeats) {
        this.boxSeats = boxSeats;
        this.parquetSeats = parquetSeats;
    }

    public CinemaHall() {

    }

    public int getCinemaHallId() {
        return cinemaHallId;
    }

    public void setCinemaHallId(int cinemaHallId) {
        this.cinemaHallId = cinemaHallId;
    }

    public int getBoxSeats() {
        return boxSeats;
    }

    public void setBoxSeats(int boxSeats) {
        this.boxSeats = boxSeats;
    }

    public int getParquetSeats() {
        return parquetSeats;
    }

    public void setParquetSeats(int parquetSeats) {
        this.parquetSeats = parquetSeats;
    }
}
