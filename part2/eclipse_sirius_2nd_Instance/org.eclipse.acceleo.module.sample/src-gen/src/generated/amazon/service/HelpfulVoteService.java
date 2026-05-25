package generated.amazon.service;

import generated.amazon.dto.HelpfulVoteDto;
import generated.amazon.repository.HelpfulVoteRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class HelpfulVoteService {
    private final HelpfulVoteRepository repository;

    public HelpfulVoteService(HelpfulVoteRepository repository) {
        this.repository = repository;
    }

    public List<HelpfulVoteDto> list() {
        return repository.findAll();
    }

    public HelpfulVoteDto get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "HelpfulVote not found"));
    }

    public HelpfulVoteDto create(HelpfulVoteDto dto) {
        return repository.save(dto);
    }

    public HelpfulVoteDto update(String id, HelpfulVoteDto dto) {
        get(id);
        return repository.save(new HelpfulVoteDto(id , dto.value() , dto.timestamp()));
    }

    public void delete(String id) {
        get(id);
        repository.delete(id);
    }
}
