package pt.isep.enorm.ref.amazonscenario.service.generated;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.amazonscenario.domain.AmazonscenarioUser;
import pt.isep.enorm.ref.amazonscenario.domain.enums.Role;
import pt.isep.enorm.ref.amazonscenario.repository.AmazonscenarioUserRepository;

@Service
public class GeneratedAuthenticationService {
    private final AmazonscenarioUserRepository userRepository;

    public GeneratedAuthenticationService(AmazonscenarioUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public AmazonscenarioUser register(String username, String password, Role role) {
        AmazonscenarioUser user = new AmazonscenarioUser();
        user.setUsername(username);
        user.setPassword(password);
        user.setRole(role);
        return userRepository.save(user);
    }
}
