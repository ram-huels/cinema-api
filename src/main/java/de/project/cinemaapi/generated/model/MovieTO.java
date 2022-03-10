package de.project.cinemaapi.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * MovieTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-03-10T12:00:26.623Z[GMT]")


public class MovieTO   {
  @JsonProperty("moviename")
  private String moviename = null;

  @JsonProperty("movieId")
  private Integer movieId = null;

  public MovieTO moviename(String moviename) {
    this.moviename = moviename;
    return this;
  }

  /**
   * Name of the movie
   * @return moviename
   **/
  @Schema(description = "Name of the movie")
  
    public String getMoviename() {
    return moviename;
  }

  public void setMoviename(String moviename) {
    this.moviename = moviename;
  }

  public MovieTO movieId(Integer movieId) {
    this.movieId = movieId;
    return this;
  }

  /**
   * Id of the movie
   * @return movieId
   **/
  @Schema(description = "Id of the movie")
  
    public Integer getMovieId() {
    return movieId;
  }

  public void setMovieId(Integer movieId) {
    this.movieId = movieId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MovieTO movieTO = (MovieTO) o;
    return Objects.equals(this.moviename, movieTO.moviename) &&
        Objects.equals(this.movieId, movieTO.movieId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(moviename, movieId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MovieTO {\n");
    
    sb.append("    moviename: ").append(toIndentedString(moviename)).append("\n");
    sb.append("    movieId: ").append(toIndentedString(movieId)).append("\n");
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
