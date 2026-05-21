package pt.isep.enorm.ref.youtube.service.generated;

import java.util.List;
import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.youtube.domain.Videoreview;
import pt.isep.enorm.ref.youtube.repository.VideoreviewRepository;

@Service
public class GeneratedVideoreviewService {
    private final VideoreviewRepository repository;

    public GeneratedVideoreviewService(VideoreviewRepository repository) {
        this.repository = repository;
    }

    public List<Videoreview> findAll() {
        return repository.findAll();
    }

    public Videoreview submit(Videoreview feedback) {
        beforeSubmit(feedback);
        return repository.save(feedback);
    }

    /** Override in manual service for verification, moderation, etc. */
    protected void beforeSubmit(Videoreview feedback) {
    }
}
