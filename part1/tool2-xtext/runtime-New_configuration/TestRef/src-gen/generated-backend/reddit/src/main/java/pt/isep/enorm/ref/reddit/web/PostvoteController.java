package pt.isep.enorm.ref.reddit.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.isep.enorm.ref.reddit.service.PostvoteService;
import pt.isep.enorm.ref.reddit.web.generated.GeneratedPostvoteController;

@RestController
@RequestMapping("/api/postvotes")
public class PostvoteController extends GeneratedPostvoteController {
    public PostvoteController(PostvoteService service) {
        super(service);
    }
}
