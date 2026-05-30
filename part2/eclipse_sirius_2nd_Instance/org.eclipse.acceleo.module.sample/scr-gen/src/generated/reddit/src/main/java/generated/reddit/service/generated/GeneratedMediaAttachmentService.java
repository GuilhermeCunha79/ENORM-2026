package generated.reddit.service.generated;

import generated.reddit.domain.MediaAttachment;
import generated.reddit.repository.generated.GeneratedMediaAttachmentRepository;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class GeneratedMediaAttachmentService {
    protected final GeneratedMediaAttachmentRepository repository;

    public GeneratedMediaAttachmentService(GeneratedMediaAttachmentRepository repository) {
        this.repository = repository;
    }

    public List<MediaAttachment> list() {
        return repository.findAll().stream()
                .collect(Collectors.toList());
    }

    public MediaAttachment get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "MediaAttachment not found"));
    }

    public MediaAttachment create(MediaAttachment entity) {
        if (entity.getId() == null || entity.getId().isBlank()) {
            entity.setId(UUID.randomUUID().toString());
        }
        return repository.save(entity);
    }

    public MediaAttachment update(String id, MediaAttachment entity) {
        MediaAttachment current = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "MediaAttachment not found"));
        current.setType(entity.getType());
        current.setUrl(entity.getUrl());
        return repository.save(current);
    }

    public void delete(String id) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "MediaAttachment not found");
        }
        repository.deleteById(id);
    }

}
