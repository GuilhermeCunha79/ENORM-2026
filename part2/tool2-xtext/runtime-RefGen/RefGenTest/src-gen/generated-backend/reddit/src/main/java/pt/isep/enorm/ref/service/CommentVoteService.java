package pt.isep.enorm.ref.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.repository.CommentVoteRepository;
import pt.isep.enorm.ref.service.generated.GeneratedCommentVoteService;

@Service
public class CommentVoteService extends GeneratedCommentVoteService {
    public CommentVoteService(CommentVoteRepository repository) {
        super(repository);
    }
}
