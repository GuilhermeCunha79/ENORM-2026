package pt.isep.enorm.ref.reddit.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.isep.enorm.ref.reddit.service.SubredditService;
import pt.isep.enorm.ref.reddit.web.generated.GeneratedSubredditController;

@RestController
@RequestMapping("/api")
public class SubredditController extends GeneratedSubredditController {

    public SubredditController(SubredditService subredditService) {
        super(subredditService);
    }
}



