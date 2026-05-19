package pt.isep.enorm.ref.amazon.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.isep.enorm.ref.amazon.service.ReplycommentService;
import pt.isep.enorm.ref.amazon.web.generated.GeneratedReplycommentController;

@RestController
@RequestMapping("/api/replycomments")
public class ReplycommentController extends GeneratedReplycommentController {
    public ReplycommentController(ReplycommentService service) {
        super(service);
    }
}
