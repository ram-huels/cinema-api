package de.project.cinemaapi.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * TicketTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-03-10T12:00:26.623Z[GMT]")


public class TicketTO   {
  @JsonProperty("showId")
  private Integer showId = null;

  @JsonProperty("time")
  private String time = null;

  @JsonProperty("moviename")
  private String moviename = null;

  public TicketTO showId(Integer showId) {
    this.showId = showId;
    return this;
  }

  /**
   * Id of the show
   * @return showId
   **/
  @Schema(description = "Id of the show")
  
    public Integer getShowId() {
    return showId;
  }

  public void setShowId(Integer showId) {
    this.showId = showId;
  }

  public TicketTO time(String time) {
    this.time = time;
    return this;
  }

  /**
   * Time the show occurs
   * @return time
   **/
  @Schema(description = "Time the show occurs")
  
    public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public TicketTO moviename(String moviename) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TicketTO ticketTO = (TicketTO) o;
    return Objects.equals(this.showId, ticketTO.showId) &&
        Objects.equals(this.time, ticketTO.time) &&
        Objects.equals(this.moviename, ticketTO.moviename);
  }

  @Override
  public int hashCode() {
    return Objects.hash(showId, time, moviename);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TicketTO {\n");
    
    sb.append("    showId: ").append(toIndentedString(showId)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    moviename: ").append(toIndentedString(moviename)).append("\n");
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
