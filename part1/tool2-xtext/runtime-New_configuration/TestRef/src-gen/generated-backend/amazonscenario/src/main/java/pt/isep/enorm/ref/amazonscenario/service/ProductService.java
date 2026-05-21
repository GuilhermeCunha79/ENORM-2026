package pt.isep.enorm.ref.amazonscenario.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.amazonscenario.repository.ProductRepository;
import pt.isep.enorm.ref.amazonscenario.service.generated.GeneratedProductService;

@Service
public class ProductService extends GeneratedProductService {
    public ProductService(ProductRepository repository) {
        super(repository);
    }
}
