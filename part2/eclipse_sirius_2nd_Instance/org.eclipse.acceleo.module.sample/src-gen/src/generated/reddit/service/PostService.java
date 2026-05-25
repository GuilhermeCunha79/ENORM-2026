package generated.reddit.service;

import generated.reddit.dto.PostDto;
import generated.reddit.repository.PostRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class PostService {
    private final PostRepository repository;

    public PostService(PostRepository repository) {
        this.repository = repository;
    }

    public List<PostDto> list() {
        return repository.findAll();
    }

    public PostDto get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Post not found"));
    }

    public PostDto create(PostDto dto) {
        return repository.save(dto);
    }

    public PostDto update(String id, PostDto dto) {
        get(id);
        return repository.save(new PostDto(id , dto.title() , dto.body() , dto.type() , dto.supportsVote() , dto.supportsReport()));
    }

    public void delete(String id) {
        get(id);
        repository.delete(id);
    }
}
