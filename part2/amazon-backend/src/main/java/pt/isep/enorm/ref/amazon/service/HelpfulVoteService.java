package pt.isep.enorm.ref.amazon.service;

import org.springframework.stereotype.Service;

import pt.isep.enorm.ref.amazon.repository.AmazonUserRepository;
import pt.isep.enorm.ref.amazon.repository.CommentReviewRepository;
import pt.isep.enorm.ref.amazon.repository.HelpfulVoteRepository;
import pt.isep.enorm.ref.amazon.service.generated.GeneratedHelpfulVoteService;

@Service
public class HelpfulVoteService extends GeneratedHelpfulVoteService {

    public HelpfulVoteService(
        HelpfulVoteRepository helpfulVoteRepository,
        CommentReviewRepository commentReviewRepository,
        AmazonUserRepository amazonUserRepository
    ) {
        super(helpfulVoteRepository, commentReviewRepository, amazonUserRepository);
    }
}
