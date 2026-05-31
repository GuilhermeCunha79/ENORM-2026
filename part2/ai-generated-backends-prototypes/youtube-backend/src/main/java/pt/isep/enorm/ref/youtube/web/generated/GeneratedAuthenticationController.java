package pt.isep.enorm.ref.youtube.web.generated;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import jakarta.validation.Valid;
import pt.isep.enorm.ref.youtube.domain.YoutubeUser;
import pt.isep.enorm.ref.youtube.service.AuthenticationService;
import pt.isep.enorm.ref.youtube.service.projection.AuthenticationResult;

public abstract class GeneratedAuthenticationController {

    private final AuthenticationService authenticationService;

    protected GeneratedAuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResult> register(@Valid @RequestBody YoutubeUser request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(authenticationService.register(request));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthenticationResult> login(@Valid @RequestBody YoutubeUser request) {
        return ResponseEntity.ok(authenticationService.login(request));
    }
}

