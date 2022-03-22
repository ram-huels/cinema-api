package de.project.cinemaapi.services;

import de.project.cinemaapi.data.MovieRepository;
import de.project.cinemaapi.data.ShowRepository;
import de.project.cinemaapi.generated.model.DayTO;
import de.project.cinemaapi.generated.model.HomepageTO;
import de.project.cinemaapi.generated.model.MovieListTO;
import de.project.cinemaapi.generated.model.ShowTO;
import de.project.cinemaapi.persistence.Movie;
import de.project.cinemaapi.persistence.Show;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class HomepageService {

    private final ShowRepository showRepository;

    private final MovieRepository movieRepository;

    public HomepageService(ShowRepository showRepository, MovieRepository movieRepository) {
        this.showRepository = showRepository;
        this.movieRepository = movieRepository;
    }

    public HomepageTO createHomepageData() {
        List<MovieListTO> allMovieInformation = new ArrayList<>();
        for (Movie movie: movieRepository.getAllMovies()) {
             List<DayTO> allSevenDays = new ArrayList<>();

            for(int i = 0; i < 7; i++) {
                LocalDateTime now = LocalDateTime.now().plusDays(i);
                List<Show> showsOfTheDay = showRepository.getShowsOnTheDay(now, movie.getMovieId());
                showsOfTheDay.sort(Comparator.comparing(Show::getStartTime));
                DayTO day = mapToDayTO(showsOfTheDay);
                allSevenDays.add(day);
            }

            MovieListTO movieListTO = new MovieListTO();
            movieListTO.setMovieTitle(movie.getMovieName());
            movieListTO.setAllShowsOfTheDay(allSevenDays);

            allMovieInformation.add(movieListTO);
        }

        HomepageTO homepageTO = new HomepageTO();
        homepageTO.setMovieList(allMovieInformation);

        return homepageTO;
    }

    public DayTO mapToDayTO(List<Show> showsOfTheDay) {
        if (showsOfTheDay == null) {
            return null;
        }
        List<ShowTO> showTOList = new ArrayList<>();
        for (Show show: showsOfTheDay) {
            ShowTO showTO = new ShowTO();
            showTO.setShowId(show.getShowId());
            showTO.setTime(show.getStartTime().toString());
            showTOList.add(showTO);
        }

        DayTO dayTO = new DayTO();
        dayTO.setShows(showTOList);
        return dayTO;
    }
}
