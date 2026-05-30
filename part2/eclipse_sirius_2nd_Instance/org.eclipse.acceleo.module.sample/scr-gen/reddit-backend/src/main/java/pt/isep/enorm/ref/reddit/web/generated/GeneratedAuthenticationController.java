package pt.isep.enorm.ref.reddit.web.generated;

import pt.isep.enorm.ref.reddit.domain.RedditUser;
import pt.isep.enorm.ref.reddit.repository.RedditUserRepository;
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
    private final RedditUserRepository userRepository;

    public GeneratedAuthenticationController(RedditUserRepository userRepository) { this.userRepository = userRepository; }

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public RedditUser register(@RequestBody RedditUser payload) {
        return userRepository.save(payload);
    }

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody Map<String, Object> payload) {
        return Map.of("status", "authenticated", "model", "Reddit");
    }
}
