package pt.isep.enorm.ref.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.isep.enorm.ref.service.TopVideoCommentService;
import pt.isep.enorm.ref.web.generated.GeneratedTopVideoCommentController;

@RestController
@RequestMapping("/api/top-video-comments")
public class TopVideoCommentController extends GeneratedTopVideoCommentController {
    public TopVideoCommentController(TopVideoCommentService service) {
        super(service);
    }
}
