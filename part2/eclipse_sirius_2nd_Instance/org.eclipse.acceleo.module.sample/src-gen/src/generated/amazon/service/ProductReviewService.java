package generated.amazon.service;

import generated.amazon.dto.ProductReviewDto;
import generated.amazon.repository.ProductReviewRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ProductReviewService {
    private final ProductReviewRepository repository;

    public ProductReviewService(ProductReviewRepository repository) {
        this.repository = repository;
    }

    public List<ProductReviewDto> list() {
        return repository.findAll();
    }

    public ProductReviewDto get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductReview not found"));
    }

    public ProductReviewDto create(ProductReviewDto dto) {
        validateAmazonReview(dto);
        return repository.save(dto);
    }

    public ProductReviewDto update(String id, ProductReviewDto dto) {
        get(id);
        return repository.save(new ProductReviewDto(id , dto.rating() , dto.text() , dto.creationDate() , dto.verifiedPurchase()));
    }

    public void delete(String id) {
        get(id);
        repository.delete(id);
    }

    private void validateAmazonReview(ProductReviewDto dto) {
        if (dto.rating() == null || dto.rating() < 1.0 || dto.rating() > 5.0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Rating must respect the 1..5 five-star scale");
        }
    }
}
