package pt.isep.enorm.ref.youtube.service.generated;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import pt.isep.enorm.ref.youtube.domain.Channel;
import pt.isep.enorm.ref.youtube.domain.ChannelPermissionPolicy;
import pt.isep.enorm.ref.youtube.domain.Comment;
import pt.isep.enorm.ref.youtube.domain.ContentValidationRule;
import pt.isep.enorm.ref.youtube.domain.SortingPolicy;
import pt.isep.enorm.ref.youtube.domain.Video;
import pt.isep.enorm.ref.youtube.domain.YoutubeUser;
import pt.isep.enorm.ref.youtube.domain.enums.ValidationTarget;
import pt.isep.enorm.ref.youtube.repository.ChannelPermissionPolicyRepository;
import pt.isep.enorm.ref.youtube.repository.ChannelRepository;
import pt.isep.enorm.ref.youtube.repository.CommentRepository;
import pt.isep.enorm.ref.youtube.repository.ContentValidationRuleRepository;
import pt.isep.enorm.ref.youtube.repository.SortingPolicyRepository;
import pt.isep.enorm.ref.youtube.repository.VideoRepository;
import pt.isep.enorm.ref.youtube.web.error.ResourceNotFoundException;

@Transactional(readOnly = true)
public abstract class GeneratedPolicyService {

    private final ChannelPermissionPolicyRepository channelPermissionPolicyRepository;
    private final SortingPolicyRepository sortingPolicyRepository;
    private final ContentValidationRuleRepository contentValidationRuleRepository;
    private final ChannelRepository channelRepository;
    private final VideoRepository videoRepository;
    private final CommentRepository commentRepository;

    protected GeneratedPolicyService(
        ChannelPermissionPolicyRepository channelPermissionPolicyRepository,
        SortingPolicyRepository sortingPolicyRepository,
        ContentValidationRuleRepository contentValidationRuleRepository,
        ChannelRepository channelRepository,
        VideoRepository videoRepository,
        CommentRepository commentRepository
    ) {
        this.channelPermissionPolicyRepository = channelPermissionPolicyRepository;
        this.sortingPolicyRepository = sortingPolicyRepository;
        this.contentValidationRuleRepository = contentValidationRuleRepository;
        this.channelRepository = channelRepository;
        this.videoRepository = videoRepository;
        this.commentRepository = commentRepository;
    }

    public List<ChannelPermissionPolicy> listChannelPolicies(Long channelId) {
        loadChannel(channelId);
        return channelPermissionPolicyRepository.findByChannelId(channelId);
    }

    public List<SortingPolicy> listSortingPolicies(Long channelId) {
        loadChannel(channelId);
        return sortingPolicyRepository.findByChannelId(channelId);
    }

    public List<ContentValidationRule> listValidationRules(Long videoId, Long commentId) {
        if ((videoId == null && commentId == null) || (videoId != null && commentId != null)) {
            throw new IllegalArgumentException("Provide either videoId or commentId.");
        }

        if (videoId != null) {
            loadVideo(videoId);
            return contentValidationRuleRepository.findByVideoId(videoId);
        }

        loadComment(commentId);
        return contentValidationRuleRepository.findByCommentId(commentId);
    }

    @Transactional
    public ChannelPermissionPolicy createChannelPolicy(YoutubeUser configuredBy, Long channelId, ChannelPermissionPolicy request) {
        if (configuredBy == null) {
            throw new IllegalArgumentException("Configured by is required.");
        }

        if (request == null || request.getAction() == null || request.getAllowedFor() == null) {
            throw new IllegalArgumentException("Policy action and audience are required.");
        }

        ChannelPermissionPolicy policy = new ChannelPermissionPolicy();
        policy.setAction(request.getAction());
        policy.setAllowedFor(request.getAllowedFor());
        policy.setChannel(loadChannel(channelId));
        policy.setConfiguredBy(configuredBy);

        return channelPermissionPolicyRepository.save(policy);
    }

    @Transactional
    public SortingPolicy createSortingPolicy(Long channelId, SortingPolicy request) {
        if (request == null || request.getCriterion() == null || request.getDirection() == null) {
            throw new IllegalArgumentException("Sorting criterion and direction are required.");
        }

        SortingPolicy policy = new SortingPolicy();
        policy.setCriterion(request.getCriterion());
        policy.setDirection(request.getDirection());
        policy.setChannel(loadChannel(channelId));

        return sortingPolicyRepository.save(policy);
    }

    @Transactional
    public ContentValidationRule createValidationRule(
        YoutubeUser reviewer,
        Long videoId,
        Long commentId,
        ContentValidationRule request
    ) {
        if (reviewer == null) {
            throw new IllegalArgumentException("Reviewer is required.");
        }

        if ((videoId == null && commentId == null) || (videoId != null && commentId != null)) {
            throw new IllegalArgumentException("Provide either videoId or commentId.");
        }

        if (request == null || request.getPolicyType() == null || request.getSeverity() == null) {
            throw new IllegalArgumentException("Validation policy type and severity are required.");
        }

        ContentValidationRule rule = new ContentValidationRule();
        rule.setPolicyType(request.getPolicyType());
        rule.setSeverity(request.getSeverity());
        rule.setReviewedBy(reviewer);

        if (videoId != null) {
            rule.setVideo(loadVideo(videoId));
            rule.setTarget(request.getTarget() == null ? ValidationTarget.VIDEO : request.getTarget());
        } else {
            rule.setComment(loadComment(commentId));
            rule.setTarget(request.getTarget() == null ? ValidationTarget.COMMENT : request.getTarget());
        }

        return contentValidationRuleRepository.save(rule);
    }

    private Channel loadChannel(Long channelId) {
        return channelRepository.findById(channelId)
            .orElseThrow(() -> new ResourceNotFoundException("Channel '%s' was not found.".formatted(channelId)));
    }

    private Video loadVideo(Long videoId) {
        return videoRepository.findById(videoId)
            .orElseThrow(() -> new ResourceNotFoundException("Video '%s' was not found.".formatted(videoId)));
    }

    private Comment loadComment(Long commentId) {
        return commentRepository.findById(commentId)
            .orElseThrow(() -> new ResourceNotFoundException("Comment '%s' was not found.".formatted(commentId)));
    }
}

