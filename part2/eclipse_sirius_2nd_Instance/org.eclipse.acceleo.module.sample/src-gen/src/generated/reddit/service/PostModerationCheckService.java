package generated.reddit.service;

import generated.reddit.dto.PostModerationCheckDto;
import generated.reddit.repository.PostModerationCheckRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class PostModerationCheckService {
    private final PostModerationCheckRepository repository;

    public PostModerationCheckService(PostModerationCheckRepository repository) {
        this.repository = repository;
    }

    public List<PostModerationCheckDto> list() {
        return repository.findAll();
    }

    public PostModerationCheckDto get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PostModerationCheck not found"));
    }

    public PostModerationCheckDto create(PostModerationCheckDto dto) {
        return repository.save(dto);
    }

    public PostModerationCheckDto update(String id, PostModerationCheckDto dto) {
        get(id);
        return repository.save(new PostModerationCheckDto(id , dto.type() , dto.result() , dto.timestamp()));
    }

    public void delete(String id) {
        get(id);
        repository.delete(id);
    }
}
