package pt.isep.enorm.ref.amazonscenario.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.isep.enorm.ref.amazonscenario.service.AuthenticationService;
import pt.isep.enorm.ref.amazonscenario.web.generated.GeneratedAuthenticationController;

@RestController
@RequestMapping("/api/auth")
public class AuthenticationController extends GeneratedAuthenticationController {
    public AuthenticationController(AuthenticationService authenticationService) {
        super(authenticationService);
    }
}
