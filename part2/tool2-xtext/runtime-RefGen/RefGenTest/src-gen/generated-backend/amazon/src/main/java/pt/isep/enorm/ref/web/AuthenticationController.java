package pt.isep.enorm.ref.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.isep.enorm.ref.service.AuthenticationService;
import pt.isep.enorm.ref.web.generated.GeneratedAuthenticationController;

@RestController
@RequestMapping("/api/auth")
public class AuthenticationController extends GeneratedAuthenticationController {
    public AuthenticationController(AuthenticationService authenticationService) {
        super(authenticationService);
    }
}
