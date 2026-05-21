package pt.isep.enorm.ref.amazon.service.generated;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.amazon.domain.AmazonUser;
import pt.isep.enorm.ref.amazon.domain.enums.Role;
import pt.isep.enorm.ref.amazon.repository.AmazonUserRepository;

@Service
public class GeneratedAuthenticationService {
    private final AmazonUserRepository userRepository;

    public GeneratedAuthenticationService(AmazonUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public AmazonUser register(String username, String password, Role role) {
        AmazonUser user = new AmazonUser();
        user.setUsername(username);
        user.setPassword(password);
        user.setRole(role);
        return userRepository.save(user);
    }
}
