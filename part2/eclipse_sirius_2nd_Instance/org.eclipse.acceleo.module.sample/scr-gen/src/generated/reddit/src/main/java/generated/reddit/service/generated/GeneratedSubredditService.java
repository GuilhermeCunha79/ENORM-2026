package generated.reddit.service.generated;

import generated.reddit.domain.Subreddit;
import generated.reddit.repository.generated.GeneratedSubredditRepository;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class GeneratedSubredditService {
    protected final GeneratedSubredditRepository repository;

    public GeneratedSubredditService(GeneratedSubredditRepository repository) {
        this.repository = repository;
    }

    public List<Subreddit> list() {
        return repository.findAll().stream()
                .collect(Collectors.toList());
    }

    public Subreddit get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Subreddit not found"));
    }

    public Subreddit create(Subreddit entity) {
        if (entity.getId() == null || entity.getId().isBlank()) {
            entity.setId(UUID.randomUUID().toString());
        }
        return repository.save(entity);
    }

    public Subreddit update(String id, Subreddit entity) {
        Subreddit current = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Subreddit not found"));
        current.setName(entity.getName());
        current.setDescription(entity.getDescription());
        return repository.save(current);
    }

    public void delete(String id) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Subreddit not found");
        }
        repository.deleteById(id);
    }

}
