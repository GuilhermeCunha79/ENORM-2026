package pt.isep.enorm.ref.reddit.web.generated;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pt.isep.enorm.ref.reddit.domain.CommentVote;
import pt.isep.enorm.ref.reddit.service.CommentVoteService;

public abstract class GeneratedCommentVoteController {
    private final CommentVoteService service;

    protected GeneratedCommentVoteController(CommentVoteService service) {
        this.service = service;
    }

    @GetMapping
    public List<CommentVote> list() {
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<CommentVote> submit(@RequestBody CommentVote body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.submit(body));
    }
}
