package pt.isep.enorm.ref.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.isep.enorm.ref.service.TopThreadCommentService;
import pt.isep.enorm.ref.web.generated.GeneratedTopThreadCommentController;

@RestController
@RequestMapping("/api/top-thread-comments")
public class TopThreadCommentController extends GeneratedTopThreadCommentController {
    public TopThreadCommentController(TopThreadCommentService service) {
        super(service);
    }
}
