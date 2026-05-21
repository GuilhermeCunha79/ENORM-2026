package pt.isep.enorm.ref.reddit.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.isep.enorm.ref.reddit.service.PostService;
import pt.isep.enorm.ref.reddit.web.generated.GeneratedPostController;

@RestController
@RequestMapping("/api/posts")
public class PostController extends GeneratedPostController {
    public PostController(PostService service) {
        super(service);
    }
}
