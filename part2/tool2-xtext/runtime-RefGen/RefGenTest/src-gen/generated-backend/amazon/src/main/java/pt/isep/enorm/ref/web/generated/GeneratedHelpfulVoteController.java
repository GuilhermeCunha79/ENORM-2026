package pt.isep.enorm.ref.web.generated;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pt.isep.enorm.ref.domain.HelpfulVote;
import pt.isep.enorm.ref.service.HelpfulVoteService;

public abstract class GeneratedHelpfulVoteController {
    private final HelpfulVoteService service;

    protected GeneratedHelpfulVoteController(HelpfulVoteService service) {
        this.service = service;
    }

    @GetMapping
    public List<HelpfulVote> list() {
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<HelpfulVote> submit(@RequestBody HelpfulVote body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.submit(body));
    }
}
