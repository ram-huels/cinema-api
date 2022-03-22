package de.project.cinemaapi.generated.api;

import de.project.cinemaapi.generated.model.ShowPushTO;
import de.project.cinemaapi.services.AdminService;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Generated;
import javax.validation.Valid;

@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-03-10T12:00:26.623Z[GMT]")
@RestController
public class PutShowApiController implements PutShowApi {

    private static final Logger log = LoggerFactory.getLogger(PutShowApiController.class);

    private final AdminService adminService;

    public PutShowApiController(AdminService adminService) {
        this.adminService = adminService;
    }

    public ResponseEntity<Void> putShow(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody ShowPushTO body) {
        adminService.saveShow(body);
        return ResponseEntity.ok().build();
    }

}
