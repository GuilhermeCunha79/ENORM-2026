package generated.amazon.service;

import generated.amazon.domain.ReviewModerationCheck;
import generated.amazon.repository.ReviewModerationCheckRepository;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ReviewModerationCheckService {
    private final ReviewModerationCheckRepository repository;

    public ReviewModerationCheckService(ReviewModerationCheckRepository repository) {
        this.repository = repository;
    }

    public List<ReviewModerationCheck> list() {
        return repository.findAll().stream()
                .collect(Collectors.toList());
    }

    public ReviewModerationCheck get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ReviewModerationCheck not found"));
    }

    public ReviewModerationCheck create(ReviewModerationCheck entity) {
        if (entity.getId() == null || entity.getId().isBlank()) {
            entity.setId(UUID.randomUUID().toString());
        }
        return repository.save(entity);
    }

    public ReviewModerationCheck update(String id, ReviewModerationCheck entity) {
        ReviewModerationCheck current = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ReviewModerationCheck not found"));
        current.setReason(entity.getReason());
        current.setResult(entity.getResult());
        current.setTimestamp(entity.getTimestamp());
        return repository.save(current);
    }

    public void delete(String id) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ReviewModerationCheck not found");
        }
        repository.deleteById(id);
    }

}
