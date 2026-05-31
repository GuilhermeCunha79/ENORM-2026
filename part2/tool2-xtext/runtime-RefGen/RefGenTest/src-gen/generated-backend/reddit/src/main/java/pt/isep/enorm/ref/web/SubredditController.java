package pt.isep.enorm.ref.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.isep.enorm.ref.service.SubredditService;
import pt.isep.enorm.ref.web.generated.GeneratedSubredditController;

@RestController
@RequestMapping("/api/subreddits")
public class SubredditController extends GeneratedSubredditController {
    public SubredditController(SubredditService service) {
        super(service);
    }
}
