package de.project.cinemaapi.generated.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.project.cinemaapi.generated.model.TicketPushTO;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Generated;
import javax.validation.Valid;

@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-03-10T12:00:26.623Z[GMT]")
@RestController
public class GetTicketpriceApiController implements GetTicketpriceApi {

    private static final Logger log = LoggerFactory.getLogger(GetTicketpriceApiController.class);

    @Autowired
    public GetTicketpriceApiController() {}

    public ResponseEntity<Integer> bookingPrice(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody TicketPushTO body) {
        return new ResponseEntity<Integer>(HttpStatus.NOT_IMPLEMENTED);
    }

}
