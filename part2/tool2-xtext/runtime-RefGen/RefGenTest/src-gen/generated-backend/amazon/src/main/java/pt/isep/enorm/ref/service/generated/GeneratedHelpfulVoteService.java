package pt.isep.enorm.ref.service.generated;

import java.util.List;
import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.domain.HelpfulVote;
import pt.isep.enorm.ref.repository.HelpfulVoteRepository;

@Service
public class GeneratedHelpfulVoteService {
    private final HelpfulVoteRepository repository;

    public GeneratedHelpfulVoteService(HelpfulVoteRepository repository) {
        this.repository = repository;
    }

    public List<HelpfulVote> findAll() {
        return repository.findAll();
    }

    public HelpfulVote submit(HelpfulVote feedback) {
        checkUniquePerAuthorTarget(feedback);
        beforeSubmit(feedback);
        return repository.save(feedback);
    }

    private void checkUniquePerAuthorTarget(HelpfulVote feedback) {
if (feedback.getAuthor() != null && feedback.getParentFeedback() != null
        && repository.existsByAuthor_IdAndParentFeedback_Id(feedback.getAuthor().getId(), feedback.getParentFeedback().getId())) {
    throw new IllegalArgumentException("Author already submitted this feedback for the parent");
}
    }

    /** Override in manual service for verification, moderation, etc. */
    protected void beforeSubmit(HelpfulVote feedback) {
    }
}
