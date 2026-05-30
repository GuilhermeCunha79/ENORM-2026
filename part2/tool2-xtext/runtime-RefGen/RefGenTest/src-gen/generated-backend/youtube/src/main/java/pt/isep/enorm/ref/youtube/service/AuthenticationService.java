package pt.isep.enorm.ref.youtube.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.youtube.repository.YoutubeUserRepository;
import pt.isep.enorm.ref.youtube.security.JwtService;
import pt.isep.enorm.ref.youtube.service.generated.GeneratedAuthenticationService;

@Service
public class AuthenticationService extends GeneratedAuthenticationService {
    public AuthenticationService(YoutubeUserRepository userRepository,
                                 PasswordEncoder passwordEncoder, JwtService jwtService) {
        super(userRepository, passwordEncoder, jwtService);
    }
}
