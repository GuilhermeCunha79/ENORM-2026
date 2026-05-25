package generated.amazon.service;

import generated.amazon.dto.RatingPolicyDto;
import generated.amazon.repository.RatingPolicyRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class RatingPolicyService {
    private final RatingPolicyRepository repository;

    public RatingPolicyService(RatingPolicyRepository repository) {
        this.repository = repository;
    }

    public List<RatingPolicyDto> list() {
        return repository.findAll();
    }

    public RatingPolicyDto get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "RatingPolicy not found"));
    }

    public RatingPolicyDto create(RatingPolicyDto dto) {
        return repository.save(dto);
    }

    public RatingPolicyDto update(String id, RatingPolicyDto dto) {
        get(id);
        return repository.save(new RatingPolicyDto(id , dto.minValue() , dto.maxValue() , dto.step()));
    }

    public void delete(String id) {
        get(id);
        repository.delete(id);
    }
}
