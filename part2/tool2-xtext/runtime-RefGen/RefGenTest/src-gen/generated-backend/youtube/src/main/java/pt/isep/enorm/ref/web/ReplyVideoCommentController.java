package pt.isep.enorm.ref.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.isep.enorm.ref.service.ReplyVideoCommentService;
import pt.isep.enorm.ref.web.generated.GeneratedReplyVideoCommentController;

@RestController
@RequestMapping("/api/reply-video-comments")
public class ReplyVideoCommentController extends GeneratedReplyVideoCommentController {
    public ReplyVideoCommentController(ReplyVideoCommentService service) {
        super(service);
    }
}
