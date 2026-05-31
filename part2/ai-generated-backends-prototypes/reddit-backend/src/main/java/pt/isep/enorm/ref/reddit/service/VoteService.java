package pt.isep.enorm.ref.reddit.service;

import org.springframework.stereotype.Service;

import pt.isep.enorm.ref.reddit.repository.CommentRepository;
import pt.isep.enorm.ref.reddit.repository.VoteHistoryRepository;
import pt.isep.enorm.ref.reddit.repository.VoteRepository;
import pt.isep.enorm.ref.reddit.repository.PostRepository;
import pt.isep.enorm.ref.reddit.service.generated.GeneratedVoteService;

@Service
public class VoteService extends GeneratedVoteService {

    public VoteService(
        VoteRepository likeRepository,
        VoteHistoryRepository likeHistoryRepository,
        PostRepository postRepository,
        CommentRepository commentRepository
    ) {
        super(likeRepository, likeHistoryRepository, postRepository, commentRepository);
    }
}



