package pt.isep.enorm.ref.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.isep.enorm.ref.service.PostVoteService;
import pt.isep.enorm.ref.web.generated.GeneratedPostVoteController;

@RestController
@RequestMapping("/api/post-votes")
public class PostVoteController extends GeneratedPostVoteController {
    public PostVoteController(PostVoteService service) {
        super(service);
    }
}
