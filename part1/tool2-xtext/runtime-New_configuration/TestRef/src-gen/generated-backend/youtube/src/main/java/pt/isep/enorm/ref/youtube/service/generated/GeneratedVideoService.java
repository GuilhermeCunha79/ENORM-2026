package pt.isep.enorm.ref.youtube.service.generated;

import java.util.List;
import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.youtube.domain.Video;
import pt.isep.enorm.ref.youtube.repository.VideoRepository;

@Service
public class GeneratedVideoService {
    private final VideoRepository repository;

    public GeneratedVideoService(VideoRepository repository) {
        this.repository = repository;
    }

    public List<Video> findAll() {
        return repository.findAll();
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
