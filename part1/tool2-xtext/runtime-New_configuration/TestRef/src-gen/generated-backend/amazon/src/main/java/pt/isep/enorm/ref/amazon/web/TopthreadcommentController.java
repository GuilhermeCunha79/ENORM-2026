package pt.isep.enorm.ref.amazon.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.isep.enorm.ref.amazon.service.TopthreadcommentService;
import pt.isep.enorm.ref.amazon.web.generated.GeneratedTopthreadcommentController;

@RestController
@RequestMapping("/api/topthreadcomments")
public class TopthreadcommentController extends GeneratedTopthreadcommentController {
    public TopthreadcommentController(TopthreadcommentService service) {
        super(service);
    }
}
