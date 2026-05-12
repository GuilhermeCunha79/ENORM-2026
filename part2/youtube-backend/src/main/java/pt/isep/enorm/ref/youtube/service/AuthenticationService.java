package pt.isep.enorm.ref.youtube.service;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import pt.isep.enorm.ref.youtube.repository.YoutubeUserRepository;
import pt.isep.enorm.ref.youtube.security.JwtService;
import pt.isep.enorm.ref.youtube.service.generated.GeneratedAuthenticationService;

@Service
public class AuthenticationService extends GeneratedAuthenticationService {

    public AuthenticationService(
        YoutubeUserRepository youtubeUserRepository,
        PasswordEncoder passwordEncoder,
        AuthenticationManager authenticationManager,
        JwtService jwtService
    ) {
        super(youtubeUserRepository, passwordEncoder, authenticationManager, jwtService);
    }
}

