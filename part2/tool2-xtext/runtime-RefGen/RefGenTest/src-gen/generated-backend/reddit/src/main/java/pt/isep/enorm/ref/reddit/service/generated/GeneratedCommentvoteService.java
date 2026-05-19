package pt.isep.enorm.ref.reddit.service.generated;

import java.util.List;
import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.reddit.domain.Commentvote;
import pt.isep.enorm.ref.reddit.repository.CommentvoteRepository;

@Service
public class GeneratedCommentvoteService {
    private final CommentvoteRepository repository;

    public GeneratedCommentvoteService(CommentvoteRepository repository) {
        this.repository = repository;
    }

    public List<Commentvote> findAll() {
        return repository.findAll();
    }

    public Commentvote submit(Commentvote feedback) {
        beforeSubmit(feedback);
        return repository.save(feedback);
    }

    /** Override in manual service for verification, moderation, etc. */
    protected void beforeSubmit(Commentvote feedback) {
    }
}
