package pt.isep.enorm.ref.reddit.service.generated;

import java.time.Instant;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import pt.isep.enorm.ref.reddit.domain.Comment;
import pt.isep.enorm.ref.reddit.domain.CommentModerationCheck;
import pt.isep.enorm.ref.reddit.domain.CommunityRule;
import pt.isep.enorm.ref.reddit.domain.Post;
import pt.isep.enorm.ref.reddit.domain.PostModerationCheck;
import pt.isep.enorm.ref.reddit.domain.RedditUser;
import pt.isep.enorm.ref.reddit.domain.enums.CommentStatus;
import pt.isep.enorm.ref.reddit.repository.CommentModerationCheckRepository;
import pt.isep.enorm.ref.reddit.repository.CommentRepository;
import pt.isep.enorm.ref.reddit.repository.CommunityRuleRepository;
import pt.isep.enorm.ref.reddit.repository.PostModerationCheckRepository;
import pt.isep.enorm.ref.reddit.repository.PostRepository;
import pt.isep.enorm.ref.reddit.web.error.ResourceNotFoundException;

@Transactional(readOnly = true)
public abstract class GeneratedModerationService {

    private final PostModerationCheckRepository postModerationCheckRepository;
    private final CommentModerationCheckRepository commentModerationCheckRepository;
    private final CommunityRuleRepository commentSettingsChangeRepository;
    private final PostRepository postRepository;
    private final CommentRepository commentRepository;

    protected GeneratedModerationService(
        PostModerationCheckRepository postModerationCheckRepository,
        CommentModerationCheckRepository commentModerationCheckRepository,
        CommunityRuleRepository commentSettingsChangeRepository,
        PostRepository postRepository,
        CommentRepository commentRepository
    ) {
        this.postModerationCheckRepository = postModerationCheckRepository;
        this.commentModerationCheckRepository = commentModerationCheckRepository;
        this.commentSettingsChangeRepository = commentSettingsChangeRepository;
        this.postRepository = postRepository;
        this.commentRepository = commentRepository;
    }

    public List<PostModerationCheck> listPostChecks(Long postId) {
        loadPost(postId);
        return postModerationCheckRepository.findByPostId(postId);
    }

    public List<CommentModerationCheck> listCommentChecks(Long commentId) {
        loadComment(commentId);
        return commentModerationCheckRepository.findByCommentId(commentId);
    }

    @Transactional
    public PostModerationCheck createPostCheck(RedditUser moderator, Long postId, PostModerationCheck request) {
        if (moderator == null) {
            throw new IllegalArgumentException("Moderator is required.");
        }

        if (request == null || request.getType() == null || request.getResult() == null) {
            throw new IllegalArgumentException("Moderation type and result are required.");
        }

        PostModerationCheck check = new PostModerationCheck();
        check.setType(request.getType());
        check.setResult(request.getResult());
        check.setTimestamp(Instant.now());
        check.setPost(loadPost(postId));
        check.setReviewedBy(moderator);

        return postModerationCheckRepository.save(check);
    }

    @Transactional
    public CommentModerationCheck createCommentCheck(RedditUser moderator, Long commentId, CommentModerationCheck request) {
        if (moderator == null) {
            throw new IllegalArgumentException("Moderator is required.");
        }

        if (request == null || request.getType() == null || request.getResult() == null) {
            throw new IllegalArgumentException("Moderation type and result are required.");
        }

        CommentModerationCheck check = new CommentModerationCheck();
        check.setType(request.getType());
        check.setResult(request.getResult());
        check.setTimestamp(Instant.now());
        check.setComment(loadComment(commentId));
        check.setReviewedBy(moderator);

        return commentModerationCheckRepository.save(check);
    }

    @Transactional
    public CommunityRule changeCommentStatus(RedditUser moderator, Long postId, CommentStatus newStatus) {
        if (moderator == null) {
            throw new IllegalArgumentException("Moderator is required.");
        }

        if (newStatus == null) {
            throw new IllegalArgumentException("New comment status is required.");
        }

        Post post = loadPost(postId);
        post.setCommentStatus(newStatus);

        CommunityRule change = new CommunityRule();
        change.setModerator(moderator);
        change.setPost(post);
        change.setNewStatus(newStatus);
        change.setTimestamp(Instant.now());

        commentSettingsChangeRepository.save(change);
        return change;
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




