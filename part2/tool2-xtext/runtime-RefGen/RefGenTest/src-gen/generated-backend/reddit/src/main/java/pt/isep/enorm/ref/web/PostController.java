package pt.isep.enorm.ref.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.isep.enorm.ref.service.PostService;
import pt.isep.enorm.ref.web.generated.GeneratedPostController;

@RestController
@RequestMapping("/api/posts")
public class PostController extends GeneratedPostController {
    public PostController(PostService service) {
        super(service);
    }
}
