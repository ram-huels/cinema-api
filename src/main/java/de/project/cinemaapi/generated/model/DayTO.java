package de.project.cinemaapi.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * DayTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-03-10T12:00:26.623Z[GMT]")


public class DayTO   {
  @JsonProperty("shows")
  @Valid
  private List<ShowTO> shows = null;

  public DayTO shows(List<ShowTO> shows) {
    this.shows = shows;
    return this;
  }

  public DayTO addShowsItem(ShowTO showsItem) {
    if (this.shows == null) {
      this.shows = new ArrayList<ShowTO>();
    }
    this.shows.add(showsItem);
    return this;
  }

  /**
   * A list of every show for the day
   * @return shows
   **/
  @Schema(description = "A list of every show for the day")
      @Valid
    public List<ShowTO> getShows() {
    return shows;
  }

  public void setShows(List<ShowTO> shows) {
    this.shows = shows;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DayTO dayTO = (DayTO) o;
    return Objects.equals(this.shows, dayTO.shows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DayTO {\n");
    
    sb.append("    shows: ").append(toIndentedString(shows)).append("\n");
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
