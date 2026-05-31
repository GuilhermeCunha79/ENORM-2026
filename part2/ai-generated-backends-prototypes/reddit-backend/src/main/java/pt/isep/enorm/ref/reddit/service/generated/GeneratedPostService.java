package pt.isep.enorm.ref.reddit.service.generated;

import java.time.LocalDate;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import pt.isep.enorm.ref.reddit.domain.Subreddit;
import pt.isep.enorm.ref.reddit.domain.Post;
import pt.isep.enorm.ref.reddit.domain.RedditUser;
import pt.isep.enorm.ref.reddit.domain.enums.CommentStatus;
import pt.isep.enorm.ref.reddit.domain.enums.ContentStatus;
import pt.isep.enorm.ref.reddit.repository.SubredditRepository;
import pt.isep.enorm.ref.reddit.repository.PostRepository;
import pt.isep.enorm.ref.reddit.web.error.ResourceNotFoundException;

@Transactional(readOnly = true)
public abstract class GeneratedPostService {

    private final PostRepository postRepository;
    private final SubredditRepository subredditRepository;

    protected GeneratedPostService(PostRepository postRepository, SubredditRepository subredditRepository) {
        this.postRepository = postRepository;
        this.subredditRepository = subredditRepository;
    }

    public List<Post> listPostsForSubreddit(Long subredditId) {
        loadSubreddit(subredditId);
        return postRepository.findBySubredditIdOrderByUploadDateDesc(subredditId);
    }

    public Post getPost(Long postId) {
        return loadPost(postId);
    }

    @Transactional
    public Post createPost(RedditUser owner, Long subredditId, Post request) {
        if (owner == null) {
            throw new IllegalArgumentException("Owner is required.");
        }

        validatePostRequest(request);
        Subreddit subreddit = loadSubreddit(subredditId);

        if (!subreddit.getOwner().getId().equals(owner.getId())) {
            throw new IllegalStateException("Only the subreddit owner can upload posts.");
        }

        Post post = new Post();
        post.setSubreddit(subreddit);
        post.setTitle(request.getTitle());
        post.setDescription(request.getDescription());
        post.setDuration(request.getDuration());
        post.setUploadDate(request.getUploadDate() == null ? LocalDate.now() : request.getUploadDate());
        post.setCreationDate(request.getCreationDate() == null ? LocalDate.now() : request.getCreationDate());
        post.setCommentStatus(request.getCommentStatus() == null ? CommentStatus.ENABLED : request.getCommentStatus());
        post.setStatus(request.getStatus() == null ? ContentStatus.ACTIVE : request.getStatus());

        return postRepository.save(post);
    }

    @Transactional
    public Post updatePost(Long postId, Post request) {
        Post post = loadPost(postId);

        if (request.getTitle() != null && !request.getTitle().isBlank()) {
            post.setTitle(request.getTitle());
        }

        if (request.getDescription() != null && !request.getDescription().isBlank()) {
            post.setDescription(request.getDescription());
        }

        if (request.getDuration() != null && request.getDuration() > 0) {
            post.setDuration(request.getDuration());
        }

        if (request.getUploadDate() != null) {
            post.setUploadDate(request.getUploadDate());
        }

        if (request.getCommentStatus() != null) {
            post.setCommentStatus(request.getCommentStatus());
        }

        if (request.getStatus() != null) {
            post.setStatus(request.getStatus());
        }

        return postRepository.save(post);
    }

    @Transactional
    public void deletePost(Long postId) {
        Post post = loadPost(postId);
        postRepository.delete(post);
    }

    private Subreddit loadSubreddit(Long subredditId) {
        return subredditRepository.findById(subredditId)
            .orElseThrow(() -> new ResourceNotFoundException("Subreddit '%s' was not found.".formatted(subredditId)));
    }

    private Post loadPost(Long postId) {
        return postRepository.findById(postId)
            .orElseThrow(() -> new ResourceNotFoundException("Post '%s' was not found.".formatted(postId)));
    }

    private void validatePostRequest(Post request) {
        if (request == null) {
            throw new IllegalArgumentException("Post payload is required.");
        }

        if (request.getTitle() == null || request.getTitle().isBlank()) {
            throw new IllegalArgumentException("Post title is required.");
        }

        if (request.getDescription() == null || request.getDescription().isBlank()) {
            throw new IllegalArgumentException("Post description is required.");
        }

        if (request.getDuration() == null || request.getDuration() <= 0) {
            throw new IllegalArgumentException("Post duration must be greater than zero.");
        }
    }
}




