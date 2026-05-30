package pt.isep.enorm.ref.youtube.web.generated;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pt.isep.enorm.ref.youtube.domain.YoutubeUser;
import pt.isep.enorm.ref.youtube.domain.enums.Role;
import pt.isep.enorm.ref.youtube.dto.AuthResponse;
import pt.isep.enorm.ref.youtube.dto.LoginRequest;
import pt.isep.enorm.ref.youtube.dto.RegisterRequest;
import pt.isep.enorm.ref.youtube.service.AuthenticationService;

public abstract class GeneratedAuthenticationController {
    private final AuthenticationService authenticationService;

    protected GeneratedAuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("/register")
    public ResponseEntity<YoutubeUser> register(@RequestBody RegisterRequest request) {
        Role role = Role.valueOf(request.role());
        return ResponseEntity.status(HttpStatus.CREATED)
            .body(authenticationService.register(request.username(), request.password(), role));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request) {
        return ResponseEntity.ok(authenticationService.login(request.username(), request.password()));
    }
}
