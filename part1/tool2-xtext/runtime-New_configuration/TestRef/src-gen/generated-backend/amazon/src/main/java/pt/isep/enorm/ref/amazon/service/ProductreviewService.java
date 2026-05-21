package pt.isep.enorm.ref.amazon.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.amazon.repository.ProductreviewRepository;
import pt.isep.enorm.ref.amazon.service.generated.GeneratedProductreviewService;

@Service
public class ProductreviewService extends GeneratedProductreviewService {
    public ProductreviewService(ProductreviewRepository repository) {
        super(repository);
    }
}
