package pt.isep.enorm.ref.amazonscenario.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.amazonscenario.repository.ProductcommentRepository;
import pt.isep.enorm.ref.amazonscenario.service.generated.GeneratedProductcommentService;

@Service
public class ProductcommentService extends GeneratedProductcommentService {
    public ProductcommentService(ProductcommentRepository repository) {
        super(repository);
    }
}
