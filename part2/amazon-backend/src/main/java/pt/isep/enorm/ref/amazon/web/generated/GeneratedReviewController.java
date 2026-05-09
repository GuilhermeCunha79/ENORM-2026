package pt.isep.enorm.ref.amazon.web.generated;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import jakarta.validation.Valid;
import pt.isep.enorm.ref.amazon.domain.AmazonUser;
import pt.isep.enorm.ref.amazon.domain.Product;
import pt.isep.enorm.ref.amazon.domain.ProductReview;
import pt.isep.enorm.ref.amazon.domain.ReviewMediaReference;
import pt.isep.enorm.ref.amazon.service.ProductEvaluationService;
import pt.isep.enorm.ref.amazon.service.command.MediaReferenceCommand;
import pt.isep.enorm.ref.amazon.service.command.SubmitProductReviewCommand;
import pt.isep.enorm.ref.amazon.web.dto.MediaReferenceRequest;
import pt.isep.enorm.ref.amazon.web.dto.MediaReferenceResponse;
import pt.isep.enorm.ref.amazon.web.dto.ProductResponse;
import pt.isep.enorm.ref.amazon.web.dto.ProductReviewResponse;
import pt.isep.enorm.ref.amazon.web.dto.SubmitProductReviewRequest;

public abstract class GeneratedReviewController {

    private final ProductEvaluationService productEvaluationService;

    protected GeneratedReviewController(ProductEvaluationService productEvaluationService) {
        this.productEvaluationService = productEvaluationService;
    }

    @PostMapping
    public ResponseEntity<ProductReviewResponse> submitReview(
        @AuthenticationPrincipal AmazonUser currentUser,
        @Valid @RequestBody SubmitProductReviewRequest request
    ) {
        ProductReview review = productEvaluationService.submitReview(currentUser.getUsername(), toCommand(request));
        return ResponseEntity.status(HttpStatus.CREATED).body(toProductReviewResponse(review));
    }

    protected SubmitProductReviewCommand toCommand(SubmitProductReviewRequest request) {
        List<MediaReferenceCommand> mediaReferenceCommands = request.mediaReferences().stream()
            .map(this::toCommand)
            .toList();

        return new SubmitProductReviewCommand(
            request.comment(),
            request.grade(),
            request.product().id(),
            mediaReferenceCommands
        );
    }

    protected MediaReferenceCommand toCommand(MediaReferenceRequest request) {
        return new MediaReferenceCommand(request.mediaType(), request.url());
    }

    protected ProductReviewResponse toProductReviewResponse(ProductReview review) {
        Product product = review.getProduct();
        List<MediaReferenceResponse> mediaReferences = review.getMediaReferences().stream()
            .map(this::toMediaReferenceResponse)
            .toList();

        return new ProductReviewResponse(
            review.getId(),
            review.getComment(),
            review.getGrade(),
            review.getStatus(),
            review.getVerificationType(),
            review.isVerifiedBuyerAtSubmission(),
            new ProductResponse(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getPrice(),
                product.getCreatedAt()
            ),
            mediaReferences
        );
    }

    protected MediaReferenceResponse toMediaReferenceResponse(ReviewMediaReference mediaReference) {
        return new MediaReferenceResponse(mediaReference.getId(), mediaReference.getMediaType(), mediaReference.getUrl());
    }
}
