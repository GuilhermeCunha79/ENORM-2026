package pt.isep.enorm.ref.reddit.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.isep.enorm.ref.reddit.service.CommentVoteService;
import pt.isep.enorm.ref.reddit.web.generated.GeneratedCommentVoteController;

@RestController
@RequestMapping("/api/comment-votes")
public class CommentVoteController extends GeneratedCommentVoteController {
    public CommentVoteController(CommentVoteService service) {
        super(service);
    }
}
