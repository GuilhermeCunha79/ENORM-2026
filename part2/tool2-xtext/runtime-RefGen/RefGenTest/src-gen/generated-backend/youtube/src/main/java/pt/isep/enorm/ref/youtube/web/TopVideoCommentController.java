package pt.isep.enorm.ref.youtube.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.isep.enorm.ref.youtube.service.TopVideoCommentService;
import pt.isep.enorm.ref.youtube.web.generated.GeneratedTopVideoCommentController;

@RestController
@RequestMapping("/api/top-video-comments")
public class TopVideoCommentController extends GeneratedTopVideoCommentController {
    public TopVideoCommentController(TopVideoCommentService service) {
        super(service);
    }
}
