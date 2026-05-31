package pt.isep.enorm.ref.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.isep.enorm.ref.service.CommentVoteService;
import pt.isep.enorm.ref.web.generated.GeneratedCommentVoteController;

@RestController
@RequestMapping("/api/comment-votes")
public class CommentVoteController extends GeneratedCommentVoteController {
    public CommentVoteController(CommentVoteService service) {
        super(service);
    }
}
