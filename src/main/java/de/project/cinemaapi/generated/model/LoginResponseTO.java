package de.project.cinemaapi.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * LoginResponseTO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-03-18T13:03:38.316Z[GMT]")


public class LoginResponseTO   {
    @JsonProperty("isAdmin")
    private Boolean isAdmin = null;

    @JsonProperty("isCorrect")
    private Boolean isCorrect = null;

    @JsonProperty("userId")
    private Integer userId = null;

    public LoginResponseTO isAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
        return this;
    }

    /**
     * Determines the authorization of user
     * @return isAdmin
     **/
    @Schema(description = "Determines the authorization of user")

    public Boolean isIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public LoginResponseTO isCorrect(Boolean isCorrect) {
        this.isCorrect = isCorrect;
        return this;
    }

    /**
     * Determines the correctness of login data
     * @return isCorrect
     **/
    @Schema(description = "Determines the correctness of login data")

    public Boolean isIsCorrect() {
        return isCorrect;
    }

    public void setIsCorrect(Boolean isCorrect) {
        this.isCorrect = isCorrect;
    }

    public LoginResponseTO userId(Integer userId) {
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
        LoginResponseTO loginResponseTO = (LoginResponseTO) o;
        return Objects.equals(this.isAdmin, loginResponseTO.isAdmin) &&
                Objects.equals(this.isCorrect, loginResponseTO.isCorrect) &&
                Objects.equals(this.userId, loginResponseTO.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isAdmin, isCorrect, userId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoginResponseTO {\n");

        sb.append("    isAdmin: ").append(toIndentedString(isAdmin)).append("\n");
        sb.append("    isCorrect: ").append(toIndentedString(isCorrect)).append("\n");
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

