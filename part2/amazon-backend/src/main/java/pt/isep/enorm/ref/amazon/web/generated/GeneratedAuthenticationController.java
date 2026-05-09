package pt.isep.enorm.ref.amazon.web.generated;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import jakarta.validation.Valid;
import pt.isep.enorm.ref.amazon.service.AuthenticationService;
import pt.isep.enorm.ref.amazon.service.projection.AuthenticationResult;
import pt.isep.enorm.ref.amazon.web.dto.AuthRequest;
import pt.isep.enorm.ref.amazon.web.dto.AuthResponse;

public abstract class GeneratedAuthenticationController {

    private final AuthenticationService authenticationService;

    protected GeneratedAuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("/register")
    public ResponseEntity<AuthResponse> register(@Valid @RequestBody AuthRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(toResponse(authenticationService.register(request)));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@Valid @RequestBody AuthRequest request) {
        return ResponseEntity.ok(toResponse(authenticationService.login(request)));
    }

    protected AuthResponse toResponse(AuthenticationResult authenticationResult) {
        return new AuthResponse(authenticationResult.token(), authenticationResult.username(), authenticationResult.role());
    }
}