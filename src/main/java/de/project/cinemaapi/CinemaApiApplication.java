package de.project.cinemaapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import springfox.documentation.oas.annotations.EnableOpenApi;

@EnableOpenApi
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class CinemaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CinemaApiApplication.class, args);
	}

}
