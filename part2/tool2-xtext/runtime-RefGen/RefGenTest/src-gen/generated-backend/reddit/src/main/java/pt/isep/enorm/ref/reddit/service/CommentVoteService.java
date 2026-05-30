package pt.isep.enorm.ref.reddit.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.reddit.repository.CommentVoteRepository;
import pt.isep.enorm.ref.reddit.service.generated.GeneratedCommentVoteService;

@Service
public class CommentVoteService extends GeneratedCommentVoteService {
    public CommentVoteService(CommentVoteRepository repository) {
        super(repository);
    }
}
