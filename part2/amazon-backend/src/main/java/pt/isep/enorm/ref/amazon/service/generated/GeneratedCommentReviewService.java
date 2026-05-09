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
import pt.isep.enorm.ref.amazon.service.command.CreateCommentReviewCommand;
import pt.isep.enorm.ref.amazon.service.command.MediaReferenceCommand;
import pt.isep.enorm.ref.amazon.service.command.UpdateCommentReviewCommand;
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
    public CommentReview createComment(CreateCommentReviewCommand command) {
        Product product = loadProduct(command.productId());

        CommentReview comment = new CommentReview();
        comment.setProduct(product);
        comment.setCommentCode(resolveCommentCode(command.commentCode()));
        comment.setText(command.text());
        comment.setCreatedAt(resolveCommentCreatedAt(command.createdAt()));

        for (MediaReferenceCommand mediaReferenceCommand : command.mediaReferences()) {
            comment.addMediaReference(toMediaReference(mediaReferenceCommand));
        }

        return commentReviewRepository.save(comment);
    }

    @Transactional
    public CommentReview updateComment(Long commentId, UpdateCommentReviewCommand command) {
        CommentReview comment = loadComment(commentId);

        if (command.text() != null && !command.text().isBlank()) {
            comment.setText(command.text().trim());
        }

        if (command.createdAt() != null) {
            comment.setCreatedAt(command.createdAt());
        }

        if (command.mediaReferences() != null) {
            comment.getMediaReferences().clear();
            for (MediaReferenceCommand mediaReferenceCommand : command.mediaReferences()) {
                comment.addMediaReference(toMediaReference(mediaReferenceCommand));
            }
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

    private CommentMediaReference toMediaReference(MediaReferenceCommand mediaReferenceCommand) {
        CommentMediaReference mediaReference = new CommentMediaReference();
        mediaReference.setMediaType(mediaReferenceCommand.mediaType());
        mediaReference.setUrl(mediaReferenceCommand.url());
        return mediaReference;
    }
}
