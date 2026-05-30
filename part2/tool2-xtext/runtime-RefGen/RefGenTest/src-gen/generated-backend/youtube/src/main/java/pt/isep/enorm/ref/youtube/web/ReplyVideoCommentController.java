package pt.isep.enorm.ref.youtube.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.isep.enorm.ref.youtube.service.ReplyVideoCommentService;
import pt.isep.enorm.ref.youtube.web.generated.GeneratedReplyVideoCommentController;

@RestController
@RequestMapping("/api/reply-video-comments")
public class ReplyVideoCommentController extends GeneratedReplyVideoCommentController {
    public ReplyVideoCommentController(ReplyVideoCommentService service) {
        super(service);
    }
}
