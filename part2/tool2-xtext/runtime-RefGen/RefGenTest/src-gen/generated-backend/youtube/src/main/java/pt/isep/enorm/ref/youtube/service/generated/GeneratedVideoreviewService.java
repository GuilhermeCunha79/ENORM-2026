package pt.isep.enorm.ref.youtube.service.generated;

import java.util.List;
import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.youtube.domain.VideoReview;
import pt.isep.enorm.ref.youtube.repository.VideoReviewRepository;

@Service
public class GeneratedVideoReviewService {
    private final VideoReviewRepository repository;

    public GeneratedVideoReviewService(VideoReviewRepository repository) {
        this.repository = repository;
    }

    public List<VideoReview> findAll() {
        return repository.findAll();
    }

    public VideoReview submit(VideoReview feedback) {
        checkUniquePerAuthorTarget(feedback);
        beforeSubmit(feedback);
        return repository.save(feedback);
    }

    private void checkUniquePerAuthorTarget(VideoReview feedback) {
if (feedback.getAuthor() != null && feedback.getSubject() != null
        && repository.existsByAuthor_IdAndSubject_Id(feedback.getAuthor().getId(), feedback.getSubject().getId())) {
    throw new IllegalArgumentException("Author already submitted this feedback for the target");
}
    }

    /** Override in manual service for verification, moderation, etc. */
    protected void beforeSubmit(VideoReview feedback) {
    }
}
