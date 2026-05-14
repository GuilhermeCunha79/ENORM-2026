package pt.isep.enorm.ref.reddit.service.generated;

import java.time.LocalDate;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import pt.isep.enorm.ref.reddit.domain.Subreddit;
import pt.isep.enorm.ref.reddit.domain.RedditUser;
import pt.isep.enorm.ref.reddit.repository.SubredditRepository;
import pt.isep.enorm.ref.reddit.web.error.ResourceNotFoundException;

@Transactional(readOnly = true)
public abstract class GeneratedSubredditService {

    private final SubredditRepository subredditRepository;

    protected GeneratedSubredditService(SubredditRepository subredditRepository) {
        this.subredditRepository = subredditRepository;
    }

    public List<Subreddit> listSubreddits() {
        return subredditRepository.findAllByOrderByNameAsc();
    }

    public Subreddit getSubreddit(Long subredditId) {
        return loadSubreddit(subredditId);
    }

    @Transactional
    public Subreddit createSubreddit(RedditUser owner, Subreddit request) {
        if (owner == null) {
            throw new IllegalArgumentException("Owner is required.");
        }

        validateSubredditRequest(request);

        Subreddit subreddit = new Subreddit();
        subreddit.setName(request.getName());
        subreddit.setDescription(request.getDescription());
        subreddit.setCreationDate(request.getCreationDate() == null ? LocalDate.now() : request.getCreationDate());
        subreddit.setOwner(owner);

        return subredditRepository.save(subreddit);
    }

    @Transactional
    public Subreddit updateSubreddit(Long subredditId, Subreddit request) {
        Subreddit subreddit = loadSubreddit(subredditId);

        if (request.getName() != null && !request.getName().isBlank()) {
            subreddit.setName(request.getName());
        }

        if (request.getDescription() != null && !request.getDescription().isBlank()) {
            subreddit.setDescription(request.getDescription());
        }

        if (request.getCreationDate() != null) {
            subreddit.setCreationDate(request.getCreationDate());
        }

        return subredditRepository.save(subreddit);
    }

    @Transactional
    public void deleteSubreddit(Long subredditId) {
        Subreddit subreddit = loadSubreddit(subredditId);
        subredditRepository.delete(subreddit);
    }

    private Subreddit loadSubreddit(Long subredditId) {
        return subredditRepository.findById(subredditId)
            .orElseThrow(() -> new ResourceNotFoundException("Subreddit '%s' was not found.".formatted(subredditId)));
    }

    private void validateSubredditRequest(Subreddit request) {
        if (request == null) {
            throw new IllegalArgumentException("Subreddit payload is required.");
        }

        if (request.getName() == null || request.getName().isBlank()) {
            throw new IllegalArgumentException("Subreddit name is required.");
        }

        if (request.getDescription() == null || request.getDescription().isBlank()) {
            throw new IllegalArgumentException("Subreddit description is required.");
        }
    }
}




