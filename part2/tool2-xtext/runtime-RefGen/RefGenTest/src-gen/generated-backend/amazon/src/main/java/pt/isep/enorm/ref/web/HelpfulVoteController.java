package pt.isep.enorm.ref.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.isep.enorm.ref.service.HelpfulVoteService;
import pt.isep.enorm.ref.web.generated.GeneratedHelpfulVoteController;

@RestController
@RequestMapping("/api/helpful-votes")
public class HelpfulVoteController extends GeneratedHelpfulVoteController {
    public HelpfulVoteController(HelpfulVoteService service) {
        super(service);
    }
}
