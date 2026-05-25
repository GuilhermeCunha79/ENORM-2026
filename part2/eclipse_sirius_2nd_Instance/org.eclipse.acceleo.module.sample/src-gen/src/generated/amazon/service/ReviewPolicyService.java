package generated.amazon.service;

import generated.amazon.dto.ReviewPolicyDto;
import generated.amazon.repository.ReviewPolicyRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ReviewPolicyService {
    private final ReviewPolicyRepository repository;

    public ReviewPolicyService(ReviewPolicyRepository repository) {
        this.repository = repository;
    }

    public List<ReviewPolicyDto> list() {
        return repository.findAll();
    }

    public ReviewPolicyDto get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ReviewPolicy not found"));
    }

    public ReviewPolicyDto create(ReviewPolicyDto dto) {
        return repository.save(dto);
    }

    public ReviewPolicyDto update(String id, ReviewPolicyDto dto) {
        get(id);
        return repository.save(new ReviewPolicyDto(id , dto.requiresVerifiedPurchase() , dto.verificationRequirement() , dto.oneReviewPerOrderItem()));
    }

    public void delete(String id) {
        get(id);
        repository.delete(id);
    }
}
