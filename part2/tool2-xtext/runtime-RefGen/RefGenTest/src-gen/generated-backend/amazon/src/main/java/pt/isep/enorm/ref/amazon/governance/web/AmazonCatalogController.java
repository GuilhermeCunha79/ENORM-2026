package pt.isep.enorm.ref.amazon.governance.web;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.isep.enorm.ref.amazon.governance.domain.AmazonCatalog;
import pt.isep.enorm.ref.amazon.governance.repository.AmazonCatalogRepository;

@RestController
@RequestMapping("/api/contexts/amazon-catalog")
public class AmazonCatalogController {
    private final AmazonCatalogRepository repository;

    public AmazonCatalogController(AmazonCatalogRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<AmazonCatalog> list() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public AmazonCatalog get(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new IllegalArgumentException("AmazonCatalog not found: " + id));
    }

    @PostMapping
    public ResponseEntity<AmazonCatalog> create(@RequestBody AmazonCatalog body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(body));
    }
}
