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
import pt.isep.enorm.ref.amazon.service.ProductEvaluationService;
import pt.isep.enorm.ref.amazon.service.projection.ProductRatingSummary;

public abstract class GeneratedProductEvaluationController {

    private final ProductEvaluationService productEvaluationService;

    protected GeneratedProductEvaluationController(ProductEvaluationService productEvaluationService) {
        this.productEvaluationService = productEvaluationService;
    }

    @GetMapping
    public List<Product> listProducts() {
        return productEvaluationService.listProducts();
    }

    @PostMapping
    public ResponseEntity<Product> createProduct(@Valid @RequestBody Product request) {
        Product savedProduct = productEvaluationService.createProduct(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedProduct);
    }

    @GetMapping("/{productId}/average-rating")
    public ProductRatingSummary getAverageRating(@PathVariable Long productId) {
        return productEvaluationService.getRatingSummary(productId);
    }

    @PostMapping("/{productId}/reviews")
    public ResponseEntity<ProductReview> submitReviewForProduct(
        @AuthenticationPrincipal AmazonUser currentUser,
        @PathVariable Long productId,
        @Valid @RequestBody ProductReview request
    ) {
        ProductReview review = productEvaluationService.submitReview(currentUser.getUsername(), productId, request);
        return ResponseEntity.status(HttpStatus.CREATED).body(review);
    }
}
