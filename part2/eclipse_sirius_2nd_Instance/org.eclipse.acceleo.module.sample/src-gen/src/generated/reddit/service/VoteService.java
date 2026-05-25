package generated.reddit.service;

import generated.reddit.dto.VoteDto;
import generated.reddit.repository.VoteRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class VoteService {
    private final VoteRepository repository;

    public VoteService(VoteRepository repository) {
        this.repository = repository;
    }

    public List<VoteDto> list() {
        return repository.findAll();
    }

    public VoteDto get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Vote not found"));
    }

    public VoteDto create(VoteDto dto) {
        return repository.save(dto);
    }

    public VoteDto update(String id, VoteDto dto) {
        get(id);
        return repository.save(new VoteDto(id , dto.value() , dto.timestamp()));
    }

    public void delete(String id) {
        get(id);
        repository.delete(id);
    }
}
