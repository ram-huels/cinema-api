package de.project.cinemaapi.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * MovieListTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-03-10T12:00:26.623Z[GMT]")


public class MovieListTO   {
  @JsonProperty("movieTitle")
  private String movieTitle = null;

  @JsonProperty("allShowsOfTheDay")
  @Valid
  private List<DayTO> allShowsOfTheDay = null;

  public MovieListTO movieTitle(String movieTitle) {
    this.movieTitle = movieTitle;
    return this;
  }

  /**
   * Title of the movie
   * @return movieTitle
   **/
  @Schema(description = "Title of the movie")
  
    public String getMovieTitle() {
    return movieTitle;
  }

  public void setMovieTitle(String movieTitle) {
    this.movieTitle = movieTitle;
  }

  public MovieListTO allShowsOfTheDay(List<DayTO> allShowsOfTheDay) {
    this.allShowsOfTheDay = allShowsOfTheDay;
    return this;
  }

  public MovieListTO addAllShowsOfTheDayItem(DayTO allShowsOfTheDayItem) {
    if (this.allShowsOfTheDay == null) {
      this.allShowsOfTheDay = new ArrayList<DayTO>();
    }
    this.allShowsOfTheDay.add(allShowsOfTheDayItem);
    return this;
  }

  /**
   * A list with the programm for a day of the week of specific movie
   * @return allShowsOfTheDay
   **/
  @Schema(description = "A list with the programm for a day of the week of specific movie")
      @Valid
    public List<DayTO> getAllShowsOfTheDay() {
    return allShowsOfTheDay;
  }

  public void setAllShowsOfTheDay(List<DayTO> allShowsOfTheDay) {
    this.allShowsOfTheDay = allShowsOfTheDay;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MovieListTO movieListTO = (MovieListTO) o;
    return Objects.equals(this.movieTitle, movieListTO.movieTitle) &&
        Objects.equals(this.allShowsOfTheDay, movieListTO.allShowsOfTheDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(movieTitle, allShowsOfTheDay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MovieListTO {\n");
    
    sb.append("    movieTitle: ").append(toIndentedString(movieTitle)).append("\n");
    sb.append("    allShowsOfTheDay: ").append(toIndentedString(allShowsOfTheDay)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
