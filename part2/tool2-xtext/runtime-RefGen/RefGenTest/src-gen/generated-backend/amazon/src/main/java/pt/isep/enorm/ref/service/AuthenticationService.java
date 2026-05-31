package pt.isep.enorm.ref.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.repository.UserTypeRepository;
import pt.isep.enorm.ref.security.JwtService;
import pt.isep.enorm.ref.service.generated.GeneratedAuthenticationService;

@Service
public class AuthenticationService extends GeneratedAuthenticationService {
    public AuthenticationService(UserTypeRepository userRepository,
                                 PasswordEncoder passwordEncoder, JwtService jwtService) {
        super(userRepository, passwordEncoder, jwtService);
    }
}
