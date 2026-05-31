package pt.isep.enorm.ref.service;

import pt.isep.enorm.ref.domain.ProductReview;
import pt.isep.enorm.ref.service.generated.GeneratedProductEvaluationService;
import pt.isep.enorm.ref.repository.ProductRepository;
import pt.isep.enorm.ref.repository.ProductReviewRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductEvaluationService extends GeneratedProductEvaluationService {
    private final ModerationService moderationService;

    public ProductEvaluationService(ProductRepository productRepository, ProductReviewRepository productReviewRepository, ModerationService moderationService) {
        super(productRepository, productReviewRepository);
        this.moderationService = moderationService;
    }

    @Override
    protected void afterReviewSubmitted(ProductReview savedReview) {
        moderationService.moderateAutomaticallyOnReviewCreated(savedReview);
    }
}
