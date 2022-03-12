package de.project.cinemaapi.generated.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.project.cinemaapi.generated.model.HomepageTO;
import de.project.cinemaapi.services.HomepageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Generated;

@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-03-10T12:00:26.623Z[GMT]")
@RestController
public class HomepageApiController implements HomepageApi {

    private static final Logger log = LoggerFactory.getLogger(HomepageApiController.class);

    private HomepageService homepageService;

    @Autowired
    public HomepageApiController(HomepageService homepageService) {
        this.homepageService = homepageService;
    }

    public ResponseEntity<HomepageTO> homepagePost() {
        return ResponseEntity.ok(homepageService.createHomepageData());
    }

}
