package pt.isep.enorm.ref.youtube.service;

import org.springframework.stereotype.Service;

import pt.isep.enorm.ref.youtube.repository.ChannelPermissionPolicyRepository;
import pt.isep.enorm.ref.youtube.repository.ChannelRepository;
import pt.isep.enorm.ref.youtube.repository.CommentRepository;
import pt.isep.enorm.ref.youtube.repository.ContentValidationRuleRepository;
import pt.isep.enorm.ref.youtube.repository.SortingPolicyRepository;
import pt.isep.enorm.ref.youtube.repository.VideoRepository;
import pt.isep.enorm.ref.youtube.service.generated.GeneratedPolicyService;

@Service
public class PolicyService extends GeneratedPolicyService {

    public PolicyService(
        ChannelPermissionPolicyRepository channelPermissionPolicyRepository,
        SortingPolicyRepository sortingPolicyRepository,
        ContentValidationRuleRepository contentValidationRuleRepository,
        ChannelRepository channelRepository,
        VideoRepository videoRepository,
        CommentRepository commentRepository
    ) {
        super(
            channelPermissionPolicyRepository,
            sortingPolicyRepository,
            contentValidationRuleRepository,
            channelRepository,
            videoRepository,
            commentRepository
        );
    }
}

