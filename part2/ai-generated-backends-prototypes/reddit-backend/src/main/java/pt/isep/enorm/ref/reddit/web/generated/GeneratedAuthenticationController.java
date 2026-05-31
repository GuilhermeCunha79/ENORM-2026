package pt.isep.enorm.ref.reddit.web.generated;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import jakarta.validation.Valid;
import pt.isep.enorm.ref.reddit.domain.RedditUser;
import pt.isep.enorm.ref.reddit.service.AuthenticationService;
import pt.isep.enorm.ref.reddit.service.projection.AuthenticationResult;

public abstract class GeneratedAuthenticationController {

    private final AuthenticationService authenticationService;

    protected GeneratedAuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResult> register(@Valid @RequestBody RedditUser request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(authenticationService.register(request));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthenticationResult> login(@Valid @RequestBody RedditUser request) {
        return ResponseEntity.ok(authenticationService.login(request));
    }
}


