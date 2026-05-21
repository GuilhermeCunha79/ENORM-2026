package pt.isep.enorm.ref.reddit.service.generated;

import java.util.List;
import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.reddit.domain.Postreport;
import pt.isep.enorm.ref.reddit.repository.PostreportRepository;

@Service
public class GeneratedPostreportService {
    private final PostreportRepository repository;

    public GeneratedPostreportService(PostreportRepository repository) {
        this.repository = repository;
    }

    public List<Postreport> findAll() {
        return repository.findAll();
    }

    public Postreport submit(Postreport feedback) {
        beforeSubmit(feedback);
        return repository.save(feedback);
    }

    /** Override in manual service for verification, moderation, etc. */
    protected void beforeSubmit(Postreport feedback) {
    }
}
