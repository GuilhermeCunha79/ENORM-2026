package pt.isep.enorm.ref.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.isep.enorm.ref.service.ReplyCommentService;
import pt.isep.enorm.ref.web.generated.GeneratedReplyCommentController;

@RestController
@RequestMapping("/api/reply-comments")
public class ReplyCommentController extends GeneratedReplyCommentController {
    public ReplyCommentController(ReplyCommentService service) {
        super(service);
    }
}
