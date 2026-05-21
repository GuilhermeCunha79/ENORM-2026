package pt.isep.enorm.ref.amazonscenario.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.amazonscenario.repository.AmazonscenarioUserRepository;
import pt.isep.enorm.ref.amazonscenario.service.generated.GeneratedAuthenticationService;

@Service
public class AuthenticationService extends GeneratedAuthenticationService {
    public AuthenticationService(AmazonscenarioUserRepository userRepository) {
        super(userRepository);
    }
}
