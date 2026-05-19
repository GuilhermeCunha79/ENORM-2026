package pt.isep.enorm.ref.amazon.service.generated;

import java.util.List;
import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.amazon.domain.Product;
import pt.isep.enorm.ref.amazon.repository.ProductRepository;

@Service
public class GeneratedProductService {
    private final ProductRepository repository;

    public GeneratedProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Product not found: " + id));
    }

    public Product create(Product entity) {
        return repository.save(entity);
    }

    /** Override in manual ProductService for scenario-specific rules. */
    protected void beforeCreate(Product entity) {
    }
}
