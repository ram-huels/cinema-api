package de.project.cinemaapi.generated.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * UserTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-03-10T12:00:26.623Z[GMT]")
public class UserTO   {
  @JsonProperty("username")
  private Integer username = null;

  @JsonProperty("tickets")
  @Valid
  private List<TicketTO> tickets = null;

  public UserTO username(Integer username) {
    this.username = username;
    return this;
  }

  /**
   * Id of the user
   * @return username
   **/
  @Schema(description = "Id of the user")
  
    public Integer getUsername() {
    return username;
  }

  public void setUsername(Integer username) {
    this.username = username;
  }

  public UserTO tickets(List<TicketTO> tickets) {
    this.tickets = tickets;
    return this;
  }

  public UserTO addTicketsItem(TicketTO ticketsItem) {
    if (this.tickets == null) {
      this.tickets = new ArrayList<TicketTO>();
    }
    this.tickets.add(ticketsItem);
    return this;
  }

  /**
   * Get tickets
   * @return tickets
   **/
  @Schema(description = "")
      @Valid
    public List<TicketTO> getTickets() {
    return tickets;
  }

  public void setTickets(List<TicketTO> tickets) {
    this.tickets = tickets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserTO userTO = (UserTO) o;
    return Objects.equals(this.username, userTO.username) &&
        Objects.equals(this.tickets, userTO.tickets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, tickets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserTO {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    tickets: ").append(toIndentedString(tickets)).append("\n");
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
