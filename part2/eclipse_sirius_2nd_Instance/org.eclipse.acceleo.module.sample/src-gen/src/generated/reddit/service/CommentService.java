package generated.reddit.service;

import generated.reddit.dto.CommentDto;
import generated.reddit.repository.CommentRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class CommentService {
    private final CommentRepository repository;

    public CommentService(CommentRepository repository) {
        this.repository = repository;
    }

    public List<CommentDto> list() {
        return repository.findAll();
    }

    public CommentDto get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Comment not found"));
    }

    public CommentDto create(CommentDto dto) {
        return repository.save(dto);
    }

    public CommentDto update(String id, CommentDto dto) {
        get(id);
        return repository.save(new CommentDto(id , dto.body() , dto.supportsVote() , dto.supportsReport()));
    }

    public void delete(String id) {
        get(id);
        repository.delete(id);
    }
}
