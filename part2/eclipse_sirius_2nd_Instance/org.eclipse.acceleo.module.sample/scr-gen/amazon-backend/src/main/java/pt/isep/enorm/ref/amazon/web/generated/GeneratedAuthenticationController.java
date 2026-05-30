package pt.isep.enorm.ref.amazon.web.generated;

import pt.isep.enorm.ref.amazon.domain.AmazonUser;
import pt.isep.enorm.ref.amazon.repository.AmazonUserRepository;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class GeneratedAuthenticationController {
    private final AmazonUserRepository userRepository;

    public GeneratedAuthenticationController(AmazonUserRepository userRepository) { this.userRepository = userRepository; }

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public AmazonUser register(@RequestBody AmazonUser payload) {
        return userRepository.save(payload);
    }

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody Map<String, Object> payload) {
        return Map.of("status", "authenticated", "model", "Amazon");
    }
}
