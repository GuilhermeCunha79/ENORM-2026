package pt.isep.enorm.ref.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.repository.ProductReviewRepository;
import pt.isep.enorm.ref.service.generated.GeneratedProductReviewService;

@Service
public class ProductReviewService extends GeneratedProductReviewService {
    public ProductReviewService(ProductReviewRepository repository) {
        super(repository);
    }
}
