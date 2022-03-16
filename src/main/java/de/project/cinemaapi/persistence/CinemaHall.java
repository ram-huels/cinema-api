package de.project.cinemaapi.persistence;

import javax.persistence.*;

@Entity
public class CinemaHall {

    private static int id = 0;

    @Id
    private int cinemaHallId;

    @Column
    private int boxSeats;

    @Column
    private int parquetSeats;

    public CinemaHall(int boxSeats, int parquetSeats) {
        this.cinemaHallId = id;
        this.boxSeats = boxSeats;
        this.parquetSeats = parquetSeats;
        id++;
    }

    public CinemaHall() {
        id++;
    }

    public CinemaHall(int k_id, int logenplaetze, int parkettplaetze) {
        cinemaHallId = k_id;
        boxSeats = logenplaetze;
        parquetSeats = parkettplaetze;
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
