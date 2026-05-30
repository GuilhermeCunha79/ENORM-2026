package generated.amazon.service.generated;

import generated.amazon.domain.HelpfulVote;
import generated.amazon.repository.generated.GeneratedHelpfulVoteRepository;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class GeneratedHelpfulVoteService {
    protected final GeneratedHelpfulVoteRepository repository;

    public GeneratedHelpfulVoteService(GeneratedHelpfulVoteRepository repository) {
        this.repository = repository;
    }

    public List<HelpfulVote> list() {
        return repository.findAll().stream()
                .collect(Collectors.toList());
    }

    public HelpfulVote get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "HelpfulVote not found"));
    }

    public HelpfulVote create(HelpfulVote entity) {
        if (entity.getId() == null || entity.getId().isBlank()) {
            entity.setId(UUID.randomUUID().toString());
        }
        return repository.save(entity);
    }

    public HelpfulVote update(String id, HelpfulVote entity) {
        HelpfulVote current = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "HelpfulVote not found"));
        current.setValue(entity.getValue());
        current.setTimestamp(entity.getTimestamp());
        return repository.save(current);
    }

    public void delete(String id) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "HelpfulVote not found");
        }
        repository.deleteById(id);
    }

}
