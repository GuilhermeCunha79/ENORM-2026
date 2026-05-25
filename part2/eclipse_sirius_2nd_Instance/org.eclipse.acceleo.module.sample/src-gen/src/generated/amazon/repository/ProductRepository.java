package generated.amazon.repository;

import generated.amazon.dto.ProductDto;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
    private final Map<String, ProductDto> store = new LinkedHashMap<>();

    public List<ProductDto> findAll() {
        return List.copyOf(store.values());
    }

    public Optional<ProductDto> findById(String id) {
        return Optional.ofNullable(store.get(id));
    }

    public ProductDto save(ProductDto dto) {
        store.put(dto.id(), dto);
        return dto;
    }

    public void delete(String id) {
        store.remove(id);
    }
}
