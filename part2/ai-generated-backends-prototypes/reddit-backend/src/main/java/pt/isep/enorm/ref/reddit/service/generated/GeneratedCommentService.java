package pt.isep.enorm.ref.reddit.service.generated;

import java.time.LocalDate;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import pt.isep.enorm.ref.reddit.domain.Comment;
import pt.isep.enorm.ref.reddit.domain.Post;
import pt.isep.enorm.ref.reddit.domain.RedditUser;
import pt.isep.enorm.ref.reddit.domain.enums.ContentStatus;
import pt.isep.enorm.ref.reddit.repository.CommentRepository;
import pt.isep.enorm.ref.reddit.repository.PostRepository;
import pt.isep.enorm.ref.reddit.web.error.ResourceNotFoundException;

@Transactional(readOnly = true)
public abstract class GeneratedCommentService {

    private final CommentRepository commentRepository;
    private final PostRepository postRepository;

    protected GeneratedCommentService(CommentRepository commentRepository, PostRepository postRepository) {
        this.commentRepository = commentRepository;
        this.postRepository = postRepository;
    }

    public List<Comment> listCommentsForPost(Long postId) {
        loadPost(postId);
        return commentRepository.findByPostIdOrderByCreationDateAsc(postId);
    }

    public Comment getComment(Long commentId) {
        return loadComment(commentId);
    }

    @Transactional
    public Comment createComment(RedditUser author, Long postId, Comment request) {
        if (author == null) {
            throw new IllegalArgumentException("Author is required.");
        }

        if (request == null || request.getText() == null || request.getText().isBlank()) {
            throw new IllegalArgumentException("Comment text is required.");
        }

        Post post = loadPost(postId);

        Comment comment = new Comment();
        comment.setAuthor(author);
        comment.setPost(post);
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

    private Post loadPost(Long postId) {
        return postRepository.findById(postId)
            .orElseThrow(() -> new ResourceNotFoundException("Post '%s' was not found.".formatted(postId)));
    }
}




