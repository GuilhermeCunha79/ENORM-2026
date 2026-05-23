package pt.isep.enorm.ref.youtube.service.generated;

import java.time.LocalDate;
import java.util.Objects;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.transaction.annotation.Transactional;

import pt.isep.enorm.ref.youtube.domain.YoutubeUser;
import pt.isep.enorm.ref.youtube.domain.enums.Role;
import pt.isep.enorm.ref.youtube.repository.YoutubeUserRepository;
import pt.isep.enorm.ref.youtube.security.JwtService;
import pt.isep.enorm.ref.youtube.service.projection.AuthenticationResult;
import pt.isep.enorm.ref.youtube.web.error.ResourceNotFoundException;

@Transactional(readOnly = true)
public abstract class GeneratedAuthenticationService {

    private final YoutubeUserRepository youtubeUserRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;

    protected GeneratedAuthenticationService(
        YoutubeUserRepository youtubeUserRepository,
        PasswordEncoder passwordEncoder,
        AuthenticationManager authenticationManager,
        JwtService jwtService
    ) {
        this.youtubeUserRepository = youtubeUserRepository;
        this.passwordEncoder = passwordEncoder;
        this.authenticationManager = authenticationManager;
        this.jwtService = jwtService;
    }

    @Transactional
    public AuthenticationResult register(YoutubeUser request) {
        Credentials credentials = validateRequest(request);

        if (youtubeUserRepository.existsByUsername(credentials.getUsername())) {
            throw new IllegalStateException("Username already exists.");
        }

        YoutubeUser user = new YoutubeUser();
        user.setUsername(credentials.getUsername());
        user.setPassword(passwordEncoder.encode(credentials.getPassword()));
        user.setRole(Role.GENERIC);
        user.setRegistrationDate(LocalDate.now());

        YoutubeUser savedUser = youtubeUserRepository.save(user);
        afterRegister(savedUser);
        return toAuthenticationResult(savedUser);
    }

    public AuthenticationResult login(YoutubeUser request) {
        Credentials credentials = validateRequest(request);

        authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(credentials.getUsername(), credentials.getPassword())
        );

        YoutubeUser user = youtubeUserRepository.findByUsername(credentials.getUsername())
            .orElseThrow(() -> new ResourceNotFoundException("User '%s' was not found.".formatted(credentials.getUsername())));

        return toAuthenticationResult(user);
    }

    protected void afterRegister(YoutubeUser savedUser) {
    }

    private Credentials validateRequest(YoutubeUser request) {
        Objects.requireNonNull(request, "request is required");

        String username = request.getUsername();
        String password = request.getPassword();

        if (username == null || username.isBlank()) {
            throw new IllegalArgumentException("Username is required.");
        }

        if (password == null || password.isBlank()) {
            throw new IllegalArgumentException("Password is required.");
        }

        return new Credentials(username.trim(), password);
    }

    private static final class Credentials {
        private final String username;
        private final String password;

        private Credentials(String username, String password) {
            this.username = username;
            this.password = password;
        }

        private String getUsername() {
            return username;
        }

        private String getPassword() {
            return password;
        }
    }

    private AuthenticationResult toAuthenticationResult(YoutubeUser user) {
        String token = jwtService.generateToken(user);
        return new AuthenticationResult(token, user.getUsername(), user.getRole().name());
    }
}

