package generated.amazon.service.generated;

import generated.amazon.domain.Product;
import generated.amazon.repository.generated.GeneratedProductRepository;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class GeneratedProductService {
    protected final GeneratedProductRepository repository;

    public GeneratedProductService(GeneratedProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> list() {
        return repository.findAll().stream()
                .collect(Collectors.toList());
    }

    public Product get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Product not found"));
    }

    public Product create(Product entity) {
        if (entity.getId() == null || entity.getId().isBlank()) {
            entity.setId(UUID.randomUUID().toString());
        }
        return repository.save(entity);
    }

    public Product update(String id, Product entity) {
        Product current = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Product not found"));
        current.setName(entity.getName());
        current.setDescription(entity.getDescription());
        return repository.save(current);
    }

    public void delete(String id) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Product not found");
        }
        repository.deleteById(id);
    }

}
