package pt.isep.enorm.ref.reddit.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.isep.enorm.ref.reddit.service.AuthenticationService;
import pt.isep.enorm.ref.reddit.web.generated.GeneratedAuthenticationController;

@RestController
@RequestMapping("/api/auth")
public class AuthenticationController extends GeneratedAuthenticationController {

    public AuthenticationController(AuthenticationService authenticationService) {
        super(authenticationService);
    }
}

