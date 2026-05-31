package pt.isep.enorm.ref.web.generated;

import pt.isep.enorm.ref.domain.Post;
import pt.isep.enorm.ref.domain.Comment;
import pt.isep.enorm.ref.service.generated.GeneratedCommentService;
import pt.isep.enorm.ref.service.generated.GeneratedModerationService;
import pt.isep.enorm.ref.service.generated.GeneratedPostService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")
public class GeneratedPostController {
    private final GeneratedPostService service;
    private final GeneratedCommentService commentService;
    private final GeneratedModerationService moderationService;

    public GeneratedPostController(GeneratedPostService service, GeneratedCommentService commentService, GeneratedModerationService moderationService) { this.service = service; this.commentService = commentService; this.moderationService = moderationService; }

    @GetMapping public List<Post> list(@RequestParam(required = false) String subredditId) { return service.list(); }
    @GetMapping("/{postId}") public Post get(@PathVariable String postId) { return service.get(postId); }
    @PostMapping @ResponseStatus(HttpStatus.CREATED) public Post create(@RequestBody Post payload) { moderationService.moderatePost(null, payload); return service.create(payload); }
    @PutMapping("/{postId}") public Post update(@PathVariable String postId, @RequestBody Post payload) { moderationService.moderatePost(postId, payload); return service.update(postId, payload); }
    @DeleteMapping("/{postId}") @ResponseStatus(HttpStatus.NO_CONTENT) public void delete(@PathVariable String postId) { service.delete(postId); }

    @PostMapping("/{postId}/comments")
    @ResponseStatus(HttpStatus.CREATED)
    public Comment comment(@PathVariable String postId, @RequestBody Comment payload) { moderationService.moderateComment(null, payload); return commentService.create(payload); }
}
