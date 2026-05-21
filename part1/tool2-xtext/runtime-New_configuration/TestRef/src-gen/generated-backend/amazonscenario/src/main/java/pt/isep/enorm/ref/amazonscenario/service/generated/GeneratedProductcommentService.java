package pt.isep.enorm.ref.amazonscenario.service.generated;

import java.util.List;
import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.amazonscenario.domain.Productcomment;
import pt.isep.enorm.ref.amazonscenario.repository.ProductcommentRepository;

@Service
public class GeneratedProductcommentService {
    private final ProductcommentRepository repository;

    public GeneratedProductcommentService(ProductcommentRepository repository) {
        this.repository = repository;
    }

    public List<Productcomment> findAll() {
        return repository.findAll();
    }

    public Productcomment submit(Productcomment feedback) {
        beforeSubmit(feedback);
        return repository.save(feedback);
    }

    /** Override in manual service for verification, moderation, etc. */
    protected void beforeSubmit(Productcomment feedback) {
    }
}
