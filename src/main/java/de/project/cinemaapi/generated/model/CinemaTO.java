package de.project.cinemaapi.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * CinemaTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-03-12T16:07:18.064Z[GMT]")


public class CinemaTO   {
  @JsonProperty("hallList")
  @Valid
  private List<HallTO> hallList = null;

  public CinemaTO hallList(List<HallTO> hallList) {
    this.hallList = hallList;
    return this;
  }

  public CinemaTO addHallListItem(HallTO hallListItem) {
    if (this.hallList == null) {
      this.hallList = new ArrayList<HallTO>();
    }
    this.hallList.add(hallListItem);
    return this;
  }

  /**
   * List of all cinema halls
   * @return hallList
   **/
  @Schema(description = "List of all cinema halls")
  @Valid
  public List<HallTO> getHallList() {
    return hallList;
  }

  public void setHallList(List<HallTO> hallList) {
    this.hallList = hallList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CinemaTO cinemaTO = (CinemaTO) o;
    return Objects.equals(this.hallList, cinemaTO.hallList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hallList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CinemaTO {\n");

    sb.append("    hallList: ").append(toIndentedString(hallList)).append("\n");
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
