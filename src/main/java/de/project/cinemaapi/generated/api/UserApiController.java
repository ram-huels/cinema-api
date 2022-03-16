package de.project.cinemaapi.generated.api;

import de.project.cinemaapi.generated.model.UserTO;
import de.project.cinemaapi.services.UserService;
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
public class UserApiController implements UserApi {

    private static final Logger log = LoggerFactory.getLogger(UserApiController.class);

    private final UserService userService;

    public UserApiController(UserService userService) {
        this.userService = userService;
    }

    public ResponseEntity<UserTO> userPost(@Parameter(in = ParameterIn.PATH, description = "Id of the user", required=true, schema=@Schema()) @PathVariable("userId") Integer userId) {
        return ResponseEntity.ok(userService.deliverUserInformation(userId));
    }

}
