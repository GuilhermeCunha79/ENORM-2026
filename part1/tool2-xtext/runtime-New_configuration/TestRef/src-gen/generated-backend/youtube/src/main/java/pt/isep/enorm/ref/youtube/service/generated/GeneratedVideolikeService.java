package pt.isep.enorm.ref.youtube.service.generated;

import java.util.List;
import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.youtube.domain.Videolike;
import pt.isep.enorm.ref.youtube.repository.VideolikeRepository;

@Service
public class GeneratedVideolikeService {
    private final VideolikeRepository repository;

    public GeneratedVideolikeService(VideolikeRepository repository) {
        this.repository = repository;
    }

    public List<Videolike> findAll() {
        return repository.findAll();
    }

    public Videolike submit(Videolike feedback) {
        beforeSubmit(feedback);
        return repository.save(feedback);
    }

    /** Override in manual service for verification, moderation, etc. */
    protected void beforeSubmit(Videolike feedback) {
    }
}
