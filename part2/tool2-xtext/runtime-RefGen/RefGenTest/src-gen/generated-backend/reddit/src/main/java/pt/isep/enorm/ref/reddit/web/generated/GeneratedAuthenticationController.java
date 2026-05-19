package pt.isep.enorm.ref.reddit.web.generated;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import pt.isep.enorm.ref.reddit.domain.RedditUser;
import pt.isep.enorm.ref.reddit.domain.enums.Role;
import pt.isep.enorm.ref.reddit.service.AuthenticationService;

public abstract class GeneratedAuthenticationController {
    private final AuthenticationService authenticationService;

    protected GeneratedAuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("/register")
    public ResponseEntity<RedditUser> register(
        @RequestParam String username,
        @RequestParam String password,
        @RequestParam(defaultValue = "GENERIC") Role role
    ) {
        return ResponseEntity.status(HttpStatus.CREATED)
            .body(authenticationService.register(username, password, role));
    }
}
