package pt.isep.enorm.ref.amazonscenario.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.amazonscenario.repository.ProductreviewRepository;
import pt.isep.enorm.ref.amazonscenario.service.generated.GeneratedProductreviewService;

@Service
public class ProductreviewService extends GeneratedProductreviewService {
    public ProductreviewService(ProductreviewRepository repository) {
        super(repository);
    }
}
