package de.project.cinemaapi.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * AllMoviesTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-03-10T12:00:26.623Z[GMT]")


public class AllMoviesTO   {
  @JsonProperty("movieList")
  @Valid
  private List<MovieTO> movieList = null;

  public AllMoviesTO movieList(List<MovieTO> movieList) {
    this.movieList = movieList;
    return this;
  }

  public AllMoviesTO addMovieListItem(MovieTO movieListItem) {
    if (this.movieList == null) {
      this.movieList = new ArrayList<MovieTO>();
    }
    this.movieList.add(movieListItem);
    return this;
  }

  /**
   * List of all movies
   * @return movieList
   **/
  @Schema(description = "List of all movies")
      @Valid
    public List<MovieTO> getMovieList() {
    return movieList;
  }

  public void setMovieList(List<MovieTO> movieList) {
    this.movieList = movieList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllMoviesTO allMoviesTO = (AllMoviesTO) o;
    return Objects.equals(this.movieList, allMoviesTO.movieList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(movieList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllMoviesTO {\n");
    
    sb.append("    movieList: ").append(toIndentedString(movieList)).append("\n");
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
