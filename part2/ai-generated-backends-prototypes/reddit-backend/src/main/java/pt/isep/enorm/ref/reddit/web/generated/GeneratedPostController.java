package pt.isep.enorm.ref.reddit.web.generated;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.validation.Valid;
import pt.isep.enorm.ref.reddit.domain.Post;
import pt.isep.enorm.ref.reddit.domain.RedditUser;
import pt.isep.enorm.ref.reddit.service.PostService;

public abstract class GeneratedPostController {

    private final PostService postService;

    protected GeneratedPostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/posts")
    public List<Post> listPosts(@RequestParam Long subredditId) {
        return postService.listPostsForSubreddit(subredditId);
    }

    @GetMapping("/posts/{postId}")
    public Post getPost(@PathVariable Long postId) {
        return postService.getPost(postId);
    }

    @PostMapping("/subreddits/{subredditId}/posts")
    public ResponseEntity<Post> createPost(
        @AuthenticationPrincipal RedditUser currentUser,
        @PathVariable Long subredditId,
        @Valid @RequestBody Post request
    ) {
        Post savedPost = postService.createPost(currentUser, subredditId, request);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedPost);
    }

    @PutMapping("/posts/{postId}")
    public Post updatePost(@PathVariable Long postId, @Valid @RequestBody Post request) {
        return postService.updatePost(postId, request);
    }

    @DeleteMapping("/posts/{postId}")
    public ResponseEntity<Void> deletePost(@PathVariable Long postId) {
        postService.deletePost(postId);
        return ResponseEntity.noContent().build();
    }
}




