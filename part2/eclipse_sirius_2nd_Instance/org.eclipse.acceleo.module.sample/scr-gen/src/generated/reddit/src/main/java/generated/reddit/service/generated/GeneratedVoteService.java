package generated.reddit.service.generated;

import generated.reddit.domain.Vote;
import generated.reddit.repository.generated.GeneratedVoteRepository;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class GeneratedVoteService {
    protected final GeneratedVoteRepository repository;

    public GeneratedVoteService(GeneratedVoteRepository repository) {
        this.repository = repository;
    }

    public List<Vote> list() {
        return repository.findAll().stream()
                .collect(Collectors.toList());
    }

    public Vote get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Vote not found"));
    }

    public Vote create(Vote entity) {
        if (entity.getId() == null || entity.getId().isBlank()) {
            entity.setId(UUID.randomUUID().toString());
        }
        return repository.save(entity);
    }

    public Vote update(String id, Vote entity) {
        Vote current = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Vote not found"));
        current.setValue(entity.getValue());
        current.setTimestamp(entity.getTimestamp());
        return repository.save(current);
    }

    public void delete(String id) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Vote not found");
        }
        repository.deleteById(id);
    }

}
