package pt.isep.enorm.ref.amazon.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.isep.enorm.ref.amazon.service.HelpfulVoteService;
import pt.isep.enorm.ref.amazon.web.generated.GeneratedHelpfulVoteController;

@RestController
@RequestMapping("/api/comments/{commentId}/votes")
public class HelpfulVoteController extends GeneratedHelpfulVoteController {

    public HelpfulVoteController(HelpfulVoteService helpfulVoteService) {
        super(helpfulVoteService);
    }
}
