package pt.isep.enorm.ref.reddit.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.isep.enorm.ref.reddit.service.VoteService;
import pt.isep.enorm.ref.reddit.web.generated.GeneratedVoteController;

@RestController
@RequestMapping("/api")
public class VoteController extends GeneratedVoteController {

    public VoteController(VoteService likeService) {
        super(likeService);
    }
}


