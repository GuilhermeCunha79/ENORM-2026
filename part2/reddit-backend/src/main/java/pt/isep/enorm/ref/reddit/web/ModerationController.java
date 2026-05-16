package pt.isep.enorm.ref.reddit.web;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.isep.enorm.ref.reddit.domain.RedditUser;
import pt.isep.enorm.ref.reddit.service.ModerationService;
import pt.isep.enorm.ref.reddit.service.projection.ModerationSimulationResult;
import pt.isep.enorm.ref.reddit.web.generated.GeneratedModerationController;

@RestController
@RequestMapping("/api")
public class ModerationController extends GeneratedModerationController {

    private final ModerationService moderationService;

    public ModerationController(ModerationService moderationService) {
        super(moderationService);
        this.moderationService = moderationService;
    }

    @PostMapping("/moderation/posts/{postId}/simulate")
    public ResponseEntity<ModerationSimulationResult> simulatePostModeration(
        @AuthenticationPrincipal RedditUser currentUser,
        @PathVariable Long postId
    ) {
        ModerationSimulationResult result = moderationService.simulatePostModeration(currentUser, postId);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }

    @PostMapping("/moderation/comments/{commentId}/simulate")
    public ResponseEntity<ModerationSimulationResult> simulateCommentModeration(
        @AuthenticationPrincipal RedditUser currentUser,
        @PathVariable Long commentId
    ) {
        ModerationSimulationResult result = moderationService.simulateCommentModeration(currentUser, commentId);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }

    @PostMapping("/moderation/reports/simulate")
    public List<ModerationSimulationResult> simulatePendingReports(@AuthenticationPrincipal RedditUser currentUser) {
        return moderationService.simulatePendingReports(currentUser);
    }
}

