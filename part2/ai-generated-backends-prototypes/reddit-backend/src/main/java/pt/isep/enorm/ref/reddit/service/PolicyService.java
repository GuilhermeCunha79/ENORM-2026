package pt.isep.enorm.ref.reddit.service;

import org.springframework.stereotype.Service;

import pt.isep.enorm.ref.reddit.repository.ParticipationPolicyRepository;
import pt.isep.enorm.ref.reddit.repository.SubredditRepository;
import pt.isep.enorm.ref.reddit.repository.CommentRepository;
import pt.isep.enorm.ref.reddit.repository.ValidationRuleRepository;
import pt.isep.enorm.ref.reddit.repository.SortingPolicyRepository;
import pt.isep.enorm.ref.reddit.repository.PostRepository;
import pt.isep.enorm.ref.reddit.service.generated.GeneratedPolicyService;

@Service
public class PolicyService extends GeneratedPolicyService {

    public PolicyService(
        ParticipationPolicyRepository subredditPermissionPolicyRepository,
        SortingPolicyRepository sortingPolicyRepository,
        ValidationRuleRepository contentValidationRuleRepository,
        SubredditRepository subredditRepository,
        PostRepository postRepository,
        CommentRepository commentRepository
    ) {
        super(
            subredditPermissionPolicyRepository,
            sortingPolicyRepository,
            contentValidationRuleRepository,
            subredditRepository,
            postRepository,
            commentRepository
        );
    }
}



