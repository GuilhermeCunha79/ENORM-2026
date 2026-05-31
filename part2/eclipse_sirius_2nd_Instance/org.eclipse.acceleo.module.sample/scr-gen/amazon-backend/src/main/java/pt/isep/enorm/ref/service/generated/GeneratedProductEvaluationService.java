package pt.isep.enorm.ref.service.generated;

import pt.isep.enorm.ref.domain.Product;
import pt.isep.enorm.ref.domain.ProductReview;
import pt.isep.enorm.ref.repository.generated.GeneratedProductRepository;
import pt.isep.enorm.ref.repository.generated.GeneratedProductReviewRepository;
import java.util.List;

public class GeneratedProductEvaluationService {
    protected final GeneratedProductRepository productRepository;
    protected final GeneratedProductReviewRepository productReviewRepository;

    public GeneratedProductEvaluationService(GeneratedProductRepository productRepository, GeneratedProductReviewRepository productReviewRepository) {
        this.productRepository = productRepository;
        this.productReviewRepository = productReviewRepository;
    }

    public List<Product> list() {
        return productRepository.findAll();
    }

    public Product create(Product product) {
        return productRepository.save(product);
    }

    public ProductReview createReview(ProductReview review) {
        ProductReview savedReview = productReviewRepository.save(review);
        afterReviewSubmitted(savedReview);
        return savedReview;
    }

    public List<ProductReview> listReviews() {
        return productReviewRepository.findAll();
    }

    protected void afterReviewSubmitted(ProductReview savedReview) {
    }
}
