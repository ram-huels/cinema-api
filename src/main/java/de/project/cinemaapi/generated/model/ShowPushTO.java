package de.project.cinemaapi.generated.model;

import java.time.LocalDateTime;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * ShowPushTO
 */
@Validated


public class ShowPushTO   {
  @JsonProperty("movieId")
  private Integer movieId = null;

  @JsonProperty("cinemaId")
  private Integer cinemaId = null;

  @JsonProperty("is3D")
  private Boolean is3D = null;

  @JsonProperty("time")
  private LocalDateTime time = null;

  public ShowPushTO movieId(Integer movieId) {
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

  public ShowPushTO cinemaId(Integer cinemaId) {
    this.cinemaId = cinemaId;
    return this;
  }

  /**
   * Id of the cinema hall
   * @return cinemaId
   **/
  @Schema(description = "Id of the cinema hall")
  
    public Integer getCinemaId() {
    return cinemaId;
  }

  public void setCinemaId(Integer cinemaId) {
    this.cinemaId = cinemaId;
  }

  public ShowPushTO is3D(Boolean is3D) {
    this.is3D = is3D;
    return this;
  }

  /**
   * Is the show in 3D?
   * @return is3D
   **/
  @Schema(description = "Is the show in 3D?")
  
    public Boolean isIs3D() {
    return is3D;
  }

  public void setIs3D(Boolean is3D) {
    this.is3D = is3D;
  }

  public ShowPushTO time(LocalDateTime time) {
    this.time = time;
    return this;
  }

  /**
   * Date of the show
   * @return time
   **/
  @Schema(description = "Date of the show")
  
    @Valid
    public LocalDateTime getTime() {
    return time;
  }

  public void setTime(LocalDateTime time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShowPushTO showPushTO = (ShowPushTO) o;
    return Objects.equals(this.movieId, showPushTO.movieId) &&
        Objects.equals(this.cinemaId, showPushTO.cinemaId) &&
        Objects.equals(this.is3D, showPushTO.is3D) &&
        Objects.equals(this.time, showPushTO.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(movieId, cinemaId, is3D, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShowPushTO {\n");
    
    sb.append("    movieId: ").append(toIndentedString(movieId)).append("\n");
    sb.append("    cinemaId: ").append(toIndentedString(cinemaId)).append("\n");
    sb.append("    is3D: ").append(toIndentedString(is3D)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
