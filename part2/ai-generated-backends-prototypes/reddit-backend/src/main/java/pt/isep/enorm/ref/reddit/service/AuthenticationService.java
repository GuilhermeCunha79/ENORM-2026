package pt.isep.enorm.ref.reddit.service;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import pt.isep.enorm.ref.reddit.repository.RedditUserRepository;
import pt.isep.enorm.ref.reddit.security.JwtService;
import pt.isep.enorm.ref.reddit.service.generated.GeneratedAuthenticationService;

@Service
public class AuthenticationService extends GeneratedAuthenticationService {

    public AuthenticationService(
        RedditUserRepository redditUserRepository,
        PasswordEncoder passwordEncoder,
        AuthenticationManager authenticationManager,
        JwtService jwtService
    ) {
        super(redditUserRepository, passwordEncoder, authenticationManager, jwtService);
    }
}


