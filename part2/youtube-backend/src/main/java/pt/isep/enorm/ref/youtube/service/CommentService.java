package pt.isep.enorm.ref.youtube.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pt.isep.enorm.ref.youtube.domain.Comment;
import pt.isep.enorm.ref.youtube.domain.YoutubeUser;
import pt.isep.enorm.ref.youtube.repository.CommentRepository;
import pt.isep.enorm.ref.youtube.repository.VideoRepository;
import pt.isep.enorm.ref.youtube.service.generated.GeneratedCommentService;

@Service
public class CommentService extends GeneratedCommentService {

    private final ModerationService moderationService;

    public CommentService(
        CommentRepository commentRepository,
        VideoRepository videoRepository,
        ModerationService moderationService
    ) {
        super(commentRepository, videoRepository);
        this.moderationService = moderationService;
    }

    @Override
    @Transactional
    public Comment createComment(YoutubeUser author, Long videoId, Comment request) {
        Comment comment = super.createComment(author, videoId, request);
        moderationService.moderateAutomaticallyOnCommentCreated(comment);
        return comment;
    }
}

