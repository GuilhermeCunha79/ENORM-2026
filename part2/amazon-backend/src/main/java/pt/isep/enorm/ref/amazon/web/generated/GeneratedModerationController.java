package pt.isep.enorm.ref.amazon.web.generated;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import pt.isep.enorm.ref.amazon.domain.AmazonUser;
import pt.isep.enorm.ref.amazon.service.ModerationService;
import pt.isep.enorm.ref.amazon.service.projection.ReviewModerationSimulationResult;

public abstract class GeneratedModerationController {

    private final ModerationService moderationService;

    protected GeneratedModerationController(ModerationService moderationService) {
        this.moderationService = moderationService;
    }

    @PostMapping("/reviews/{reviewId}/simulate")
    public ResponseEntity<ReviewModerationSimulationResult> simulateReviewModeration(
        @AuthenticationPrincipal AmazonUser currentUser,
        @PathVariable Long reviewId
    ) {
        ReviewModerationSimulationResult result = moderationService.simulateReviewModeration(currentUser, reviewId);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }

    @PostMapping("/reviews/simulate")
    public List<ReviewModerationSimulationResult> simulatePendingReviews(@AuthenticationPrincipal AmazonUser currentUser) {
        return moderationService.simulatePendingReviews(currentUser);
    }
}
