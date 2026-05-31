package pt.isep.enorm.ref.youtube.web.generated;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.validation.Valid;
import pt.isep.enorm.ref.youtube.domain.Comment;
import pt.isep.enorm.ref.youtube.domain.YoutubeUser;
import pt.isep.enorm.ref.youtube.service.CommentService;

public abstract class GeneratedCommentController {

    private final CommentService commentService;

    protected GeneratedCommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping("/comments")
    public List<Comment> listComments(@RequestParam Long videoId) {
        return commentService.listCommentsForVideo(videoId);
    }

    @GetMapping("/comments/{commentId}")
    public Comment getComment(@PathVariable Long commentId) {
        return commentService.getComment(commentId);
    }

    @PostMapping("/videos/{videoId}/comments")
    public ResponseEntity<Comment> createComment(
        @AuthenticationPrincipal YoutubeUser currentUser,
        @PathVariable Long videoId,
        @Valid @RequestBody Comment request
    ) {
        Comment savedComment = commentService.createComment(currentUser, videoId, request);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedComment);
    }

    @PutMapping("/comments/{commentId}")
    public Comment updateComment(@PathVariable Long commentId, @Valid @RequestBody Comment request) {
        return commentService.updateComment(commentId, request);
    }

    @DeleteMapping("/comments/{commentId}")
    public ResponseEntity<Void> deleteComment(@PathVariable Long commentId) {
        commentService.deleteComment(commentId);
        return ResponseEntity.noContent().build();
    }
}

