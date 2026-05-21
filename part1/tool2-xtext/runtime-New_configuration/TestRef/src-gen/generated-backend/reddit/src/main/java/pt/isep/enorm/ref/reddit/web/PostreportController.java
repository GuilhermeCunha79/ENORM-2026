package pt.isep.enorm.ref.reddit.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.isep.enorm.ref.reddit.service.PostreportService;
import pt.isep.enorm.ref.reddit.web.generated.GeneratedPostreportController;

@RestController
@RequestMapping("/api/postreports")
public class PostreportController extends GeneratedPostreportController {
    public PostreportController(PostreportService service) {
        super(service);
    }
}
