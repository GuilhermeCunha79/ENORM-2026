package generated.reddit.service.generated;

import generated.reddit.domain.Subscription;
import generated.reddit.repository.generated.GeneratedSubscriptionRepository;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class GeneratedSubscriptionService {
    protected final GeneratedSubscriptionRepository repository;

    public GeneratedSubscriptionService(GeneratedSubscriptionRepository repository) {
        this.repository = repository;
    }

    public List<Subscription> list() {
        return repository.findAll().stream()
                .collect(Collectors.toList());
    }

    public Subscription get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Subscription not found"));
    }

    public Subscription create(Subscription entity) {
        if (entity.getId() == null || entity.getId().isBlank()) {
            entity.setId(UUID.randomUUID().toString());
        }
        return repository.save(entity);
    }

    public Subscription update(String id, Subscription entity) {
        Subscription current = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Subscription not found"));
        current.setDate(entity.getDate());
        return repository.save(current);
    }

    public void delete(String id) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Subscription not found");
        }
        repository.deleteById(id);
    }

}
