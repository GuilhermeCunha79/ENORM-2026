package pt.isep.enorm.ref.amazon.service.generated;

import java.util.List;
import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.amazon.domain.Productreview;
import pt.isep.enorm.ref.amazon.repository.ProductreviewRepository;

@Service
public class GeneratedProductreviewService {
    private final ProductreviewRepository repository;

    public GeneratedProductreviewService(ProductreviewRepository repository) {
        this.repository = repository;
    }

    public List<Productreview> findAll() {
        return repository.findAll();
    }

    public Productreview submit(Productreview feedback) {
        beforeSubmit(feedback);
        return repository.save(feedback);
    }

    /** Override in manual service for verification, moderation, etc. */
    protected void beforeSubmit(Productreview feedback) {
    }
}
