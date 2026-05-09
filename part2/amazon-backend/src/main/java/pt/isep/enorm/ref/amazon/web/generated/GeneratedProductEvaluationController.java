package pt.isep.enorm.ref.amazon.web.generated;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import jakarta.validation.Valid;
import pt.isep.enorm.ref.amazon.domain.AmazonUser;
import pt.isep.enorm.ref.amazon.domain.Product;
import pt.isep.enorm.ref.amazon.domain.ProductReview;
import pt.isep.enorm.ref.amazon.domain.ReviewMediaReference;
import pt.isep.enorm.ref.amazon.service.ProductEvaluationService;
import pt.isep.enorm.ref.amazon.service.command.CreateProductCommand;
import pt.isep.enorm.ref.amazon.service.command.MediaReferenceCommand;
import pt.isep.enorm.ref.amazon.service.command.SubmitProductReviewCommand;
import pt.isep.enorm.ref.amazon.service.projection.ProductRatingSummary;
import pt.isep.enorm.ref.amazon.web.dto.CreateProductRequest;
import pt.isep.enorm.ref.amazon.web.dto.MediaReferenceRequest;
import pt.isep.enorm.ref.amazon.web.dto.MediaReferenceResponse;
import pt.isep.enorm.ref.amazon.web.dto.ProductRatingSummaryResponse;
import pt.isep.enorm.ref.amazon.web.dto.ProductResponse;
import pt.isep.enorm.ref.amazon.web.dto.ProductReviewResponse;
import pt.isep.enorm.ref.amazon.web.dto.SubmitProductReviewForProductRequest;

public abstract class GeneratedProductEvaluationController {

    private final ProductEvaluationService productEvaluationService;

    protected GeneratedProductEvaluationController(ProductEvaluationService productEvaluationService) {
        this.productEvaluationService = productEvaluationService;
    }

    @GetMapping
    public List<ProductResponse> listProducts() {
        return productEvaluationService.listProducts().stream()
            .map(this::toProductResponse)
            .toList();
    }

    @PostMapping
    public ResponseEntity<ProductResponse> createProduct(@Valid @RequestBody CreateProductRequest request) {
        Product savedProduct = productEvaluationService.createProduct(toCommand(request));
        return ResponseEntity.status(HttpStatus.CREATED).body(toProductResponse(savedProduct));
    }

    @GetMapping("/{productId}/average-rating")
    public ProductRatingSummaryResponse getAverageRating(@PathVariable Long productId) {
        return toProductRatingSummaryResponse(productEvaluationService.getRatingSummary(productId));
    }

    @PostMapping("/{productId}/reviews")
    public ResponseEntity<ProductReviewResponse> submitReviewForProduct(
        @AuthenticationPrincipal AmazonUser currentUser,
        @PathVariable Long productId,
        @Valid @RequestBody SubmitProductReviewForProductRequest request
    ) {
        ProductReview review = productEvaluationService.submitReview(currentUser.getUsername(), toCommand(productId, request));
        return ResponseEntity.status(HttpStatus.CREATED).body(toProductReviewResponse(review));
    }

    protected CreateProductCommand toCommand(CreateProductRequest request) {
        return new CreateProductCommand(request.name(), request.description(), request.price(), request.createdAt());
    }

    protected SubmitProductReviewCommand toCommand(Long productId, SubmitProductReviewForProductRequest request) {
        List<MediaReferenceCommand> mediaReferenceCommands = request.mediaReferences().stream()
            .map(this::toCommand)
            .toList();

        return new SubmitProductReviewCommand(request.comment(), request.grade(), productId, mediaReferenceCommands);
    }

    protected MediaReferenceCommand toCommand(MediaReferenceRequest request) {
        return new MediaReferenceCommand(request.mediaType(), request.url());
    }

    protected ProductResponse toProductResponse(Product product) {
        return new ProductResponse(
            product.getId(),
            product.getName(),
            product.getDescription(),
            product.getPrice(),
            product.getCreatedAt()
        );
    }

    protected ProductRatingSummaryResponse toProductRatingSummaryResponse(ProductRatingSummary summary) {
        return new ProductRatingSummaryResponse(summary.productId(), summary.averageStars(), summary.totalReviews());
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
            toProductResponse(product),
            mediaReferences
        );
    }

    protected MediaReferenceResponse toMediaReferenceResponse(ReviewMediaReference mediaReference) {
        return new MediaReferenceResponse(mediaReference.getId(), mediaReference.getMediaType(), mediaReference.getUrl());
    }
}
