package pt.isep.enorm.ref.reddit.service.generated;

import java.util.List;
import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.reddit.domain.Postvote;
import pt.isep.enorm.ref.reddit.repository.PostvoteRepository;

@Service
public class GeneratedPostvoteService {
    private final PostvoteRepository repository;

    public GeneratedPostvoteService(PostvoteRepository repository) {
        this.repository = repository;
    }

    public List<Postvote> findAll() {
        return repository.findAll();
    }

    public Postvote submit(Postvote feedback) {
        beforeSubmit(feedback);
        return repository.save(feedback);
    }

    /** Override in manual service for verification, moderation, etc. */
    protected void beforeSubmit(Postvote feedback) {
    }
}
