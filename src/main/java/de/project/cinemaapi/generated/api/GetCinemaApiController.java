package de.project.cinemaapi.generated.api;

import de.project.cinemaapi.generated.model.CinemaTO;
import de.project.cinemaapi.services.AdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Generated;

@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-03-10T12:00:26.623Z[GMT]")
@RestController
public class GetCinemaApiController implements GetCinemaApi {

    private static final Logger log = LoggerFactory.getLogger(GetCinemaApiController.class);

    private AdminService adminService;

    public GetCinemaApiController(AdminService adminService) {
        this.adminService = adminService;
    }

    public ResponseEntity<CinemaTO> getCinema() {
        return ResponseEntity.ok(adminService.getAllCinemaHalls());
    }

}
