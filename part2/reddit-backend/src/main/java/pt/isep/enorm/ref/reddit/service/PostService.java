package pt.isep.enorm.ref.reddit.service;

import org.springframework.stereotype.Service;

import pt.isep.enorm.ref.reddit.repository.SubredditRepository;
import pt.isep.enorm.ref.reddit.repository.PostRepository;
import pt.isep.enorm.ref.reddit.service.generated.GeneratedPostService;

@Service
public class PostService extends GeneratedPostService {

    public PostService(PostRepository postRepository, SubredditRepository subredditRepository) {
        super(postRepository, subredditRepository);
    }
}



