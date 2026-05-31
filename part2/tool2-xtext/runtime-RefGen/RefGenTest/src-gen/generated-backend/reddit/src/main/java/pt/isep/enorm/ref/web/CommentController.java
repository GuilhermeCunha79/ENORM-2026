package pt.isep.enorm.ref.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.isep.enorm.ref.service.CommentService;
import pt.isep.enorm.ref.web.generated.GeneratedCommentController;

@RestController
@RequestMapping("/api/comments")
public class CommentController extends GeneratedCommentController {
    public CommentController(CommentService service) {
        super(service);
    }
}
