package pt.isep.enorm.ref.amazon.service.generated;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import org.springframework.transaction.annotation.Transactional;

import pt.isep.enorm.ref.amazon.domain.CommentMediaReference;
import pt.isep.enorm.ref.amazon.domain.CommentReview;
import pt.isep.enorm.ref.amazon.domain.Product;
import pt.isep.enorm.ref.amazon.repository.CommentReviewRepository;
import pt.isep.enorm.ref.amazon.repository.ProductRepository;
import pt.isep.enorm.ref.amazon.web.error.ResourceNotFoundException;

@Transactional(readOnly = true)
public abstract class GeneratedCommentReviewService {

    private final CommentReviewRepository commentReviewRepository;
    private final ProductRepository productRepository;

    protected GeneratedCommentReviewService(
        CommentReviewRepository commentReviewRepository,
        ProductRepository productRepository
    ) {
        this.commentReviewRepository = commentReviewRepository;
        this.productRepository = productRepository;
    }

    public List<CommentReview> listCommentsForProduct(Long productId) {
        loadProduct(productId);
        return commentReviewRepository.findByProductId(productId);
    }

    public CommentReview getComment(Long commentId) {
        return loadComment(commentId);
    }

    @Transactional
    public CommentReview createComment(Long productId, CommentReview request) {
        Product product = loadProduct(productId);

        CommentReview comment = new CommentReview();
        comment.setProduct(product);
        comment.setCommentCode(resolveCommentCode(request.getCommentCode()));
        comment.setText(request.getText());
        comment.setCreatedAt(resolveCommentCreatedAt(request.getCreatedAt()));
        applyMediaReferences(request.getMediaReferences(), comment);

        return commentReviewRepository.save(comment);
    }

    @Transactional
    public CommentReview updateComment(Long commentId, CommentReview request) {
        CommentReview comment = loadComment(commentId);

        if (request.getText() != null && !request.getText().isBlank()) {
            comment.setText(request.getText().trim());
        }

        if (request.getCreatedAt() != null) {
            comment.setCreatedAt(request.getCreatedAt());
        }

        if (request.getMediaReferences() != null) {
            comment.getMediaReferences().clear();
            applyMediaReferences(request.getMediaReferences(), comment);
        }

        return commentReviewRepository.save(comment);
    }

    @Transactional
    public void deleteComment(Long commentId) {
        CommentReview comment = loadComment(commentId);
        commentReviewRepository.delete(comment);
    }

    private CommentReview loadComment(Long commentId) {
        return commentReviewRepository.findById(commentId)
            .orElseThrow(() -> new ResourceNotFoundException("Comment '%s' was not found.".formatted(commentId)));
    }

    private Product loadProduct(Long productId) {
        return productRepository.findById(productId)
            .orElseThrow(() -> new ResourceNotFoundException("Product '%s' was not found.".formatted(productId)));
    }

    private String resolveCommentCode(String commentCode) {
        if (commentCode == null || commentCode.isBlank()) {
            return "COM-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
        }
        return commentCode.trim();
    }

    private LocalDate resolveCommentCreatedAt(LocalDate createdAt) {
        return createdAt == null ? LocalDate.now() : createdAt;
    }

    private void applyMediaReferences(List<CommentMediaReference> mediaReferences, CommentReview comment) {
        if (mediaReferences == null) {
            return;
        }

        for (CommentMediaReference mediaReferenceRequest : mediaReferences) {
            CommentMediaReference mediaReference = new CommentMediaReference();
            mediaReference.setMediaType(mediaReferenceRequest.getMediaType());
            mediaReference.setUrl(mediaReferenceRequest.getUrl());
            comment.addMediaReference(mediaReference);
        }
    }
}
