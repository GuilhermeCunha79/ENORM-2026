package pt.isep.enorm.ref.reddit.web.generated;

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
import pt.isep.enorm.ref.reddit.domain.CommentModerationCheck;
import pt.isep.enorm.ref.reddit.domain.CommunityRule;
import pt.isep.enorm.ref.reddit.domain.PostModerationCheck;
import pt.isep.enorm.ref.reddit.domain.RedditUser;
import pt.isep.enorm.ref.reddit.domain.enums.CommentStatus;
import pt.isep.enorm.ref.reddit.service.ModerationService;

public abstract class GeneratedModerationController {

    private final ModerationService moderationService;

    protected GeneratedModerationController(ModerationService moderationService) {
        this.moderationService = moderationService;
    }

    @GetMapping("/moderation/posts/{postId}/checks")
    public List<PostModerationCheck> listPostChecks(@PathVariable Long postId) {
        return moderationService.listPostChecks(postId);
    }

    @PostMapping("/moderation/posts/{postId}/checks")
    public ResponseEntity<PostModerationCheck> createPostCheck(
        @AuthenticationPrincipal RedditUser currentUser,
        @PathVariable Long postId,
        @Valid @RequestBody PostModerationCheck request
    ) {
        PostModerationCheck check = moderationService.createPostCheck(currentUser, postId, request);
        return ResponseEntity.status(HttpStatus.CREATED).body(check);
    }

    @GetMapping("/moderation/comments/{commentId}/checks")
    public List<CommentModerationCheck> listCommentChecks(@PathVariable Long commentId) {
        return moderationService.listCommentChecks(commentId);
    }

    @PostMapping("/moderation/comments/{commentId}/checks")
    public ResponseEntity<CommentModerationCheck> createCommentCheck(
        @AuthenticationPrincipal RedditUser currentUser,
        @PathVariable Long commentId,
        @Valid @RequestBody CommentModerationCheck request
    ) {
        CommentModerationCheck check = moderationService.createCommentCheck(currentUser, commentId, request);
        return ResponseEntity.status(HttpStatus.CREATED).body(check);
    }

    @PostMapping("/moderation/posts/{postId}/comment-status")
    public ResponseEntity<CommunityRule> changeCommentStatus(
        @AuthenticationPrincipal RedditUser currentUser,
        @PathVariable Long postId,
        @RequestParam CommentStatus status
    ) {
        CommunityRule change = moderationService.changeCommentStatus(currentUser, postId, status);
        return ResponseEntity.status(HttpStatus.CREATED).body(change);
    }
}




