package pt.isep.enorm.ref.amazon.web.generated;

import pt.isep.enorm.ref.amazon.service.ModerationService;
import pt.isep.enorm.ref.amazon.service.projection.ModerationSimulationResult;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/moderation")
public class GeneratedModerationController {
    private final ModerationService service;

    public GeneratedModerationController(ModerationService service) {
        this.service = service;
    }

    @PostMapping("/reviews/{reviewId}/simulate")
    public ModerationSimulationResult simulateReview(@PathVariable Long reviewId) {
        return service.simulateReviewModeration(null, reviewId);
    }

    @PostMapping("/reviews/simulate")
    public List<ModerationSimulationResult> simulateReviews() {
        return service.simulatePendingReviewModeration(null);
    }
}
