package pt.isep.enorm.ref.youtube.governance.web;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.isep.enorm.ref.youtube.governance.domain.YoutubePlatform;
import pt.isep.enorm.ref.youtube.governance.repository.YoutubePlatformRepository;

@RestController
@RequestMapping("/api/contexts/youtube-platform")
public class YoutubePlatformController {
    private final YoutubePlatformRepository repository;

    public YoutubePlatformController(YoutubePlatformRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<YoutubePlatform> list() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public YoutubePlatform get(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new IllegalArgumentException("YoutubePlatform not found: " + id));
    }

    @PostMapping
    public ResponseEntity<YoutubePlatform> create(@RequestBody YoutubePlatform body) {
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(body));
    }
}
