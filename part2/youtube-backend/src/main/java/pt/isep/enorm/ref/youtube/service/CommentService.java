package pt.isep.enorm.ref.youtube.service;

import org.springframework.stereotype.Service;

import pt.isep.enorm.ref.youtube.repository.CommentRepository;
import pt.isep.enorm.ref.youtube.repository.VideoRepository;
import pt.isep.enorm.ref.youtube.service.generated.GeneratedCommentService;

@Service
public class CommentService extends GeneratedCommentService {

    public CommentService(CommentRepository commentRepository, VideoRepository videoRepository) {
        super(commentRepository, videoRepository);
    }
}

