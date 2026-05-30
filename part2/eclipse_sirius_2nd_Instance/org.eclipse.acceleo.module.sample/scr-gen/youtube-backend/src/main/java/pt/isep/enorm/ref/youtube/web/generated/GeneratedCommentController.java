package pt.isep.enorm.ref.youtube.web.generated;

import pt.isep.enorm.ref.youtube.domain.Comment;
import pt.isep.enorm.ref.youtube.service.generated.GeneratedCommentService;
import pt.isep.enorm.ref.youtube.service.generated.GeneratedModerationService;
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
public class GeneratedCommentController {
    private final GeneratedCommentService service;
    private final GeneratedModerationService moderationService;

    public GeneratedCommentController(GeneratedCommentService service, GeneratedModerationService moderationService) { this.service = service; this.moderationService = moderationService; }

    @GetMapping public List<Comment> list(@RequestParam(required = false) String videoId) { return service.list(); }
    @GetMapping("/{commentId}") public Comment get(@PathVariable String commentId) { return service.get(commentId); }
    @PostMapping @ResponseStatus(HttpStatus.CREATED) public Comment create(@RequestParam(required = false) String videoId, @RequestBody Comment payload) { moderationService.moderateComment(null, payload); return service.create(payload); }
    @PutMapping("/{commentId}") public Comment update(@PathVariable String commentId, @RequestBody Comment payload) { moderationService.moderateComment(commentId, payload); return service.update(commentId, payload); }
    @DeleteMapping("/{commentId}") @ResponseStatus(HttpStatus.NO_CONTENT) public void delete(@PathVariable String commentId) { service.delete(commentId); }
}
