package pt.isep.enorm.ref.amazon.service.generated;

import java.util.List;
import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.amazon.domain.ProductReview;
import pt.isep.enorm.ref.amazon.repository.ProductReviewRepository;

@Service
public class GeneratedProductReviewService {
    private final ProductReviewRepository repository;

    public GeneratedProductReviewService(ProductReviewRepository repository) {
        this.repository = repository;
    }

    public List<ProductReview> findAll() {
        return repository.findAll();
    }

    public ProductReview submit(ProductReview feedback) {
        checkUniquePerAuthorTarget(feedback);
        beforeSubmit(feedback);
        return repository.save(feedback);
    }

    private void checkUniquePerAuthorTarget(ProductReview feedback) {
if (feedback.getAuthor() != null && feedback.getSubject() != null
        && repository.existsByAuthor_IdAndSubject_Id(feedback.getAuthor().getId(), feedback.getSubject().getId())) {
    throw new IllegalArgumentException("Author already submitted this feedback for the target");
}
    }

    /** Override in manual service for verification, moderation, etc. */
    protected void beforeSubmit(ProductReview feedback) {
    }
}
