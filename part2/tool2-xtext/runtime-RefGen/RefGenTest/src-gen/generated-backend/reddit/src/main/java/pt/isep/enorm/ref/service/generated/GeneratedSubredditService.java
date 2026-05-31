package pt.isep.enorm.ref.service.generated;

import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.domain.Subreddit;
import pt.isep.enorm.ref.repository.SubredditRepository;

@Service
public class GeneratedSubredditService {
    private final SubredditRepository repository;

    public GeneratedSubredditService(SubredditRepository repository) {
        this.repository = repository;
    }

    /** Fase G: optional sorting driven by SortingPolicy (sortBy = entity property, direction = ASC|DESC). */
    public List<Subreddit> findAll(String sortBy, String direction) {
        if (sortBy == null || sortBy.isBlank()) {
            return repository.findAll();
        }
        Sort.Direction dir = "DESC".equalsIgnoreCase(direction) ? Sort.Direction.DESC : Sort.Direction.ASC;
        try {
            return repository.findAll(Sort.by(dir, sortBy));
        } catch (RuntimeException ex) {
            return repository.findAll();
        }
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
