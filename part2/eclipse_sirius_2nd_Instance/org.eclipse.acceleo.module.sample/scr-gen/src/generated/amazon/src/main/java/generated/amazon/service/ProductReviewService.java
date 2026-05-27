package generated.amazon.service;

import generated.amazon.domain.ProductReview;
import generated.amazon.repository.ProductReviewRepository;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ProductReviewService {
    private final ProductReviewRepository repository;

    public ProductReviewService(ProductReviewRepository repository) {
        this.repository = repository;
    }

    public List<ProductReview> list() {
        return repository.findAll().stream()
                .collect(Collectors.toList());
    }

    public ProductReview get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductReview not found"));
    }

    public ProductReview create(ProductReview entity) {
        validateAmazonReview(entity);
        if (entity.getId() == null || entity.getId().isBlank()) {
            entity.setId(UUID.randomUUID().toString());
        }
        return repository.save(entity);
    }

    public ProductReview update(String id, ProductReview entity) {
        ProductReview current = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductReview not found"));
        current.setRating(entity.getRating());
        current.setText(entity.getText());
        current.setCreationDate(entity.getCreationDate());
        current.setVerifiedPurchase(entity.getVerifiedPurchase());
        return repository.save(current);
    }

    public void delete(String id) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductReview not found");
        }
        repository.deleteById(id);
    }


    private void validateAmazonReview(ProductReview entity) {
        if (entity.getRating() == null || entity.getRating() < 1.0 || entity.getRating() > 5.0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Rating must respect the 1..5 five-star scale");
        }
    }
}
