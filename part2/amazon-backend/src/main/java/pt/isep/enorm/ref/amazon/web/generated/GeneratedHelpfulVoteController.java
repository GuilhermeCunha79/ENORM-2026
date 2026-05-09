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
import pt.isep.enorm.ref.amazon.service.command.CreateHelpfulVoteCommand;
import pt.isep.enorm.ref.amazon.web.dto.CreateHelpfulVoteRequest;
import pt.isep.enorm.ref.amazon.web.dto.HelpfulVoteResponse;

public abstract class GeneratedHelpfulVoteController {

    private final HelpfulVoteService helpfulVoteService;

    protected GeneratedHelpfulVoteController(HelpfulVoteService helpfulVoteService) {
        this.helpfulVoteService = helpfulVoteService;
    }

    @GetMapping
    public List<HelpfulVoteResponse> listVotes(@PathVariable Long commentId) {
        return helpfulVoteService.listVotesForComment(commentId).stream()
            .map(this::toResponse)
            .toList();
    }

    @PostMapping
    public ResponseEntity<HelpfulVoteResponse> createVote(
        @AuthenticationPrincipal AmazonUser currentUser,
        @PathVariable Long commentId,
        @Valid @RequestBody CreateHelpfulVoteRequest request
    ) {
        HelpfulVote vote = helpfulVoteService.createVote(currentUser.getUsername(), new CreateHelpfulVoteCommand(commentId, request.value()));
        return ResponseEntity.status(HttpStatus.CREATED).body(toResponse(vote));
    }

    @DeleteMapping("/{voteId}")
    public ResponseEntity<Void> deleteVote(@PathVariable Long voteId) {
        helpfulVoteService.deleteVote(voteId);
        return ResponseEntity.noContent().build();
    }

    protected HelpfulVoteResponse toResponse(HelpfulVote vote) {
        return new HelpfulVoteResponse(
            vote.getId(),
            vote.getComment().getId(),
            vote.getValue(),
            vote.getVoter().getUsername(),
            vote.getCreatedAt()
        );
    }
}
