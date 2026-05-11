package pt.isep.enorm.ref.amazon.web.generated;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.validation.Valid;
import pt.isep.enorm.ref.amazon.domain.CommentReview;
import pt.isep.enorm.ref.amazon.service.CommentReviewService;

public abstract class GeneratedCommentReviewController {

    private final CommentReviewService commentReviewService;

    protected GeneratedCommentReviewController(CommentReviewService commentReviewService) {
        this.commentReviewService = commentReviewService;
    }

    @GetMapping
    public List<CommentReview> listComments(@RequestParam Long productId) {
        return commentReviewService.listCommentsForProduct(productId);
    }

    @GetMapping("/{commentId}")
    public CommentReview getComment(@PathVariable Long commentId) {
        return commentReviewService.getComment(commentId);
    }

    @PostMapping
    public ResponseEntity<CommentReview> createComment(
        @RequestParam Long productId,
        @Valid @RequestBody CommentReview request
    ) {
        CommentReview comment = commentReviewService.createComment(productId, request);
        return ResponseEntity.status(HttpStatus.CREATED).body(comment);
    }

    @PutMapping("/{commentId}")
    public CommentReview updateComment(
        @PathVariable Long commentId,
        @Valid @RequestBody CommentReview request
    ) {
        return commentReviewService.updateComment(commentId, request);
    }

    @DeleteMapping("/{commentId}")
    public ResponseEntity<Void> deleteComment(@PathVariable Long commentId) {
        commentReviewService.deleteComment(commentId);
        return ResponseEntity.noContent().build();
    }

}
