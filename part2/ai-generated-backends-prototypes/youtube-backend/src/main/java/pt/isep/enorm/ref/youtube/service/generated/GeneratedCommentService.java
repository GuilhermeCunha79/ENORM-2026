package pt.isep.enorm.ref.youtube.service.generated;

import java.time.LocalDate;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import pt.isep.enorm.ref.youtube.domain.Comment;
import pt.isep.enorm.ref.youtube.domain.Video;
import pt.isep.enorm.ref.youtube.domain.YoutubeUser;
import pt.isep.enorm.ref.youtube.domain.enums.ContentStatus;
import pt.isep.enorm.ref.youtube.repository.CommentRepository;
import pt.isep.enorm.ref.youtube.repository.VideoRepository;
import pt.isep.enorm.ref.youtube.web.error.ResourceNotFoundException;

@Transactional(readOnly = true)
public abstract class GeneratedCommentService {

    private final CommentRepository commentRepository;
    private final VideoRepository videoRepository;

    protected GeneratedCommentService(CommentRepository commentRepository, VideoRepository videoRepository) {
        this.commentRepository = commentRepository;
        this.videoRepository = videoRepository;
    }

    public List<Comment> listCommentsForVideo(Long videoId) {
        loadVideo(videoId);
        return commentRepository.findByVideoIdOrderByCreationDateAsc(videoId);
    }

    public Comment getComment(Long commentId) {
        return loadComment(commentId);
    }

    @Transactional
    public Comment createComment(YoutubeUser author, Long videoId, Comment request) {
        if (author == null) {
            throw new IllegalArgumentException("Author is required.");
        }

        if (request == null || request.getText() == null || request.getText().isBlank()) {
            throw new IllegalArgumentException("Comment text is required.");
        }

        Video video = loadVideo(videoId);

        Comment comment = new Comment();
        comment.setAuthor(author);
        comment.setVideo(video);
        comment.setText(request.getText());
        comment.setCreationDate(request.getCreationDate() == null ? LocalDate.now() : request.getCreationDate());
        comment.setStatus(request.getStatus() == null ? ContentStatus.ACTIVE : request.getStatus());

        if (request.getParent() != null && request.getParent().getId() != null) {
            Comment parent = loadComment(request.getParent().getId());
            comment.setParent(parent);
        }

        return commentRepository.save(comment);
    }

    @Transactional
    public Comment updateComment(Long commentId, Comment request) {
        Comment comment = loadComment(commentId);

        if (request.getText() != null && !request.getText().isBlank()) {
            comment.setText(request.getText());
        }

        if (request.getStatus() != null) {
            comment.setStatus(request.getStatus());
        }

        return commentRepository.save(comment);
    }

    @Transactional
    public void deleteComment(Long commentId) {
        Comment comment = loadComment(commentId);
        commentRepository.delete(comment);
    }

    private Comment loadComment(Long commentId) {
        return commentRepository.findById(commentId)
            .orElseThrow(() -> new ResourceNotFoundException("Comment '%s' was not found.".formatted(commentId)));
    }

    private Video loadVideo(Long videoId) {
        return videoRepository.findById(videoId)
            .orElseThrow(() -> new ResourceNotFoundException("Video '%s' was not found.".formatted(videoId)));
    }
}

