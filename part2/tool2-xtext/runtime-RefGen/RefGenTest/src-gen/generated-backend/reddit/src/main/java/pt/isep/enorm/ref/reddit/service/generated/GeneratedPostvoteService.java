package pt.isep.enorm.ref.reddit.service.generated;

import java.util.List;
import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.reddit.domain.PostVote;
import pt.isep.enorm.ref.reddit.repository.PostVoteRepository;

@Service
public class GeneratedPostVoteService {
    private final PostVoteRepository repository;

    public GeneratedPostVoteService(PostVoteRepository repository) {
        this.repository = repository;
    }

    public List<PostVote> findAll() {
        return repository.findAll();
    }

    public PostVote submit(PostVote feedback) {
        checkUniquePerAuthorTarget(feedback);
        beforeSubmit(feedback);
        return repository.save(feedback);
    }

    private void checkUniquePerAuthorTarget(PostVote feedback) {
if (feedback.getAuthor() != null && feedback.getSubject() != null
        && repository.existsByAuthor_IdAndSubject_Id(feedback.getAuthor().getId(), feedback.getSubject().getId())) {
    throw new IllegalArgumentException("Author already submitted this feedback for the target");
}
    }

    /** Override in manual service for verification, moderation, etc. */
    protected void beforeSubmit(PostVote feedback) {
    }
}
