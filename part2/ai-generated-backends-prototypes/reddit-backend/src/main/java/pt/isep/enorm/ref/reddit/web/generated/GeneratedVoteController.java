package pt.isep.enorm.ref.reddit.web.generated;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.validation.Valid;
import pt.isep.enorm.ref.reddit.domain.Vote;
import pt.isep.enorm.ref.reddit.domain.RedditUser;
import pt.isep.enorm.ref.reddit.service.VoteService;

public abstract class GeneratedVoteController {

    private final VoteService likeService;

    protected GeneratedVoteController(VoteService likeService) {
        this.likeService = likeService;
    }

    @GetMapping("/votes")
    public List<Vote> listVotes(@RequestParam(required = false) Long postId, @RequestParam(required = false) Long commentId) {
        if ((postId == null && commentId == null) || (postId != null && commentId != null)) {
            throw new IllegalArgumentException("Provide either postId or commentId.");
        }
        return postId != null ? likeService.listVotesForPost(postId) : likeService.listVotesForComment(commentId);
    }

    @PostMapping("/votes")
    public ResponseEntity<Vote> createVote(
        @AuthenticationPrincipal RedditUser currentUser,
        @RequestParam(required = false) Long postId,
        @RequestParam(required = false) Long commentId,
        @Valid @RequestBody Vote request
    ) {
        Vote savedVote = likeService.createVote(currentUser, postId, commentId, request);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedVote);
    }

    @DeleteMapping("/votes/{voteId}")
    public ResponseEntity<Void> deleteVote(@PathVariable Long voteId) {
        likeService.deleteVote(voteId);
        return ResponseEntity.noContent().build();
    }
}




