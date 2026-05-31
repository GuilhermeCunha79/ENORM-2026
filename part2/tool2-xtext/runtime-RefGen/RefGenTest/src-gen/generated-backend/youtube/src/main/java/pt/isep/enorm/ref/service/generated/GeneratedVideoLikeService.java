package pt.isep.enorm.ref.service.generated;

import java.util.List;
import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.domain.VideoLike;
import pt.isep.enorm.ref.repository.VideoLikeRepository;

@Service
public class GeneratedVideoLikeService {
    private final VideoLikeRepository repository;

    public GeneratedVideoLikeService(VideoLikeRepository repository) {
        this.repository = repository;
    }

    public List<VideoLike> findAll() {
        return repository.findAll();
    }

    public VideoLike submit(VideoLike feedback) {
        checkUniquePerAuthorTarget(feedback);
        beforeSubmit(feedback);
        return repository.save(feedback);
    }

    private void checkUniquePerAuthorTarget(VideoLike feedback) {
if (feedback.getAuthor() != null && feedback.getSubject() != null
        && repository.existsByAuthor_IdAndSubject_Id(feedback.getAuthor().getId(), feedback.getSubject().getId())) {
    throw new IllegalArgumentException("Author already submitted this feedback for the target");
}
    }

    /** Override in manual service for verification, moderation, etc. */
    protected void beforeSubmit(VideoLike feedback) {
    }
}
