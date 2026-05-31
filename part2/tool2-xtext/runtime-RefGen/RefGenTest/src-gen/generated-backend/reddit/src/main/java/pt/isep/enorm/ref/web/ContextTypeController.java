package pt.isep.enorm.ref.web;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.isep.enorm.ref.domain.ContextType;
import pt.isep.enorm.ref.repository.ContextTypeRepository;

@RestController
@RequestMapping("/api/contexts")
public class ContextTypeController {
    private final ContextTypeRepository repository;

    public ContextTypeController(ContextTypeRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<ContextType> list() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ContextType get(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new IllegalArgumentException("ContextType not found: " + id));
    }

    @PostMapping
    public ResponseEntity<ContextType> create(@RequestBody ContextType body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(body));
    }
}
