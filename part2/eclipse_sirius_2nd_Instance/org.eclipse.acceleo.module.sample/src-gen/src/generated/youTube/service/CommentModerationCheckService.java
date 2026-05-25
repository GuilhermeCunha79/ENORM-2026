package generated.youTube.service;

import generated.youTube.dto.CommentModerationCheckDto;
import generated.youTube.repository.CommentModerationCheckRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class CommentModerationCheckService {
    private final CommentModerationCheckRepository repository;

    public CommentModerationCheckService(CommentModerationCheckRepository repository) {
        this.repository = repository;
    }

    public List<CommentModerationCheckDto> list() {
        return repository.findAll();
    }

    public CommentModerationCheckDto get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CommentModerationCheck not found"));
    }

    public CommentModerationCheckDto create(CommentModerationCheckDto dto) {
        return repository.save(dto);
    }

    public CommentModerationCheckDto update(String id, CommentModerationCheckDto dto) {
        get(id);
        return repository.save(new CommentModerationCheckDto(id , dto.type() , dto.result() , dto.timestamp()));
    }

    public void delete(String id) {
        get(id);
        repository.delete(id);
    }
}
