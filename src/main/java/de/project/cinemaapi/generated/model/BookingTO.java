package de.project.cinemaapi.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BookingTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-03-10T12:00:26.623Z[GMT]")


public class BookingTO   {
  @JsonProperty("moviename")
  private String moviename = null;

  @JsonProperty("time")
  private String time = null;

  @JsonProperty("is3D")
  private Boolean is3D = null;

  public BookingTO moviename(String moviename) {
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

  public BookingTO time(String time) {
    this.time = time;
    return this;
  }

  /**
   * Time of the show
   * @return time
   **/
  @Schema(description = "Time of the show")
  
    public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public BookingTO is3D(Boolean is3D) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookingTO bookingTO = (BookingTO) o;
    return Objects.equals(this.moviename, bookingTO.moviename) &&
        Objects.equals(this.time, bookingTO.time) &&
        Objects.equals(this.is3D, bookingTO.is3D);
  }

  @Override
  public int hashCode() {
    return Objects.hash(moviename, time, is3D);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookingTO {\n");
    
    sb.append("    moviename: ").append(toIndentedString(moviename)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    is3D: ").append(toIndentedString(is3D)).append("\n");
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
