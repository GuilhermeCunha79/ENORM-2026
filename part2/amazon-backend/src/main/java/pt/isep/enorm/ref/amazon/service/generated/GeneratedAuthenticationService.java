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
import pt.isep.enorm.ref.amazon.web.dto.AuthRequest;
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
    public AuthenticationResult register(AuthRequest request) {
        validateRequest(request);

        if (amazonUserRepository.existsByUsername(request.username())) {
            throw new IllegalStateException("Username already exists.");
        }

        AmazonUser user = new AmazonUser();
        user.setUsername(request.username());
        user.setPassword(passwordEncoder.encode(request.password()));
        user.setRole(Role.BUYER);
        user.setVerifiedBuyer(false);

        AmazonUser savedUser = amazonUserRepository.save(user);
        afterRegister(savedUser);
        return toAuthenticationResult(savedUser);
    }

    public AuthenticationResult login(AuthRequest request) {
        validateRequest(request);

        authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(request.username(), request.password())
        );

        AmazonUser user = amazonUserRepository.findByUsername(request.username())
            .orElseThrow(() -> new ResourceNotFoundException("User '%s' was not found.".formatted(request.username())));

        return toAuthenticationResult(user);
    }

    protected void afterRegister(AmazonUser savedUser) {
    }

    private void validateRequest(AuthRequest request) {
        Objects.requireNonNull(request, "request is required");

        if (request.username().isBlank()) {
            throw new IllegalArgumentException("Username is required.");
        }

        if (request.password().isBlank()) {
            throw new IllegalArgumentException("Password is required.");
        }
    }

    private AuthenticationResult toAuthenticationResult(AmazonUser user) {
        String token = jwtService.generateToken(user);
        return new AuthenticationResult(token, user.getUsername(), user.getRole().name());
    }
}