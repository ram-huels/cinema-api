/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.33).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package de.project.cinemaapi.generated.api;

import de.project.cinemaapi.generated.model.BookingTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-03-10T12:00:26.623Z[GMT]")
@Validated
public interface BookTicketInformationApi {

    @Operation(summary = "Information of movie", description = "Shows information for booking a ticket", tags={ "booking" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A show has been found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = BookingTO.class))),
        
        @ApiResponse(responseCode = "404", description = "No show has been found for this id") })
    @RequestMapping(value = "/bookTicketInformation/{showId}",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<BookingTO> bookingInfo(@Parameter(in = ParameterIn.PATH, description = "Id of the show", required=true, schema=@Schema()) @PathVariable("showId") Integer showId);

}

