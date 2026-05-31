package pt.isep.enorm.ref.service.generated;

import pt.isep.enorm.ref.domain.HelpfulVote;
import pt.isep.enorm.ref.repository.generated.GeneratedHelpfulVoteRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class GeneratedHelpfulVoteService {
    protected final GeneratedHelpfulVoteRepository repository;

    public GeneratedHelpfulVoteService(GeneratedHelpfulVoteRepository repository) {
        this.repository = repository;
    }

    public List<HelpfulVote> list() {
        return repository.findAll();
    }

    public HelpfulVote get(String id) {
        return repository.findById(toLong(id))
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "HelpfulVote '" + id + "' was not found."));
    }

    public HelpfulVote create(HelpfulVote entity) {
        return repository.save(entity);
    }

    public HelpfulVote update(String id, HelpfulVote entity) {
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
