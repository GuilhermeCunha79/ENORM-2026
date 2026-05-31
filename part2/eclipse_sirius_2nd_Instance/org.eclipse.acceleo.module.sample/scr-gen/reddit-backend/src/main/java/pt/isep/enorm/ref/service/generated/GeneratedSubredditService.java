package pt.isep.enorm.ref.service.generated;

import pt.isep.enorm.ref.domain.Subreddit;
import pt.isep.enorm.ref.repository.generated.GeneratedSubredditRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class GeneratedSubredditService {
    protected final GeneratedSubredditRepository repository;

    public GeneratedSubredditService(GeneratedSubredditRepository repository) {
        this.repository = repository;
    }

    public List<Subreddit> list() {
        return repository.findAll();
    }

    public Subreddit get(String id) {
        return repository.findById(toLong(id))
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Subreddit '" + id + "' was not found."));
    }

    public Subreddit create(Subreddit entity) {
        return repository.save(entity);
    }

    public Subreddit update(String id, Subreddit entity) {
        entity.setId(toLong(id));
        return repository.save(entity);
    }

    public void delete(String id) {
        repository.delete(get(id));
    }

    private Long toLong(String id) {
        try {
            return Long.valueOf(id);
        } catch (NumberFormatException ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid numeric id: " + id);
        }
    }
}
