/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.33).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package de.project.cinemaapi.generated.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-03-10T12:00:26.623Z[GMT]")
@Validated
public interface CancelTicketApi {

    @Operation(summary = "Deletes ticket", description = "Deletes a ticket", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The ticket has been canceled"),
        
        @ApiResponse(responseCode = "404", description = "No ticket has been found for this ticket") })
    @RequestMapping(value = "/cancelTicket/{ticketId}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> cancelTicketDelete(@Parameter(in = ParameterIn.PATH, description = "Id of the show", required=true, schema=@Schema()) @PathVariable("ticketId") Integer ticketId);

}

