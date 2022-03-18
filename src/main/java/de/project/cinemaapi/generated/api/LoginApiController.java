package de.project.cinemaapi.generated.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.project.cinemaapi.generated.model.LoginResponseTO;
import de.project.cinemaapi.generated.model.LoginTO;
import de.project.cinemaapi.services.UserService;
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
public class LoginApiController implements LoginApi {

    private static final Logger log = LoggerFactory.getLogger(LoginApiController.class);

    private final UserService userService;

    public LoginApiController(UserService userService) {
        this.userService = userService;
    }

    public ResponseEntity<LoginResponseTO> login(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody LoginTO body) {
        return ResponseEntity.ok(userService.checkLogin(body));
    }

}
