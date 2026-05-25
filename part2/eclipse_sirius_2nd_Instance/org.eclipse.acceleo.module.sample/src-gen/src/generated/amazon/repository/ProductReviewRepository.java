package generated.amazon.repository;

import generated.amazon.dto.ProductReviewDto;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class ProductReviewRepository {
    private final Map<String, ProductReviewDto> store = new LinkedHashMap<>();

    public List<ProductReviewDto> findAll() {
        return List.copyOf(store.values());
    }

    public Optional<ProductReviewDto> findById(String id) {
        return Optional.ofNullable(store.get(id));
    }

    public ProductReviewDto save(ProductReviewDto dto) {
        store.put(dto.id(), dto);
        return dto;
    }

    public void delete(String id) {
        store.remove(id);
    }
}
