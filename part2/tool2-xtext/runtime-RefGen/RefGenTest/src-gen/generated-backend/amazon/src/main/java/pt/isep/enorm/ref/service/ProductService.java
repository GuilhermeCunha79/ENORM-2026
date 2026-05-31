package pt.isep.enorm.ref.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.repository.ProductRepository;
import pt.isep.enorm.ref.service.generated.GeneratedProductService;

@Service
public class ProductService extends GeneratedProductService {
    public ProductService(ProductRepository repository) {
        super(repository);
    }
}
