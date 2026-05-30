package pt.isep.enorm.ref.reddit.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pt.isep.enorm.ref.reddit.domain.Post;
import pt.isep.enorm.ref.reddit.domain.RedditUser;
import pt.isep.enorm.ref.reddit.repository.SubredditRepository;
import pt.isep.enorm.ref.reddit.repository.PostRepository;
import pt.isep.enorm.ref.reddit.service.generated.GeneratedPostService;

@Service
public class PostService extends GeneratedPostService {

    private final ModerationService moderationService;

    public PostService(
        PostRepository postRepository,
        SubredditRepository subredditRepository,
        ModerationService moderationService
    ) {
        super(postRepository, subredditRepository);
        this.moderationService = moderationService;
    }

    @Override
    @Transactional
    public Post createPost(RedditUser owner, Long subredditId, Post request) {
        Post post = super.createPost(owner, subredditId, request);
        moderationService.moderateAutomaticallyOnPostCreated(post);
        return post;
    }
}



