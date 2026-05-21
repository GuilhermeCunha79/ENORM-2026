package pt.isep.enorm.ref.amazon.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.amazon.repository.ProductRepository;
import pt.isep.enorm.ref.amazon.service.generated.GeneratedProductService;

@Service
public class ProductService extends GeneratedProductService {
    public ProductService(ProductRepository repository) {
        super(repository);
    }
}
