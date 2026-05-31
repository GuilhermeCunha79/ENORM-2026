package pt.isep.enorm.ref.web.generated;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import pt.isep.enorm.ref.domain.Comment;
import pt.isep.enorm.ref.service.CommentService;

public abstract class GeneratedCommentController {
    private final CommentService service;

    protected GeneratedCommentController(CommentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Comment> list(
            @RequestParam(required = false) String sortBy,
            @RequestParam(required = false, defaultValue = "ASC") String direction) {
        return service.findAll(sortBy, direction);
    }

    @GetMapping("/{id}")
    public Comment get(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public ResponseEntity<Comment> create(@RequestBody Comment body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(body));
    }
}
