package pt.isep.enorm.ref.reddit.service.generated;

import java.util.List;
import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.reddit.domain.Subreddit;
import pt.isep.enorm.ref.reddit.repository.SubredditRepository;

@Service
public class GeneratedSubredditService {
    private final SubredditRepository repository;

    public GeneratedSubredditService(SubredditRepository repository) {
        this.repository = repository;
    }

    public List<Subreddit> findAll() {
        return repository.findAll();
    }

    public Subreddit findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Subreddit not found: " + id));
    }

    public Subreddit create(Subreddit entity) {
        return repository.save(entity);
    }

    /** Override in manual SubredditService for scenario-specific rules. */
    protected void beforeCreate(Subreddit entity) {
    }
}
