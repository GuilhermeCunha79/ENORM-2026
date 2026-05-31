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
import pt.isep.enorm.ref.domain.SortingPolicy;
import pt.isep.enorm.ref.repository.SortingPolicyRepository;

@RestController
@RequestMapping("/api/policies/sorting-policies")
public class SortingPolicyController {
    private final SortingPolicyRepository repository;

    public SortingPolicyController(SortingPolicyRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<SortingPolicy> list() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public SortingPolicy get(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new IllegalArgumentException("SortingPolicy not found: " + id));
    }

    @PostMapping
    public ResponseEntity<SortingPolicy> create(@RequestBody SortingPolicy body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(body));
    }
}
