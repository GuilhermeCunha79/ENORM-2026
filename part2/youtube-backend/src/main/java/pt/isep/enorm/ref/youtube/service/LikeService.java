package pt.isep.enorm.ref.youtube.service;

import org.springframework.stereotype.Service;

import pt.isep.enorm.ref.youtube.repository.CommentRepository;
import pt.isep.enorm.ref.youtube.repository.LikeHistoryRepository;
import pt.isep.enorm.ref.youtube.repository.LikeRepository;
import pt.isep.enorm.ref.youtube.repository.VideoRepository;
import pt.isep.enorm.ref.youtube.service.generated.GeneratedLikeService;

@Service
public class LikeService extends GeneratedLikeService {

    public LikeService(
        LikeRepository likeRepository,
        LikeHistoryRepository likeHistoryRepository,
        VideoRepository videoRepository,
        CommentRepository commentRepository
    ) {
        super(likeRepository, likeHistoryRepository, videoRepository, commentRepository);
    }
}

