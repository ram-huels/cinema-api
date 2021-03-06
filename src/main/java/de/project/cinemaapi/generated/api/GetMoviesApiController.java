package de.project.cinemaapi.generated.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.project.cinemaapi.generated.model.AllMoviesTO;
import de.project.cinemaapi.services.AdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Generated;

@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-03-10T12:00:26.623Z[GMT]")
@RestController
public class GetMoviesApiController implements GetMoviesApi {

    private static final Logger log = LoggerFactory.getLogger(GetMoviesApiController.class);

    private final AdminService adminService;

    public GetMoviesApiController(AdminService adminService) {
        this.adminService = adminService;
    }

    public ResponseEntity<AllMoviesTO> getMovies() {
        return ResponseEntity.ok(adminService.getAllMovies());
    }

}
