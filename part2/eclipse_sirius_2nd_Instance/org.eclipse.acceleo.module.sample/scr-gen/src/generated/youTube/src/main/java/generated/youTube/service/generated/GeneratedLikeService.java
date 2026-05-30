package generated.youTube.service.generated;

import generated.youTube.domain.Like;
import generated.youTube.repository.generated.GeneratedLikeRepository;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class GeneratedLikeService {
    protected final GeneratedLikeRepository repository;

    public GeneratedLikeService(GeneratedLikeRepository repository) {
        this.repository = repository;
    }

    public List<Like> list() {
        return repository.findAll().stream()
                .collect(Collectors.toList());
    }

    public Like get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Like not found"));
    }

    public Like create(Like entity) {
        if (entity.getId() == null || entity.getId().isBlank()) {
            entity.setId(UUID.randomUUID().toString());
        }
        return repository.save(entity);
    }

    public Like update(String id, Like entity) {
        Like current = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Like not found"));
        current.setValue(entity.getValue());
        current.setTimestamp(entity.getTimestamp());
        return repository.save(current);
    }

    public void delete(String id) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Like not found");
        }
        repository.deleteById(id);
    }

}
