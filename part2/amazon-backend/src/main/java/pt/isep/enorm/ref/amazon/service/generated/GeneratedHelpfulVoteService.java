package pt.isep.enorm.ref.amazon.service.generated;

import java.time.Instant;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import pt.isep.enorm.ref.amazon.domain.AmazonUser;
import pt.isep.enorm.ref.amazon.domain.CommentReview;
import pt.isep.enorm.ref.amazon.domain.HelpfulVote;
import pt.isep.enorm.ref.amazon.repository.AmazonUserRepository;
import pt.isep.enorm.ref.amazon.repository.CommentReviewRepository;
import pt.isep.enorm.ref.amazon.repository.HelpfulVoteRepository;
import pt.isep.enorm.ref.amazon.service.command.CreateHelpfulVoteCommand;
import pt.isep.enorm.ref.amazon.web.error.ResourceNotFoundException;

@Transactional(readOnly = true)
public abstract class GeneratedHelpfulVoteService {

    private final HelpfulVoteRepository helpfulVoteRepository;
    private final CommentReviewRepository commentReviewRepository;
    private final AmazonUserRepository amazonUserRepository;

    protected GeneratedHelpfulVoteService(
        HelpfulVoteRepository helpfulVoteRepository,
        CommentReviewRepository commentReviewRepository,
        AmazonUserRepository amazonUserRepository
    ) {
        this.helpfulVoteRepository = helpfulVoteRepository;
        this.commentReviewRepository = commentReviewRepository;
        this.amazonUserRepository = amazonUserRepository;
    }

    public List<HelpfulVote> listVotesForComment(Long commentId) {
        loadComment(commentId);
        return helpfulVoteRepository.findByCommentId(commentId);
    }

    @Transactional
    public HelpfulVote createVote(String username, CreateHelpfulVoteCommand command) {
        AmazonUser voter = loadUserByUsername(username);
        CommentReview comment = loadComment(command.commentId());

        HelpfulVote vote = new HelpfulVote();
        vote.setVoter(voter);
        vote.setComment(comment);
        vote.setValue(command.value());
        vote.setCreatedAt(Instant.now());

        return helpfulVoteRepository.save(vote);
    }

    @Transactional
    public void deleteVote(Long voteId) {
        HelpfulVote vote = helpfulVoteRepository.findById(voteId)
            .orElseThrow(() -> new ResourceNotFoundException("Vote '%s' was not found.".formatted(voteId)));
        helpfulVoteRepository.delete(vote);
    }

    private CommentReview loadComment(Long commentId) {
        return commentReviewRepository.findById(commentId)
            .orElseThrow(() -> new ResourceNotFoundException("Comment '%s' was not found.".formatted(commentId)));
    }

    private AmazonUser loadUserByUsername(String username) {
        return amazonUserRepository.findByUsername(username)
            .orElseThrow(() -> new ResourceNotFoundException("User '%s' was not found.".formatted(username)));
    }
}
