package pt.isep.enorm.ref.youtube.service.generated;

import pt.isep.enorm.ref.youtube.domain.Subscription;
import pt.isep.enorm.ref.youtube.repository.generated.GeneratedSubscriptionRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class GeneratedSubscriptionService {
    protected final GeneratedSubscriptionRepository repository;

    public GeneratedSubscriptionService(GeneratedSubscriptionRepository repository) {
        this.repository = repository;
    }

    public List<Subscription> list() {
        return repository.findAll();
    }

    public Subscription get(String id) {
        return repository.findById(toLong(id))
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Subscription '" + id + "' was not found."));
    }

    public Subscription create(Subscription entity) {
        return repository.save(entity);
    }

    public Subscription update(String id, Subscription entity) {
        entity.setId(toLong(id));
        return repository.save(entity);
    }

    public void delete(String id) {
        repository.deleteById(toLong(id));
    }

    private Long toLong(String id) {
        try {
            return Long.valueOf(id);
        } catch (NumberFormatException ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid numeric id: " + id);
        }
    }
}
