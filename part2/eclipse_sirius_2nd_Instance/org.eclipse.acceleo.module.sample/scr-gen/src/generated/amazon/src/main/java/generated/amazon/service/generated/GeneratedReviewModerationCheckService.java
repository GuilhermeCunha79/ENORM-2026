package generated.amazon.service.generated;

import generated.amazon.domain.ReviewModerationCheck;
import generated.amazon.repository.generated.GeneratedReviewModerationCheckRepository;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class GeneratedReviewModerationCheckService {
    protected final GeneratedReviewModerationCheckRepository repository;

    public GeneratedReviewModerationCheckService(GeneratedReviewModerationCheckRepository repository) {
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
