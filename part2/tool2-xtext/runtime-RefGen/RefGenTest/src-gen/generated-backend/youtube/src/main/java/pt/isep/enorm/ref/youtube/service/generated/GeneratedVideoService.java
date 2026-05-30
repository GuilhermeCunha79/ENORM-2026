package pt.isep.enorm.ref.youtube.service.generated;

import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.youtube.domain.Video;
import pt.isep.enorm.ref.youtube.repository.VideoRepository;

@Service
public class GeneratedVideoService {
    private final VideoRepository repository;

    public GeneratedVideoService(VideoRepository repository) {
        this.repository = repository;
    }

    /** Fase G: optional sorting driven by SortingPolicy (sortBy = entity property, direction = ASC|DESC). */
    public List<Video> findAll(String sortBy, String direction) {
        if (sortBy == null || sortBy.isBlank()) {
            return repository.findAll();
        }
        Sort.Direction dir = "DESC".equalsIgnoreCase(direction) ? Sort.Direction.DESC : Sort.Direction.ASC;
        try {
            return repository.findAll(Sort.by(dir, sortBy));
        } catch (RuntimeException ex) {
            return repository.findAll();
        }
    }

    public Video findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Video not found: " + id));
    }

    public Video create(Video entity) {
        return repository.save(entity);
    }

    /** Override in manual VideoService for scenario-specific rules. */
    protected void beforeCreate(Video entity) {
    }
}
