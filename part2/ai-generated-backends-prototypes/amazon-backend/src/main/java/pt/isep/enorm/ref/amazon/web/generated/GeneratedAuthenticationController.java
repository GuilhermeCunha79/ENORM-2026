package pt.isep.enorm.ref.amazon.web.generated;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import jakarta.validation.Valid;
import pt.isep.enorm.ref.amazon.domain.AmazonUser;
import pt.isep.enorm.ref.amazon.service.AuthenticationService;
import pt.isep.enorm.ref.amazon.service.projection.AuthenticationResult;

public abstract class GeneratedAuthenticationController {

    private final AuthenticationService authenticationService;

    protected GeneratedAuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResult> register(@Valid @RequestBody AmazonUser request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(authenticationService.register(request));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthenticationResult> login(@Valid @RequestBody AmazonUser request) {
        return ResponseEntity.ok(authenticationService.login(request));
    }

}