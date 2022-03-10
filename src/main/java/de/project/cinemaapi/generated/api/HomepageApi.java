/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.33).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package de.project.cinemaapi.generated.api;

import de.project.cinemaapi.generated.model.HomepageTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-03-10T12:00:26.623Z[GMT]")
@Validated
public interface HomepageApi {

    @Operation(summary = "Provides information for homepage", description = "Provides info for all shows in the next week", tags={ "homepage" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Homepage information has been delivered", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HomepageTO.class))) })
    @RequestMapping(value = "/homepage",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<HomepageTO> homepagePost();

}

