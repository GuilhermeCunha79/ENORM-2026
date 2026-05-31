package pt.isep.enorm.ref.youtube.service.generated;

import java.time.Instant;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import pt.isep.enorm.ref.youtube.domain.Comment;
import pt.isep.enorm.ref.youtube.domain.CommentModerationCheck;
import pt.isep.enorm.ref.youtube.domain.CommentSettingsChange;
import pt.isep.enorm.ref.youtube.domain.Video;
import pt.isep.enorm.ref.youtube.domain.VideoModerationCheck;
import pt.isep.enorm.ref.youtube.domain.YoutubeUser;
import pt.isep.enorm.ref.youtube.domain.enums.CommentStatus;
import pt.isep.enorm.ref.youtube.repository.CommentModerationCheckRepository;
import pt.isep.enorm.ref.youtube.repository.CommentRepository;
import pt.isep.enorm.ref.youtube.repository.CommentSettingsChangeRepository;
import pt.isep.enorm.ref.youtube.repository.VideoModerationCheckRepository;
import pt.isep.enorm.ref.youtube.repository.VideoRepository;
import pt.isep.enorm.ref.youtube.web.error.ResourceNotFoundException;

@Transactional(readOnly = true)
public abstract class GeneratedModerationService {

    private final VideoModerationCheckRepository videoModerationCheckRepository;
    private final CommentModerationCheckRepository commentModerationCheckRepository;
    private final CommentSettingsChangeRepository commentSettingsChangeRepository;
    private final VideoRepository videoRepository;
    private final CommentRepository commentRepository;

    protected GeneratedModerationService(
        VideoModerationCheckRepository videoModerationCheckRepository,
        CommentModerationCheckRepository commentModerationCheckRepository,
        CommentSettingsChangeRepository commentSettingsChangeRepository,
        VideoRepository videoRepository,
        CommentRepository commentRepository
    ) {
        this.videoModerationCheckRepository = videoModerationCheckRepository;
        this.commentModerationCheckRepository = commentModerationCheckRepository;
        this.commentSettingsChangeRepository = commentSettingsChangeRepository;
        this.videoRepository = videoRepository;
        this.commentRepository = commentRepository;
    }

    public List<VideoModerationCheck> listVideoChecks(Long videoId) {
        loadVideo(videoId);
        return videoModerationCheckRepository.findByVideoId(videoId);
    }

    public List<CommentModerationCheck> listCommentChecks(Long commentId) {
        loadComment(commentId);
        return commentModerationCheckRepository.findByCommentId(commentId);
    }

    @Transactional
    public VideoModerationCheck createVideoCheck(YoutubeUser moderator, Long videoId, VideoModerationCheck request) {
        if (moderator == null) {
            throw new IllegalArgumentException("Moderator is required.");
        }

        if (request == null || request.getType() == null || request.getResult() == null) {
            throw new IllegalArgumentException("Moderation type and result are required.");
        }

        VideoModerationCheck check = new VideoModerationCheck();
        check.setType(request.getType());
        check.setResult(request.getResult());
        check.setTimestamp(Instant.now());
        check.setVideo(loadVideo(videoId));
        check.setReviewedBy(moderator);

        return videoModerationCheckRepository.save(check);
    }

    @Transactional
    public CommentModerationCheck createCommentCheck(YoutubeUser moderator, Long commentId, CommentModerationCheck request) {
        if (moderator == null) {
            throw new IllegalArgumentException("Moderator is required.");
        }

        if (request == null || request.getType() == null || request.getResult() == null) {
            throw new IllegalArgumentException("Moderation type and result are required.");
        }

        CommentModerationCheck check = new CommentModerationCheck();
        check.setType(request.getType());
        check.setResult(request.getResult());
        check.setTimestamp(Instant.now());
        check.setComment(loadComment(commentId));
        check.setReviewedBy(moderator);

        return commentModerationCheckRepository.save(check);
    }

    @Transactional
    public CommentSettingsChange changeCommentStatus(YoutubeUser moderator, Long videoId, CommentStatus newStatus) {
        if (moderator == null) {
            throw new IllegalArgumentException("Moderator is required.");
        }

        if (newStatus == null) {
            throw new IllegalArgumentException("New comment status is required.");
        }

        Video video = loadVideo(videoId);
        video.setCommentStatus(newStatus);

        CommentSettingsChange change = new CommentSettingsChange();
        change.setModerator(moderator);
        change.setVideo(video);
        change.setNewStatus(newStatus);
        change.setTimestamp(Instant.now());

        commentSettingsChangeRepository.save(change);
        return change;
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

