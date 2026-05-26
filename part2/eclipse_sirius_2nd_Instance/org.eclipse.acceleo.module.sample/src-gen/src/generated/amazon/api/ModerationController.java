package generated.amazon.api;

import java.util.Map;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/moderation")
public class ModerationController {

    @PostMapping("/reviews/{reviewId}/simulate")
    public Map<String, String> simulateReview(@PathVariable String reviewId, @RequestBody(required = false) Map<String, Object> payload) {
        return Map.of("reviewId", reviewId, "status", "simulation-executed");
    }

    @PostMapping("/reviews/simulate")
    public Map<String, String> simulateReviews(@RequestBody(required = false) Map<String, Object> payload) {
        return Map.of("status", "simulation-executed");
    }
}
