package pt.isep.enorm.ref.reddit.service.generated;

import java.util.List;
import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.reddit.domain.CommentVote;
import pt.isep.enorm.ref.reddit.repository.CommentVoteRepository;

@Service
public class GeneratedCommentVoteService {
    private final CommentVoteRepository repository;

    public GeneratedCommentVoteService(CommentVoteRepository repository) {
        this.repository = repository;
    }

    public List<CommentVote> findAll() {
        return repository.findAll();
    }

    public CommentVote submit(CommentVote feedback) {
        checkUniquePerAuthorTarget(feedback);
        beforeSubmit(feedback);
        return repository.save(feedback);
    }

    private void checkUniquePerAuthorTarget(CommentVote feedback) {
if (feedback.getAuthor() != null && feedback.getSubject() != null
        && repository.existsByAuthor_IdAndSubject_Id(feedback.getAuthor().getId(), feedback.getSubject().getId())) {
    throw new IllegalArgumentException("Author already submitted this feedback for the target");
}
    }

    /** Override in manual service for verification, moderation, etc. */
    protected void beforeSubmit(CommentVote feedback) {
    }
}
