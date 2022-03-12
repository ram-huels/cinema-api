package de.project.cinemaapi.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
/**
 * HallTO
 */
@Validated
public class HallTO   {
    @JsonProperty("cinemaHallId")
    private Integer cinemaHallId = null;

    @JsonProperty("boxSeats")
    private Integer boxSeats = null;

    @JsonProperty("parquetSeats")
    private Integer parquetSeats = null;

    public HallTO cinemaHallId(Integer cinemaHallId) {
        this.cinemaHallId = cinemaHallId;
        return this;
    }

    /**
     * Id of the cinema hall
     * @return cinemaHallId
     **/
    @Schema(description = "Id of the cinema hall")

    public Integer getCinemaHallId() {
        return cinemaHallId;
    }

    public void setCinemaHallId(Integer cinemaHallId) {
        this.cinemaHallId = cinemaHallId;
    }

    public HallTO boxSeats(Integer boxSeats) {
        this.boxSeats = boxSeats;
        return this;
    }

    /**
     * Number of box seats
     * @return boxSeats
     **/
    @Schema(description = "Number of box seats")

    public Integer getBoxSeats() {
        return boxSeats;
    }

    public void setBoxSeats(Integer boxSeats) {
        this.boxSeats = boxSeats;
    }

    public HallTO parquetSeats(Integer parquetSeats) {
        this.parquetSeats = parquetSeats;
        return this;
    }

    /**
     * Number of parquet seats
     * @return parquetSeats
     **/
    @Schema(description = "Number of parquet seats")

    public Integer getParquetSeats() {
        return parquetSeats;
    }

    public void setParquetSeats(Integer parquetSeats) {
        this.parquetSeats = parquetSeats;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HallTO hallTO = (HallTO) o;
        return Objects.equals(this.cinemaHallId, hallTO.cinemaHallId) &&
                Objects.equals(this.boxSeats, hallTO.boxSeats) &&
                Objects.equals(this.parquetSeats, hallTO.parquetSeats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cinemaHallId, boxSeats, parquetSeats);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HallTO {\n");

        sb.append("    cinemaHallId: ").append(toIndentedString(cinemaHallId)).append("\n");
        sb.append("    boxSeats: ").append(toIndentedString(boxSeats)).append("\n");
        sb.append("    parquetSeats: ").append(toIndentedString(parquetSeats)).append("\n");
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

