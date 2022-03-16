package de.project.cinemaapi.services;

import de.project.cinemaapi.data.CinemaHallRepository;
import de.project.cinemaapi.data.MovieRepository;
import de.project.cinemaapi.data.ShowRepository;
import de.project.cinemaapi.generated.model.*;
import de.project.cinemaapi.persistence.CinemaHall;
import de.project.cinemaapi.persistence.Movie;
import de.project.cinemaapi.persistence.Show;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class AdminService {

    private final CinemaHallRepository cinemaHallRepository;
    private final MovieRepository movieRepository;
    private final ShowRepository showRepository;

    public AdminService(CinemaHallRepository cinemaHallRepository, MovieRepository movieRepository, ShowRepository showRepository) {
        this.cinemaHallRepository = cinemaHallRepository;
        this.movieRepository = movieRepository;
        this.showRepository = showRepository;
    }

    public CinemaTO getAllCinemaHalls() {
        List<HallTO> hallTOList = new ArrayList<>();
        for (CinemaHall ch: cinemaHallRepository.getAllCinemaHalls()) {
            HallTO hall = mapToHallTO(ch);
            hallTOList.add(hall);
        }

        CinemaTO cinemaTO = new CinemaTO();
        cinemaTO.setHallList(hallTOList);

        return cinemaTO;
    }

    public AllMoviesTO getAllMovies() {
        List<MovieTO> movieTOList = new ArrayList<>();
        for (Movie movie: movieRepository.getAllMovies()) {
            MovieTO movieTO = mapToMovieTO(movie);
            movieTOList.add(movieTO);
        }

        AllMoviesTO allMoviesTO = new AllMoviesTO();
        allMoviesTO.setMovieList(movieTOList);

        return allMoviesTO;
    }

    public void saveMovie(String moviename) {
        movieRepository.saveMovie(new Movie(moviename));
    }

    public void saveShow(ShowPushTO body) {
        Movie movie = movieRepository.getMovie(body.getMovieId());
        CinemaHall cinemaHall = cinemaHallRepository.getCinemaHall(body.getCinemaId());
        Show show = new Show(cinemaHall, movie, body.isIs3D(), body.getTime());
        showRepository.saveShow(show);
    }



    /*
    Mapping
     */
    public HallTO mapToHallTO(CinemaHall ch) {
        HallTO hallTO = new HallTO();
        hallTO.setCinemaHallId(ch.getCinemaHallId());
        hallTO.setBoxSeats(ch.getBoxSeats());
        hallTO.setParquetSeats(ch.getParquetSeats());
        return hallTO;
    }

    public MovieTO mapToMovieTO(Movie movie) {
        MovieTO movieTO = new MovieTO();
        movieTO.setMoviename(movie.getMovieName());
        movieTO.setMovieId(movie.getMovieId());
        return movieTO;
    }



}
