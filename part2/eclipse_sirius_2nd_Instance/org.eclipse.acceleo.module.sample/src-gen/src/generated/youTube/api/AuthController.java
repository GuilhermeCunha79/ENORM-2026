package generated.youTube.api;

import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public Map<String, String> register(@RequestBody Map<String, Object> payload) {
        return Map.of("status", "registered", "model", "YouTube");
    }

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody Map<String, Object> payload) {
        return Map.of("status", "authenticated", "model", "YouTube");
    }
}
