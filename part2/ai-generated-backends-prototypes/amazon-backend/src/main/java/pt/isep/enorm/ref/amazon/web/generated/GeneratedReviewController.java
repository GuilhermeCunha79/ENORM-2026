package pt.isep.enorm.ref.amazon.web.generated;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import jakarta.validation.Valid;
import pt.isep.enorm.ref.amazon.domain.AmazonUser;
import pt.isep.enorm.ref.amazon.domain.ProductReview;
import pt.isep.enorm.ref.amazon.service.ProductEvaluationService;

public abstract class GeneratedReviewController {

    private final ProductEvaluationService productEvaluationService;

    protected GeneratedReviewController(ProductEvaluationService productEvaluationService) {
        this.productEvaluationService = productEvaluationService;
    }

    @PostMapping
    public ResponseEntity<ProductReview> submitReview(
        @AuthenticationPrincipal AmazonUser currentUser,
        @Valid @RequestBody ProductReview request
    ) {
        ProductReview review = productEvaluationService.submitReview(currentUser.getUsername(), request);
        return ResponseEntity.status(HttpStatus.CREATED).body(review);
    }
}
