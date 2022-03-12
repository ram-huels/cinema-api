package de.project.cinemaapi.services;

import de.project.cinemaapi.generated.model.HomepageTO;
import org.springframework.stereotype.Service;

@Service
public class HomepageService {

    public HomepageService() {
    }

    public HomepageTO createHomepageData() {
        return new HomepageTO();
    }
}
