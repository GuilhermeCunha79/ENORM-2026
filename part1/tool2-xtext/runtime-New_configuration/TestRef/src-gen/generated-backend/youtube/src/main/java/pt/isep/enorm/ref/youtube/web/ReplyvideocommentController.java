package pt.isep.enorm.ref.youtube.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.isep.enorm.ref.youtube.service.ReplyvideocommentService;
import pt.isep.enorm.ref.youtube.web.generated.GeneratedReplyvideocommentController;

@RestController
@RequestMapping("/api/replyvideocomments")
public class ReplyvideocommentController extends GeneratedReplyvideocommentController {
    public ReplyvideocommentController(ReplyvideocommentService service) {
        super(service);
    }
}
