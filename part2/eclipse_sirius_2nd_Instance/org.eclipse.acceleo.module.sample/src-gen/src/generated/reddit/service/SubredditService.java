package generated.reddit.service;

import generated.reddit.dto.SubredditDto;
import generated.reddit.repository.SubredditRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class SubredditService {
    private final SubredditRepository repository;

    public SubredditService(SubredditRepository repository) {
        this.repository = repository;
    }

    public List<SubredditDto> list() {
        return repository.findAll();
    }

    public SubredditDto get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Subreddit not found"));
    }

    public SubredditDto create(SubredditDto dto) {
        return repository.save(dto);
    }

    public SubredditDto update(String id, SubredditDto dto) {
        get(id);
        return repository.save(new SubredditDto(id , dto.name() , dto.description()));
    }

    public void delete(String id) {
        get(id);
        repository.delete(id);
    }
}
