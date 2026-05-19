package pt.isep.enorm.ref.amazon.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.amazon.repository.AmazonUserRepository;
import pt.isep.enorm.ref.amazon.service.generated.GeneratedAuthenticationService;

@Service
public class AuthenticationService extends GeneratedAuthenticationService {
    public AuthenticationService(AmazonUserRepository userRepository) {
        super(userRepository);
    }
}
