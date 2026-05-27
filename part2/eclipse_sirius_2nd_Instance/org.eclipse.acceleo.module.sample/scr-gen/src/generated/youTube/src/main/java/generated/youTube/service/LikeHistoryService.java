package generated.youTube.service;

import generated.youTube.domain.LikeHistory;
import generated.youTube.repository.LikeHistoryRepository;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class LikeHistoryService {
    private final LikeHistoryRepository repository;

    public LikeHistoryService(LikeHistoryRepository repository) {
        this.repository = repository;
    }

    public List<LikeHistory> list() {
        return repository.findAll().stream()
                .collect(Collectors.toList());
    }

    public LikeHistory get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "LikeHistory not found"));
    }

    public LikeHistory create(LikeHistory entity) {
        if (entity.getId() == null || entity.getId().isBlank()) {
            entity.setId(UUID.randomUUID().toString());
        }
        return repository.save(entity);
    }

    public LikeHistory update(String id, LikeHistory entity) {
        LikeHistory current = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "LikeHistory not found"));
        current.setAction(entity.getAction());
        current.setTimestamp(entity.getTimestamp());
        return repository.save(current);
    }

    public void delete(String id) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "LikeHistory not found");
        }
        repository.deleteById(id);
    }

}
