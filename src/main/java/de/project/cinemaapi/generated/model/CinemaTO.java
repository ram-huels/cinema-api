package de.project.cinemaapi.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CinemaTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-03-10T12:00:26.623Z[GMT]")


public class CinemaTO   {
  @JsonProperty("hallList")
  @Valid
  private List<Integer> hallList = null;

  public CinemaTO hallList(List<Integer> hallList) {
    this.hallList = hallList;
    return this;
  }

  public CinemaTO addHallListItem(Integer hallListItem) {
    if (this.hallList == null) {
      this.hallList = new ArrayList<Integer>();
    }
    this.hallList.add(hallListItem);
    return this;
  }

  /**
   * List of all cinema halls
   * @return hallList
   **/
  @Schema(description = "List of all cinema halls")
  
    public List<Integer> getHallList() {
    return hallList;
  }

  public void setHallList(List<Integer> hallList) {
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
