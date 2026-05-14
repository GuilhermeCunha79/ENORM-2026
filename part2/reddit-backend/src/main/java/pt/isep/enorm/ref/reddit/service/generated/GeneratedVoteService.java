package pt.isep.enorm.ref.reddit.service.generated;

import java.time.Instant;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import pt.isep.enorm.ref.reddit.domain.Comment;
import pt.isep.enorm.ref.reddit.domain.Vote;
import pt.isep.enorm.ref.reddit.domain.VoteHistory;
import pt.isep.enorm.ref.reddit.domain.Post;
import pt.isep.enorm.ref.reddit.domain.RedditUser;
import pt.isep.enorm.ref.reddit.domain.enums.VoteAction;
import pt.isep.enorm.ref.reddit.domain.enums.VoteValue;
import pt.isep.enorm.ref.reddit.repository.CommentRepository;
import pt.isep.enorm.ref.reddit.repository.VoteHistoryRepository;
import pt.isep.enorm.ref.reddit.repository.VoteRepository;
import pt.isep.enorm.ref.reddit.repository.PostRepository;
import pt.isep.enorm.ref.reddit.web.error.ResourceNotFoundException;

@Transactional(readOnly = true)
public abstract class GeneratedVoteService {

    private final VoteRepository likeRepository;
    private final VoteHistoryRepository likeHistoryRepository;
    private final PostRepository postRepository;
    private final CommentRepository commentRepository;

    protected GeneratedVoteService(
        VoteRepository likeRepository,
        VoteHistoryRepository likeHistoryRepository,
        PostRepository postRepository,
        CommentRepository commentRepository
    ) {
        this.likeRepository = likeRepository;
        this.likeHistoryRepository = likeHistoryRepository;
        this.postRepository = postRepository;
        this.commentRepository = commentRepository;
    }

    public List<Vote> listVotesForPost(Long postId) {
        loadPost(postId);
        return likeRepository.findByPostId(postId);
    }

    public List<Vote> listVotesForComment(Long commentId) {
        loadComment(commentId);
        return likeRepository.findByCommentId(commentId);
    }

    @Transactional
    public Vote createVote(RedditUser user, Long postId, Long commentId, Vote request) {
        if (user == null) {
            throw new IllegalArgumentException("User is required.");
        }

        if ((postId == null && commentId == null) || (postId != null && commentId != null)) {
            throw new IllegalArgumentException("Provide either postId or commentId.");
        }

        if (request == null || request.getValue() == null) {
            throw new IllegalArgumentException("Vote value is required.");
        }

        if (postId != null && likeRepository.existsByUserIdAndPostId(user.getId(), postId)) {
            throw new IllegalStateException("User already reacted to this post.");
        }

        if (commentId != null && likeRepository.existsByUserIdAndCommentId(user.getId(), commentId)) {
            throw new IllegalStateException("User already reacted to this comment.");
        }

        Vote like = new Vote();
        like.setUser(user);
        like.setValue(request.getValue());
        like.setTimestamp(Instant.now());

        if (postId != null) {
            like.setPost(loadPost(postId));
        } else {
            like.setComment(loadComment(commentId));
        }

        Vote savedVote = likeRepository.save(like);
        recordHistory(user, savedVote.getPost(), savedVote.getComment(), request.getValue());
        return savedVote;
    }

    @Transactional
    public void deleteVote(Long voteId) {
        Vote like = likeRepository.findById(voteId)
            .orElseThrow(() -> new ResourceNotFoundException("Vote '%s' was not found.".formatted(voteId)));
        likeRepository.delete(like);
        recordHistory(like.getUser(), like.getPost(), like.getComment(), null);
    }

    private void recordHistory(RedditUser user, Post post, Comment comment, VoteValue value) {
        VoteHistory history = new VoteHistory();
        history.setUser(user);
        history.setPost(post);
        history.setComment(comment);
        history.setTimestamp(Instant.now());
        history.setAction(resolveAction(value));
        likeHistoryRepository.save(history);
    }

    private VoteAction resolveAction(VoteValue value) {
        if (value == null) {
            return VoteAction.REMOVED;
        }
        return value == VoteValue.UPVOTE ? VoteAction.UPVOTE : VoteAction.DOWNVOTE;
    }

    private Post loadPost(Long postId) {
        return postRepository.findById(postId)
            .orElseThrow(() -> new ResourceNotFoundException("Post '%s' was not found.".formatted(postId)));
    }

    private Comment loadComment(Long commentId) {
        return commentRepository.findById(commentId)
            .orElseThrow(() -> new ResourceNotFoundException("Comment '%s' was not found.".formatted(commentId)));
    }
}




