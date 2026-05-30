package pt.isep.enorm.ref.amazon.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.isep.enorm.ref.amazon.service.TopThreadCommentService;
import pt.isep.enorm.ref.amazon.web.generated.GeneratedTopThreadCommentController;

@RestController
@RequestMapping("/api/top-thread-comments")
public class TopThreadCommentController extends GeneratedTopThreadCommentController {
    public TopThreadCommentController(TopThreadCommentService service) {
        super(service);
    }
}
