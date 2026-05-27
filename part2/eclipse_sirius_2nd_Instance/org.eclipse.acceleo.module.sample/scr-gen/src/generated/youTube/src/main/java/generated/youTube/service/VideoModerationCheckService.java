package generated.youTube.service;

import generated.youTube.domain.VideoModerationCheck;
import generated.youTube.repository.VideoModerationCheckRepository;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class VideoModerationCheckService {
    private final VideoModerationCheckRepository repository;

    public VideoModerationCheckService(VideoModerationCheckRepository repository) {
        this.repository = repository;
    }

    public List<VideoModerationCheck> list() {
        return repository.findAll().stream()
                .collect(Collectors.toList());
    }

    public VideoModerationCheck get(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "VideoModerationCheck not found"));
    }

    public VideoModerationCheck create(VideoModerationCheck entity) {
        if (entity.getId() == null || entity.getId().isBlank()) {
            entity.setId(UUID.randomUUID().toString());
        }
        return repository.save(entity);
    }

    public VideoModerationCheck update(String id, VideoModerationCheck entity) {
        VideoModerationCheck current = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "VideoModerationCheck not found"));
        current.setType(entity.getType());
        current.setResult(entity.getResult());
        current.setTimestamp(entity.getTimestamp());
        return repository.save(current);
    }

    public void delete(String id) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "VideoModerationCheck not found");
        }
        repository.deleteById(id);
    }

}
