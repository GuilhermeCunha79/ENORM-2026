package pt.isep.enorm.ref.amazon.web;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.isep.enorm.ref.amazon.domain.AmazonUser;
import pt.isep.enorm.ref.amazon.service.ModerationService;
import pt.isep.enorm.ref.amazon.service.projection.ModerationSimulationResult;
import pt.isep.enorm.ref.amazon.web.generated.GeneratedModerationController;

@RestController
@RequestMapping("/api/moderation")
public class ModerationController extends GeneratedModerationController {

    private final ModerationService moderationService;

    public ModerationController(ModerationService moderationService) {
        super(moderationService);
        this.moderationService = moderationService;
    }

    @PostMapping("/reviews/{reviewId}/simulate")
    public ResponseEntity<ModerationSimulationResult> simulateReviewModeration(
        @AuthenticationPrincipal AmazonUser currentUser,
        @PathVariable Long reviewId
    ) {
        ModerationSimulationResult result = moderationService.simulateReviewModeration(currentUser, reviewId);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    @PostMapping("/reviews/simulate")
    public ResponseEntity<List<ModerationSimulationResult>> simulatePendingReviews(
        @AuthenticationPrincipal AmazonUser currentUser
    ) {
        List<ModerationSimulationResult> results = moderationService.simulatePendingReviewModeration(currentUser);
        return ResponseEntity.status(HttpStatus.OK).body(results);
    }
}
