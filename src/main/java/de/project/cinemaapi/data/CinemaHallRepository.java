package de.project.cinemaapi.data;

import de.project.cinemaapi.persistence.CinemaHall;

import java.util.Collections;
import java.util.List;

public class CinemaHallRepository {

    public List<CinemaHall> getAllCinemaHalls() {
        return Collections.emptyList();
    }

    public CinemaHall getCinemaHall(int id) {
        return new CinemaHall();
    }
}
