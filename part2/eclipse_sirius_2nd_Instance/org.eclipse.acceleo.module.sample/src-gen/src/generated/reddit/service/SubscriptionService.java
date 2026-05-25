package generated.reddit.service;

import generated.reddit.dto.SubscriptionDto;
import generated.reddit.repository.SubscriptionRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class SubscriptionService {
    private final SubscriptionRepository repository;

    public SubscriptionService(SubscriptionRepository repository) {
        this.repository = repository;
    }

    public List<SubscriptionDto> list() {
        return repository.findAll();
    }

    public SubscriptionDto get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Subscription not found"));
    }

    public SubscriptionDto create(SubscriptionDto dto) {
        return repository.save(dto);
    }

    public SubscriptionDto update(String id, SubscriptionDto dto) {
        get(id);
        return repository.save(new SubscriptionDto(id , dto.date()));
    }

    public void delete(String id) {
        get(id);
        repository.delete(id);
    }
}
