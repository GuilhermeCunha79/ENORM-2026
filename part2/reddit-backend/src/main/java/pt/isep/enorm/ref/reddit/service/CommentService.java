package pt.isep.enorm.ref.reddit.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pt.isep.enorm.ref.reddit.domain.Comment;
import pt.isep.enorm.ref.reddit.domain.RedditUser;
import pt.isep.enorm.ref.reddit.repository.CommentRepository;
import pt.isep.enorm.ref.reddit.repository.PostRepository;
import pt.isep.enorm.ref.reddit.service.generated.GeneratedCommentService;

@Service
public class CommentService extends GeneratedCommentService {

    private final ModerationService moderationService;

    public CommentService(
        CommentRepository commentRepository,
        PostRepository postRepository,
        ModerationService moderationService
    ) {
        super(commentRepository, postRepository);
        this.moderationService = moderationService;
    }

    @Override
    @Transactional
    public Comment createComment(RedditUser author, Long postId, Comment request) {
        Comment comment = super.createComment(author, postId, request);
        moderationService.moderateAutomaticallyOnCommentCreated(comment);
        return comment;
    }
}



