package pt.isep.enorm.ref.reddit.service.generated;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import pt.isep.enorm.ref.reddit.domain.Subreddit;
import pt.isep.enorm.ref.reddit.domain.ParticipationPolicy;
import pt.isep.enorm.ref.reddit.domain.Comment;
import pt.isep.enorm.ref.reddit.domain.ValidationRule;
import pt.isep.enorm.ref.reddit.domain.SortingPolicy;
import pt.isep.enorm.ref.reddit.domain.Post;
import pt.isep.enorm.ref.reddit.domain.RedditUser;
import pt.isep.enorm.ref.reddit.domain.enums.ValidationTarget;
import pt.isep.enorm.ref.reddit.repository.ParticipationPolicyRepository;
import pt.isep.enorm.ref.reddit.repository.SubredditRepository;
import pt.isep.enorm.ref.reddit.repository.CommentRepository;
import pt.isep.enorm.ref.reddit.repository.ValidationRuleRepository;
import pt.isep.enorm.ref.reddit.repository.SortingPolicyRepository;
import pt.isep.enorm.ref.reddit.repository.PostRepository;
import pt.isep.enorm.ref.reddit.web.error.ResourceNotFoundException;

@Transactional(readOnly = true)
public abstract class GeneratedPolicyService {

    private final ParticipationPolicyRepository subredditPermissionPolicyRepository;
    private final SortingPolicyRepository sortingPolicyRepository;
    private final ValidationRuleRepository contentValidationRuleRepository;
    private final SubredditRepository subredditRepository;
    private final PostRepository postRepository;
    private final CommentRepository commentRepository;

    protected GeneratedPolicyService(
        ParticipationPolicyRepository subredditPermissionPolicyRepository,
        SortingPolicyRepository sortingPolicyRepository,
        ValidationRuleRepository contentValidationRuleRepository,
        SubredditRepository subredditRepository,
        PostRepository postRepository,
        CommentRepository commentRepository
    ) {
        this.subredditPermissionPolicyRepository = subredditPermissionPolicyRepository;
        this.sortingPolicyRepository = sortingPolicyRepository;
        this.contentValidationRuleRepository = contentValidationRuleRepository;
        this.subredditRepository = subredditRepository;
        this.postRepository = postRepository;
        this.commentRepository = commentRepository;
    }

    public List<ParticipationPolicy> listSubredditPolicies(Long subredditId) {
        loadSubreddit(subredditId);
        return subredditPermissionPolicyRepository.findBySubredditId(subredditId);
    }

    public List<SortingPolicy> listSortingPolicies(Long subredditId) {
        loadSubreddit(subredditId);
        return sortingPolicyRepository.findBySubredditId(subredditId);
    }

    public List<ValidationRule> listValidationRules(Long postId, Long commentId) {
        if ((postId == null && commentId == null) || (postId != null && commentId != null)) {
            throw new IllegalArgumentException("Provide either postId or commentId.");
        }

        if (postId != null) {
            loadPost(postId);
            return contentValidationRuleRepository.findByPostId(postId);
        }

        loadComment(commentId);
        return contentValidationRuleRepository.findByCommentId(commentId);
    }

    @Transactional
    public ParticipationPolicy createSubredditPolicy(RedditUser configuredBy, Long subredditId, ParticipationPolicy request) {
        if (configuredBy == null) {
            throw new IllegalArgumentException("Configured by is required.");
        }

        if (request == null || request.getAction() == null || request.getAllowedFor() == null) {
            throw new IllegalArgumentException("Policy action and audience are required.");
        }

        ParticipationPolicy policy = new ParticipationPolicy();
        policy.setAction(request.getAction());
        policy.setAllowedFor(request.getAllowedFor());
        policy.setSubreddit(loadSubreddit(subredditId));
        policy.setConfiguredBy(configuredBy);

        return subredditPermissionPolicyRepository.save(policy);
    }

    @Transactional
    public SortingPolicy createSortingPolicy(Long subredditId, SortingPolicy request) {
        if (request == null || request.getCriterion() == null || request.getDirection() == null) {
            throw new IllegalArgumentException("Sorting criterion and direction are required.");
        }

        SortingPolicy policy = new SortingPolicy();
        policy.setCriterion(request.getCriterion());
        policy.setDirection(request.getDirection());
        policy.setSubreddit(loadSubreddit(subredditId));

        return sortingPolicyRepository.save(policy);
    }

    @Transactional
    public ValidationRule createValidationRule(
        RedditUser reviewer,
        Long postId,
        Long commentId,
        ValidationRule request
    ) {
        if (reviewer == null) {
            throw new IllegalArgumentException("Reviewer is required.");
        }

        if ((postId == null && commentId == null) || (postId != null && commentId != null)) {
            throw new IllegalArgumentException("Provide either postId or commentId.");
        }

        if (request == null || request.getPolicyType() == null || request.getSeverity() == null) {
            throw new IllegalArgumentException("Validation policy type and severity are required.");
        }

        ValidationRule rule = new ValidationRule();
        rule.setPolicyType(request.getPolicyType());
        rule.setSeverity(request.getSeverity());
        rule.setReviewedBy(reviewer);

        if (postId != null) {
            rule.setPost(loadPost(postId));
            rule.setTarget(request.getTarget() == null ? ValidationTarget.VIDEO : request.getTarget());
        } else {
            rule.setComment(loadComment(commentId));
            rule.setTarget(request.getTarget() == null ? ValidationTarget.COMMENT : request.getTarget());
        }

        return contentValidationRuleRepository.save(rule);
    }

    private Subreddit loadSubreddit(Long subredditId) {
        return subredditRepository.findById(subredditId)
            .orElseThrow(() -> new ResourceNotFoundException("Subreddit '%s' was not found.".formatted(subredditId)));
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




