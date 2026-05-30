package generated.youTube.service.generated;

import generated.youTube.domain.Video;
import generated.youTube.repository.generated.GeneratedVideoRepository;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class GeneratedVideoService {
    protected final GeneratedVideoRepository repository;

    public GeneratedVideoService(GeneratedVideoRepository repository) {
        this.repository = repository;
    }

    public List<Video> list() {
        return repository.findAll().stream()
                .collect(Collectors.toList());
    }

    public Video get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Video not found"));
    }

    public Video create(Video entity) {
        if (entity.getId() == null || entity.getId().isBlank()) {
            entity.setId(UUID.randomUUID().toString());
        }
        return repository.save(entity);
    }

    public Video update(String id, Video entity) {
        Video current = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Video not found"));
        current.setTitle(entity.getTitle());
        current.setDescription(entity.getDescription());
        current.setUploadDate(entity.getUploadDate());
        current.setDuration(entity.getDuration());
        current.setCommentStatus(entity.getCommentStatus());
        return repository.save(current);
    }

    public void delete(String id) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Video not found");
        }
        repository.deleteById(id);
    }

}
