package de.project.cinemaapi.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * TicketPushTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-03-10T12:00:26.623Z[GMT]")


public class TicketPushTO   {
  @JsonProperty("showId")
  private Integer showId = null;

  @JsonProperty("withDiscount")
  private Boolean withDiscount = null;

  @JsonProperty("isBoxSeat")
  private Boolean isBoxSeat = null;

  @JsonProperty("userId")
  private Integer userId = null;

  public TicketPushTO showId(Integer showId) {
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

  public TicketPushTO withDiscount(Boolean withDiscount) {
    this.withDiscount = withDiscount;
    return this;
  }

  /**
   * Is this ticket booked with a discount
   * @return withDiscount
   **/
  @Schema(description = "Is this ticket booked with a discount")

  public Boolean isWithDiscount() {
    return withDiscount;
  }

  public void setWithDiscount(Boolean withDiscount) {
    this.withDiscount = withDiscount;
  }

  public TicketPushTO isBoxSeat(Boolean isBoxSeat) {
    this.isBoxSeat = isBoxSeat;
    return this;
  }

  /**
   * Is this ticket for a boxseat
   * @return isBoxSeat
   **/
  @Schema(description = "Is this ticket for a boxseat")

  public Boolean isIsBoxSeat() {
    return isBoxSeat;
  }

  public void setIsBoxSeat(Boolean isBoxSeat) {
    this.isBoxSeat = isBoxSeat;
  }

  public TicketPushTO userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Id of the user
   * @return userId
   **/
  @Schema(description = "Id of the user")

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TicketPushTO ticketPushTO = (TicketPushTO) o;
    return Objects.equals(this.showId, ticketPushTO.showId) &&
            Objects.equals(this.withDiscount, ticketPushTO.withDiscount) &&
            Objects.equals(this.isBoxSeat, ticketPushTO.isBoxSeat) &&
            Objects.equals(this.userId, ticketPushTO.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(showId, withDiscount, isBoxSeat, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TicketPushTO {\n");

    sb.append("    showId: ").append(toIndentedString(showId)).append("\n");
    sb.append("    withDiscount: ").append(toIndentedString(withDiscount)).append("\n");
    sb.append("    isBoxSeat: ").append(toIndentedString(isBoxSeat)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
