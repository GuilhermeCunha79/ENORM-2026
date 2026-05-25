package generated.reddit.service;

import generated.reddit.dto.ParticipationPolicyDto;
import generated.reddit.repository.ParticipationPolicyRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ParticipationPolicyService {
    private final ParticipationPolicyRepository repository;

    public ParticipationPolicyService(ParticipationPolicyRepository repository) {
        this.repository = repository;
    }

    public List<ParticipationPolicyDto> list() {
        return repository.findAll();
    }

    public ParticipationPolicyDto get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ParticipationPolicy not found"));
    }

    public ParticipationPolicyDto create(ParticipationPolicyDto dto) {
        return repository.save(dto);
    }

    public ParticipationPolicyDto update(String id, ParticipationPolicyDto dto) {
        get(id);
        return repository.save(new ParticipationPolicyDto(id , dto.action() , dto.allowedWhen()));
    }

    public void delete(String id) {
        get(id);
        repository.delete(id);
    }
}
