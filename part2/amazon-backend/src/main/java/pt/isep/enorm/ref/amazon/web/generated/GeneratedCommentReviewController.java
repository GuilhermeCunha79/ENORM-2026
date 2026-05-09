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
import pt.isep.enorm.ref.amazon.domain.CommentMediaReference;
import pt.isep.enorm.ref.amazon.domain.CommentReview;
import pt.isep.enorm.ref.amazon.service.CommentReviewService;
import pt.isep.enorm.ref.amazon.service.command.CreateCommentReviewCommand;
import pt.isep.enorm.ref.amazon.service.command.MediaReferenceCommand;
import pt.isep.enorm.ref.amazon.service.command.UpdateCommentReviewCommand;
import pt.isep.enorm.ref.amazon.web.dto.CommentReviewResponse;
import pt.isep.enorm.ref.amazon.web.dto.CreateCommentReviewRequest;
import pt.isep.enorm.ref.amazon.web.dto.MediaReferenceRequest;
import pt.isep.enorm.ref.amazon.web.dto.MediaReferenceResponse;
import pt.isep.enorm.ref.amazon.web.dto.UpdateCommentReviewRequest;

public abstract class GeneratedCommentReviewController {

    private final CommentReviewService commentReviewService;

    protected GeneratedCommentReviewController(CommentReviewService commentReviewService) {
        this.commentReviewService = commentReviewService;
    }

    @GetMapping
    public List<CommentReviewResponse> listComments(@RequestParam Long productId) {
        return commentReviewService.listCommentsForProduct(productId).stream()
            .map(this::toResponse)
            .toList();
    }

    @GetMapping("/{commentId}")
    public CommentReviewResponse getComment(@PathVariable Long commentId) {
        return toResponse(commentReviewService.getComment(commentId));
    }

    @PostMapping
    public ResponseEntity<CommentReviewResponse> createComment(@Valid @RequestBody CreateCommentReviewRequest request) {
        CommentReview comment = commentReviewService.createComment(toCreateCommand(request));
        return ResponseEntity.status(HttpStatus.CREATED).body(toResponse(comment));
    }

    @PutMapping("/{commentId}")
    public CommentReviewResponse updateComment(
        @PathVariable Long commentId,
        @Valid @RequestBody UpdateCommentReviewRequest request
    ) {
        CommentReview comment = commentReviewService.updateComment(commentId, toUpdateCommand(request));
        return toResponse(comment);
    }

    @DeleteMapping("/{commentId}")
    public ResponseEntity<Void> deleteComment(@PathVariable Long commentId) {
        commentReviewService.deleteComment(commentId);
        return ResponseEntity.noContent().build();
    }

    protected CreateCommentReviewCommand toCreateCommand(CreateCommentReviewRequest request) {
        List<MediaReferenceCommand> mediaReferences = request.mediaReferences().stream()
            .map(this::toCommand)
            .toList();

        return new CreateCommentReviewCommand(
            request.commentCode(),
            request.text(),
            request.createdAt(),
            request.productId(),
            mediaReferences
        );
    }

    protected UpdateCommentReviewCommand toUpdateCommand(UpdateCommentReviewRequest request) {
        List<MediaReferenceCommand> mediaReferences = request.mediaReferences().stream()
            .map(this::toCommand)
            .toList();

        return new UpdateCommentReviewCommand(request.text(), request.createdAt(), mediaReferences);
    }

    protected MediaReferenceCommand toCommand(MediaReferenceRequest request) {
        return new MediaReferenceCommand(request.mediaType(), request.url());
    }

    protected CommentReviewResponse toResponse(CommentReview comment) {
        List<MediaReferenceResponse> mediaReferences = comment.getMediaReferences().stream()
            .map(this::toMediaReferenceResponse)
            .toList();

        return new CommentReviewResponse(
            comment.getId(),
            comment.getCommentCode(),
            comment.getText(),
            comment.getCreatedAt(),
            comment.getProduct().getId(),
            mediaReferences
        );
    }

    protected MediaReferenceResponse toMediaReferenceResponse(CommentMediaReference mediaReference) {
        return new MediaReferenceResponse(mediaReference.getId(), mediaReference.getMediaType(), mediaReference.getUrl());
    }
}
