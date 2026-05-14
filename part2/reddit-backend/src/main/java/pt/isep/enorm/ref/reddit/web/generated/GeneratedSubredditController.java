package pt.isep.enorm.ref.reddit.web.generated;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import jakarta.validation.Valid;
import pt.isep.enorm.ref.reddit.domain.Subreddit;
import pt.isep.enorm.ref.reddit.domain.RedditUser;
import pt.isep.enorm.ref.reddit.service.SubredditService;

public abstract class GeneratedSubredditController {

    private final SubredditService subredditService;

    protected GeneratedSubredditController(SubredditService subredditService) {
        this.subredditService = subredditService;
    }

    @GetMapping("/subreddits")
    public List<Subreddit> listSubreddits() {
        return subredditService.listSubreddits();
    }

    @GetMapping("/subreddits/{subredditId}")
    public Subreddit getSubreddit(@PathVariable Long subredditId) {
        return subredditService.getSubreddit(subredditId);
    }

    @PostMapping("/subreddits")
    public ResponseEntity<Subreddit> createSubreddit(
        @AuthenticationPrincipal RedditUser currentUser,
        @Valid @RequestBody Subreddit request
    ) {
        Subreddit savedSubreddit = subredditService.createSubreddit(currentUser, request);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedSubreddit);
    }

    @PutMapping("/subreddits/{subredditId}")
    public Subreddit updateSubreddit(@PathVariable Long subredditId, @Valid @RequestBody Subreddit request) {
        return subredditService.updateSubreddit(subredditId, request);
    }

    @DeleteMapping("/subreddits/{subredditId}")
    public ResponseEntity<Void> deleteSubreddit(@PathVariable Long subredditId) {
        subredditService.deleteSubreddit(subredditId);
        return ResponseEntity.noContent().build();
    }
}




