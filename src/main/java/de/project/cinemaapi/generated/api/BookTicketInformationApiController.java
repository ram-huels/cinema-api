package de.project.cinemaapi.generated.api;

import de.project.cinemaapi.generated.model.BookingTO;
import de.project.cinemaapi.services.BookingService;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import javax.annotation.Generated;
@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-03-10T12:00:26.623Z[GMT]")
@RestController
public class BookTicketInformationApiController implements BookTicketInformationApi {

    private static final Logger log = LoggerFactory.getLogger(BookTicketInformationApiController.class);

    private final BookingService bookingService;

    public BookTicketInformationApiController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public ResponseEntity<BookingTO> bookingInfo(@Parameter(in = ParameterIn.PATH, description = "Id of the show", required=true, schema=@Schema()) @PathVariable("showId") Integer showId) {
        return ResponseEntity.ok(bookingService.getBookingInformation(showId));
    }

}
