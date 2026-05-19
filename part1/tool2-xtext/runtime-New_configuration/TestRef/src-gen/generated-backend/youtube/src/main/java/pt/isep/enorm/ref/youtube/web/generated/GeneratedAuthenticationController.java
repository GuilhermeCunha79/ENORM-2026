package pt.isep.enorm.ref.youtube.web.generated;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import pt.isep.enorm.ref.youtube.domain.YoutubeUser;
import pt.isep.enorm.ref.youtube.domain.enums.Role;
import pt.isep.enorm.ref.youtube.service.AuthenticationService;

public abstract class GeneratedAuthenticationController {
    private final AuthenticationService authenticationService;

    protected GeneratedAuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("/register")
    public ResponseEntity<YoutubeUser> register(
        @RequestParam String username,
        @RequestParam String password,
        @RequestParam(defaultValue = "GENERIC") Role role
    ) {
        return ResponseEntity.status(HttpStatus.CREATED)
            .body(authenticationService.register(username, password, role));
    }
}
