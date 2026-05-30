package pt.isep.enorm.ref.reddit.service.generated;

import pt.isep.enorm.ref.reddit.domain.Vote;
import pt.isep.enorm.ref.reddit.repository.generated.GeneratedVoteRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class GeneratedVoteService {
    protected final GeneratedVoteRepository repository;

    public GeneratedVoteService(GeneratedVoteRepository repository) {
        this.repository = repository;
    }

    public List<Vote> list() {
        return repository.findAll();
    }

    public Vote get(String id) {
        return repository.findById(toLong(id))
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Vote '" + id + "' was not found."));
    }

    public Vote create(Vote entity) {
        return repository.save(entity);
    }

    public Vote update(String id, Vote entity) {
        entity.setId(toLong(id));
        return repository.save(entity);
    }

    public void delete(String id) {
        repository.deleteById(toLong(id));
    }

    private Long toLong(String id) {
        try {
            return Long.valueOf(id);
        } catch (NumberFormatException ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid numeric id: " + id);
        }
    }
}
