package pt.isep.enorm.ref.web.generated;

import pt.isep.enorm.ref.domain.CommentReview;
import pt.isep.enorm.ref.service.generated.GeneratedCommentReviewService;
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
@RequestMapping("/api/comments")
public class GeneratedCommentReviewController {
    private final GeneratedCommentReviewService service;

    public GeneratedCommentReviewController(GeneratedCommentReviewService service) { this.service = service; }

    @GetMapping
    public List<CommentReview> list(@RequestParam(required = false) String productId) { return service.list(); }

    @GetMapping("/{commentId}")
    public CommentReview get(@PathVariable String commentId) { return service.get(commentId); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CommentReview create(@RequestParam(required = false) String productId, @RequestBody CommentReview payload) { return service.create(payload); }

    @PutMapping("/{commentId}")
    public CommentReview update(@PathVariable String commentId, @RequestBody CommentReview payload) { return service.update(commentId, payload); }

    @DeleteMapping("/{commentId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String commentId) { service.delete(commentId); }
}
