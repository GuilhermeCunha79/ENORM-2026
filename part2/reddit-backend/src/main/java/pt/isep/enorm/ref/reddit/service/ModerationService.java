package pt.isep.enorm.ref.reddit.service;

import org.springframework.stereotype.Service;

import pt.isep.enorm.ref.reddit.repository.CommentModerationCheckRepository;
import pt.isep.enorm.ref.reddit.repository.CommentRepository;
import pt.isep.enorm.ref.reddit.repository.CommunityRuleRepository;
import pt.isep.enorm.ref.reddit.repository.PostModerationCheckRepository;
import pt.isep.enorm.ref.reddit.repository.PostRepository;
import pt.isep.enorm.ref.reddit.service.generated.GeneratedModerationService;

@Service
public class ModerationService extends GeneratedModerationService {

    public ModerationService(
        PostModerationCheckRepository postModerationCheckRepository,
        CommentModerationCheckRepository commentModerationCheckRepository,
        CommunityRuleRepository commentSettingsChangeRepository,
        PostRepository postRepository,
        CommentRepository commentRepository
    ) {
        super(
            postModerationCheckRepository,
            commentModerationCheckRepository,
            commentSettingsChangeRepository,
            postRepository,
            commentRepository
        );
    }
}



