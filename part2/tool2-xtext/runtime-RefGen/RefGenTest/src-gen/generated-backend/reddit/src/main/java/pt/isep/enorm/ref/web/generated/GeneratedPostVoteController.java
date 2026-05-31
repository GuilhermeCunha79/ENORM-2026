package pt.isep.enorm.ref.web.generated;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pt.isep.enorm.ref.domain.PostVote;
import pt.isep.enorm.ref.service.PostVoteService;

public abstract class GeneratedPostVoteController {
    private final PostVoteService service;

    protected GeneratedPostVoteController(PostVoteService service) {
        this.service = service;
    }

    @GetMapping
    public List<PostVote> list() {
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<PostVote> submit(@RequestBody PostVote body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.submit(body));
    }
}
