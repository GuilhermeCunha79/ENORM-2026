package pt.isep.enorm.ref.amazon.web.generated;

import pt.isep.enorm.ref.amazon.domain.ContextType;
import pt.isep.enorm.ref.amazon.repository.ContextTypeRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/contexts")
public class GeneratedContextController {
    private final ContextTypeRepository repository;

    public GeneratedContextController(ContextTypeRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<ContextType> list() {
        return repository.findAll();
    }

    @GetMapping("/{contextId}")
    public ContextType get(@PathVariable String contextId) {
        return repository.findById(Long.valueOf(contextId)).orElseThrow();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ContextType create(@RequestBody ContextType payload) {
        return repository.save(payload);
    }

    @PutMapping("/{contextId}")
    public ContextType update(@PathVariable String contextId, @RequestBody ContextType payload) {
        payload.setId(Long.valueOf(contextId));
        return repository.save(payload);
    }

    @DeleteMapping("/{contextId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String contextId) {
        repository.deleteById(Long.valueOf(contextId));
    }
}
