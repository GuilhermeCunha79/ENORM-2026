package pt.isep.enorm.ref.amazon.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.amazon.repository.ProductReviewRepository;
import pt.isep.enorm.ref.amazon.service.generated.GeneratedProductReviewService;

@Service
public class ProductReviewService extends GeneratedProductReviewService {
    public ProductReviewService(ProductReviewRepository repository) {
        super(repository);
    }
}
