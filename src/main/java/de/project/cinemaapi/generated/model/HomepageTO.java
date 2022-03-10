package de.project.cinemaapi.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * HomepageTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-03-10T12:00:26.623Z[GMT]")


public class HomepageTO   {
  @JsonProperty("movieList")
  @Valid
  private List<MovieListTO> movieList = null;

  public HomepageTO movieList(List<MovieListTO> movieList) {
    this.movieList = movieList;
    return this;
  }

  public HomepageTO addMovieListItem(MovieListTO movieListItem) {
    if (this.movieList == null) {
      this.movieList = new ArrayList<MovieListTO>();
    }
    this.movieList.add(movieListItem);
    return this;
  }

  /**
   * A list of movies
   * @return movieList
   **/
  @Schema(description = "A list of movies")
      @Valid
    public List<MovieListTO> getMovieList() {
    return movieList;
  }

  public void setMovieList(List<MovieListTO> movieList) {
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
    HomepageTO homepageTO = (HomepageTO) o;
    return Objects.equals(this.movieList, homepageTO.movieList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(movieList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HomepageTO {\n");
    
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
