package pt.isep.enorm.ref.reddit.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.reddit.repository.RedditUserRepository;
import pt.isep.enorm.ref.reddit.security.JwtService;
import pt.isep.enorm.ref.reddit.service.generated.GeneratedAuthenticationService;

@Service
public class AuthenticationService extends GeneratedAuthenticationService {
    public AuthenticationService(RedditUserRepository userRepository,
                                 PasswordEncoder passwordEncoder, JwtService jwtService) {
        super(userRepository, passwordEncoder, jwtService);
    }
}
