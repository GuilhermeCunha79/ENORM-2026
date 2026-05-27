package generated.youTube.service;

import generated.youTube.domain.CommentSettingsChange;
import generated.youTube.repository.CommentSettingsChangeRepository;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class CommentSettingsChangeService {
    private final CommentSettingsChangeRepository repository;

    public CommentSettingsChangeService(CommentSettingsChangeRepository repository) {
        this.repository = repository;
    }

    public List<CommentSettingsChange> list() {
        return repository.findAll().stream()
                .collect(Collectors.toList());
    }

    public CommentSettingsChange get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CommentSettingsChange not found"));
    }

    public CommentSettingsChange create(CommentSettingsChange entity) {
        if (entity.getId() == null || entity.getId().isBlank()) {
            entity.setId(UUID.randomUUID().toString());
        }
        return repository.save(entity);
    }

    public CommentSettingsChange update(String id, CommentSettingsChange entity) {
        CommentSettingsChange current = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CommentSettingsChange not found"));
        current.setNewStatus(entity.getNewStatus());
        current.setTimestamp(entity.getTimestamp());
        return repository.save(current);
    }

    public void delete(String id) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CommentSettingsChange not found");
        }
        repository.deleteById(id);
    }

}
