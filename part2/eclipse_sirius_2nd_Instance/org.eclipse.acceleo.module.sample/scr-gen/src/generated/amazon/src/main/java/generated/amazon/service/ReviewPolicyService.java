package generated.amazon.service;

import generated.amazon.domain.ReviewPolicy;
import generated.amazon.repository.ReviewPolicyRepository;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ReviewPolicyService {
    private final ReviewPolicyRepository repository;

    public ReviewPolicyService(ReviewPolicyRepository repository) {
        this.repository = repository;
    }

    public List<ReviewPolicy> list() {
        return repository.findAll().stream()
                .collect(Collectors.toList());
    }

    public ReviewPolicy get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ReviewPolicy not found"));
    }

    public ReviewPolicy create(ReviewPolicy entity) {
        if (entity.getId() == null || entity.getId().isBlank()) {
            entity.setId(UUID.randomUUID().toString());
        }
        return repository.save(entity);
    }

    public ReviewPolicy update(String id, ReviewPolicy entity) {
        ReviewPolicy current = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ReviewPolicy not found"));
        current.setRequiresVerifiedPurchase(entity.getRequiresVerifiedPurchase());
        current.setVerificationRequirement(entity.getVerificationRequirement());
        current.setOneReviewPerOrderItem(entity.getOneReviewPerOrderItem());
        return repository.save(current);
    }

    public void delete(String id) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ReviewPolicy not found");
        }
        repository.deleteById(id);
    }

}
