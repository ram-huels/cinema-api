package de.project.cinemaapi.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * TicketTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-03-18T13:26:07.104Z[GMT]")


public class TicketTO   {
  @JsonProperty("showId")
  private Integer showId = null;

  @JsonProperty("ticketId")
  private Integer ticketId = null;

  @JsonProperty("price")
  private Double price = null;

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

  public TicketTO ticketId(Integer ticketId) {
    this.ticketId = ticketId;
    return this;
  }

  /**
   * Id of the ticket
   * @return ticketId
   **/
  @Schema(description = "Id of the ticket")

  public Integer getTicketId() {
    return ticketId;
  }

  public void setTicketId(Integer ticketId) {
    this.ticketId = ticketId;
  }

  public TicketTO price(Double price) {
    this.price = price;
    return this;
  }

  /**
   * Price of the ticket
   * @return price
   **/
  @Schema(description = "Price of the ticket")

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
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
            Objects.equals(this.ticketId, ticketTO.ticketId) &&
            Objects.equals(this.price, ticketTO.price) &&
            Objects.equals(this.time, ticketTO.time) &&
            Objects.equals(this.moviename, ticketTO.moviename);
  }

  @Override
  public int hashCode() {
    return Objects.hash(showId, ticketId, price, time, moviename);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TicketTO {\n");

    sb.append("    showId: ").append(toIndentedString(showId)).append("\n");
    sb.append("    ticketId: ").append(toIndentedString(ticketId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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
