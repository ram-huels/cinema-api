package de.project.cinemaapi.generated.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.project.cinemaapi.generated.model.BookingTO;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import javax.annotation.Generated;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-03-10T12:00:26.623Z[GMT]")
@RestController
public class BookTicketInformationApiController implements BookTicketInformationApi {

    private static final Logger log = LoggerFactory.getLogger(BookTicketInformationApiController.class);

    @Autowired
    public BookTicketInformationApiController() {}

    public ResponseEntity<BookingTO> bookingInfo(@Parameter(in = ParameterIn.PATH, description = "Id of the show", required=true, schema=@Schema()) @PathVariable("showId") Integer showId) {
        return new ResponseEntity<BookingTO>(HttpStatus.NOT_IMPLEMENTED);
    }

}
