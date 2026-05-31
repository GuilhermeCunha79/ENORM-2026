package pt.isep.enorm.ref.web.generated;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pt.isep.enorm.ref.domain.UserType;
import pt.isep.enorm.ref.domain.enums.Role;
import pt.isep.enorm.ref.dto.AuthenticationResult;
import pt.isep.enorm.ref.dto.LoginRequest;
import pt.isep.enorm.ref.dto.RegisterRequest;
import pt.isep.enorm.ref.service.AuthenticationService;

public abstract class GeneratedAuthenticationController {
    private final AuthenticationService authenticationService;

    protected GeneratedAuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("/register")
    public ResponseEntity<UserType> register(@RequestBody RegisterRequest request) {
        Role role = Role.valueOf(request.role());
        return ResponseEntity.status(HttpStatus.CREATED)
            .body(authenticationService.register(request.username(), request.password(), role));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthenticationResult> login(@RequestBody LoginRequest request) {
        return ResponseEntity.ok(authenticationService.login(request.username(), request.password()));
    }
}
