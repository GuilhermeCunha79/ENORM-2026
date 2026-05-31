package pt.isep.enorm.ref.youtube.web.generated;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.validation.Valid;
import pt.isep.enorm.ref.youtube.domain.CommentModerationCheck;
import pt.isep.enorm.ref.youtube.domain.CommentSettingsChange;
import pt.isep.enorm.ref.youtube.domain.VideoModerationCheck;
import pt.isep.enorm.ref.youtube.domain.YoutubeUser;
import pt.isep.enorm.ref.youtube.domain.enums.CommentStatus;
import pt.isep.enorm.ref.youtube.service.ModerationService;

public abstract class GeneratedModerationController {

    private final ModerationService moderationService;

    protected GeneratedModerationController(ModerationService moderationService) {
        this.moderationService = moderationService;
    }

    @GetMapping("/moderation/videos/{videoId}/checks")
    public List<VideoModerationCheck> listVideoChecks(@PathVariable Long videoId) {
        return moderationService.listVideoChecks(videoId);
    }

    @PostMapping("/moderation/videos/{videoId}/checks")
    public ResponseEntity<VideoModerationCheck> createVideoCheck(
        @AuthenticationPrincipal YoutubeUser currentUser,
        @PathVariable Long videoId,
        @Valid @RequestBody VideoModerationCheck request
    ) {
        VideoModerationCheck check = moderationService.createVideoCheck(currentUser, videoId, request);
        return ResponseEntity.status(HttpStatus.CREATED).body(check);
    }

    @GetMapping("/moderation/comments/{commentId}/checks")
    public List<CommentModerationCheck> listCommentChecks(@PathVariable Long commentId) {
        return moderationService.listCommentChecks(commentId);
    }

    @PostMapping("/moderation/comments/{commentId}/checks")
    public ResponseEntity<CommentModerationCheck> createCommentCheck(
        @AuthenticationPrincipal YoutubeUser currentUser,
        @PathVariable Long commentId,
        @Valid @RequestBody CommentModerationCheck request
    ) {
        CommentModerationCheck check = moderationService.createCommentCheck(currentUser, commentId, request);
        return ResponseEntity.status(HttpStatus.CREATED).body(check);
    }

    @PostMapping("/moderation/videos/{videoId}/comment-status")
    public ResponseEntity<CommentSettingsChange> changeCommentStatus(
        @AuthenticationPrincipal YoutubeUser currentUser,
        @PathVariable Long videoId,
        @RequestParam CommentStatus status
    ) {
        CommentSettingsChange change = moderationService.changeCommentStatus(currentUser, videoId, status);
        return ResponseEntity.status(HttpStatus.CREATED).body(change);
    }
}

