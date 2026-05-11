package pt.isep.enorm.ref.amazon.web.generated;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import jakarta.validation.Valid;
import pt.isep.enorm.ref.amazon.domain.AmazonUser;
import pt.isep.enorm.ref.amazon.domain.HelpfulVote;
import pt.isep.enorm.ref.amazon.service.HelpfulVoteService;

public abstract class GeneratedHelpfulVoteController {

    private final HelpfulVoteService helpfulVoteService;

    protected GeneratedHelpfulVoteController(HelpfulVoteService helpfulVoteService) {
        this.helpfulVoteService = helpfulVoteService;
    }

    @GetMapping
    public List<HelpfulVote> listVotes(@PathVariable Long commentId) {
        return helpfulVoteService.listVotesForComment(commentId);
    }

    @PostMapping
    public ResponseEntity<HelpfulVote> createVote(
        @AuthenticationPrincipal AmazonUser currentUser,
        @PathVariable Long commentId,
        @Valid @RequestBody HelpfulVote request
    ) {
        HelpfulVote vote = helpfulVoteService.createVote(currentUser.getUsername(), commentId, request);
        return ResponseEntity.status(HttpStatus.CREATED).body(vote);
    }

    @DeleteMapping("/{voteId}")
    public ResponseEntity<Void> deleteVote(@PathVariable Long voteId) {
        helpfulVoteService.deleteVote(voteId);
        return ResponseEntity.noContent().build();
    }

}
