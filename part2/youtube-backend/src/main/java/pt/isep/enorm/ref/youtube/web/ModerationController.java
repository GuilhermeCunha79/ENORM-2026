package pt.isep.enorm.ref.youtube.web;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.isep.enorm.ref.youtube.domain.YoutubeUser;
import pt.isep.enorm.ref.youtube.service.ModerationService;
import pt.isep.enorm.ref.youtube.service.projection.ModerationSimulationResult;
import pt.isep.enorm.ref.youtube.web.generated.GeneratedModerationController;

@RestController
@RequestMapping("/api")
public class ModerationController extends GeneratedModerationController {

    private final ModerationService moderationService;

    public ModerationController(ModerationService moderationService) {
        super(moderationService);
        this.moderationService = moderationService;
    }

    @PostMapping("/moderation/videos/{videoId}/simulate")
    public ResponseEntity<ModerationSimulationResult> simulateVideoModeration(
        @AuthenticationPrincipal YoutubeUser currentUser,
        @PathVariable Long videoId
    ) {
        ModerationSimulationResult result = moderationService.simulateVideoModeration(currentUser, videoId);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }

    @PostMapping("/moderation/comments/{commentId}/simulate")
    public ResponseEntity<ModerationSimulationResult> simulateCommentModeration(
        @AuthenticationPrincipal YoutubeUser currentUser,
        @PathVariable Long commentId
    ) {
        ModerationSimulationResult result = moderationService.simulateCommentModeration(currentUser, commentId);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }

    @PostMapping("/moderation/reports/simulate")
    public List<ModerationSimulationResult> simulatePendingReports(@AuthenticationPrincipal YoutubeUser currentUser) {
        return moderationService.simulatePendingReports(currentUser);
    }
}

