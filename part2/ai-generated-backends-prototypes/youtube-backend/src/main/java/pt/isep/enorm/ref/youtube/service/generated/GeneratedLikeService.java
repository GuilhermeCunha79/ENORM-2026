package pt.isep.enorm.ref.youtube.service.generated;

import java.time.Instant;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import pt.isep.enorm.ref.youtube.domain.Comment;
import pt.isep.enorm.ref.youtube.domain.Like;
import pt.isep.enorm.ref.youtube.domain.LikeHistory;
import pt.isep.enorm.ref.youtube.domain.Video;
import pt.isep.enorm.ref.youtube.domain.YoutubeUser;
import pt.isep.enorm.ref.youtube.domain.enums.LikeAction;
import pt.isep.enorm.ref.youtube.domain.enums.LikeValue;
import pt.isep.enorm.ref.youtube.repository.CommentRepository;
import pt.isep.enorm.ref.youtube.repository.LikeHistoryRepository;
import pt.isep.enorm.ref.youtube.repository.LikeRepository;
import pt.isep.enorm.ref.youtube.repository.VideoRepository;
import pt.isep.enorm.ref.youtube.web.error.ResourceNotFoundException;

@Transactional(readOnly = true)
public abstract class GeneratedLikeService {

    private final LikeRepository likeRepository;
    private final LikeHistoryRepository likeHistoryRepository;
    private final VideoRepository videoRepository;
    private final CommentRepository commentRepository;

    protected GeneratedLikeService(
        LikeRepository likeRepository,
        LikeHistoryRepository likeHistoryRepository,
        VideoRepository videoRepository,
        CommentRepository commentRepository
    ) {
        this.likeRepository = likeRepository;
        this.likeHistoryRepository = likeHistoryRepository;
        this.videoRepository = videoRepository;
        this.commentRepository = commentRepository;
    }

    public List<Like> listLikesForVideo(Long videoId) {
        loadVideo(videoId);
        return likeRepository.findByVideoId(videoId);
    }

    public List<Like> listLikesForComment(Long commentId) {
        loadComment(commentId);
        return likeRepository.findByCommentId(commentId);
    }

    @Transactional
    public Like createLike(YoutubeUser user, Long videoId, Long commentId, Like request) {
        if (user == null) {
            throw new IllegalArgumentException("User is required.");
        }

        if ((videoId == null && commentId == null) || (videoId != null && commentId != null)) {
            throw new IllegalArgumentException("Provide either videoId or commentId.");
        }

        if (request == null || request.getValue() == null) {
            throw new IllegalArgumentException("Like value is required.");
        }

        if (videoId != null && likeRepository.existsByUserIdAndVideoId(user.getId(), videoId)) {
            throw new IllegalStateException("User already reacted to this video.");
        }

        if (commentId != null && likeRepository.existsByUserIdAndCommentId(user.getId(), commentId)) {
            throw new IllegalStateException("User already reacted to this comment.");
        }

        Like like = new Like();
        like.setUser(user);
        like.setValue(request.getValue());
        like.setTimestamp(Instant.now());

        if (videoId != null) {
            like.setVideo(loadVideo(videoId));
        } else {
            like.setComment(loadComment(commentId));
        }

        Like savedLike = likeRepository.save(like);
        recordHistory(user, savedLike.getVideo(), savedLike.getComment(), request.getValue());
        return savedLike;
    }

    @Transactional
    public void deleteLike(Long likeId) {
        Like like = likeRepository.findById(likeId)
            .orElseThrow(() -> new ResourceNotFoundException("Like '%s' was not found.".formatted(likeId)));
        likeRepository.delete(like);
        recordHistory(like.getUser(), like.getVideo(), like.getComment(), null);
    }

    private void recordHistory(YoutubeUser user, Video video, Comment comment, LikeValue value) {
        LikeHistory history = new LikeHistory();
        history.setUser(user);
        history.setVideo(video);
        history.setComment(comment);
        history.setTimestamp(Instant.now());
        history.setAction(resolveAction(value));
        likeHistoryRepository.save(history);
    }

    private LikeAction resolveAction(LikeValue value) {
        if (value == null) {
            return LikeAction.REMOVED;
        }
        return value == LikeValue.LIKE ? LikeAction.LIKE : LikeAction.DISLIKE;
    }

    private Video loadVideo(Long videoId) {
        return videoRepository.findById(videoId)
            .orElseThrow(() -> new ResourceNotFoundException("Video '%s' was not found.".formatted(videoId)));
    }

    private Comment loadComment(Long commentId) {
        return commentRepository.findById(commentId)
            .orElseThrow(() -> new ResourceNotFoundException("Comment '%s' was not found.".formatted(commentId)));
    }
}

