package pt.isep.enorm.ref.amazon.service.generated;

import java.util.Objects;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.transaction.annotation.Transactional;

import pt.isep.enorm.ref.amazon.domain.AmazonUser;
import pt.isep.enorm.ref.amazon.domain.enums.Role;
import pt.isep.enorm.ref.amazon.repository.AmazonUserRepository;
import pt.isep.enorm.ref.amazon.security.JwtService;
import pt.isep.enorm.ref.amazon.service.projection.AuthenticationResult;
import pt.isep.enorm.ref.amazon.web.error.ResourceNotFoundException;

@Transactional(readOnly = true)
public abstract class GeneratedAuthenticationService {

    private final AmazonUserRepository amazonUserRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;

    protected GeneratedAuthenticationService(
        AmazonUserRepository amazonUserRepository,
        PasswordEncoder passwordEncoder,
        AuthenticationManager authenticationManager,
        JwtService jwtService
    ) {
        this.amazonUserRepository = amazonUserRepository;
        this.passwordEncoder = passwordEncoder;
        this.authenticationManager = authenticationManager;
        this.jwtService = jwtService;
    }

    @Transactional
    public AuthenticationResult register(AmazonUser request) {
        Credentials credentials = validateRequest(request);

        if (amazonUserRepository.existsByUsername(credentials.username())) {
            throw new IllegalStateException("Username already exists.");
        }

        AmazonUser user = new AmazonUser();
        user.setUsername(credentials.username());
        user.setPassword(passwordEncoder.encode(credentials.password()));
        user.setRole(Role.BUYER);
        user.setVerifiedBuyer(false);

        AmazonUser savedUser = amazonUserRepository.save(user);
        afterRegister(savedUser);
        return toAuthenticationResult(savedUser);
    }

    public AuthenticationResult login(AmazonUser request) {
        Credentials credentials = validateRequest(request);

        authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(credentials.username(), credentials.password())
        );

        AmazonUser user = amazonUserRepository.findByUsername(credentials.username())
            .orElseThrow(() -> new ResourceNotFoundException("User '%s' was not found.".formatted(credentials.username())));

        return toAuthenticationResult(user);
    }

    protected void afterRegister(AmazonUser savedUser) {
    }

    private Credentials validateRequest(AmazonUser request) {
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

    private record Credentials(String username, String password) {
    }

    private AuthenticationResult toAuthenticationResult(AmazonUser user) {
        String token = jwtService.generateToken(user);
        return new AuthenticationResult(token, user.getUsername(), user.getRole().name());
    }
}