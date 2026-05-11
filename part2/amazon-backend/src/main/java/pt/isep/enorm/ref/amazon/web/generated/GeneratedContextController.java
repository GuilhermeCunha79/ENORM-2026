package pt.isep.enorm.ref.amazon.web.generated;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import jakarta.validation.Valid;
import pt.isep.enorm.ref.amazon.domain.ContextType;
import pt.isep.enorm.ref.amazon.service.ContextService;

public abstract class GeneratedContextController {

    private final ContextService contextService;

    protected GeneratedContextController(ContextService contextService) {
        this.contextService = contextService;
    }

    @GetMapping
    public List<ContextType> listContexts() {
        return contextService.listContexts();
    }

    @GetMapping("/{contextId}")
    public ContextType getContext(@PathVariable Long contextId) {
        return contextService.getContext(contextId);
    }

    @PostMapping
    public ResponseEntity<ContextType> createContext(@Valid @RequestBody ContextType request) {
        ContextType context = contextService.createContext(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(context);
    }

    @PutMapping("/{contextId}")
    public ContextType updateContext(@PathVariable Long contextId, @Valid @RequestBody ContextType request) {
        return contextService.updateContext(contextId, request);
    }

    @DeleteMapping("/{contextId}")
    public ResponseEntity<Void> deleteContext(@PathVariable Long contextId) {
        contextService.deleteContext(contextId);
        return ResponseEntity.noContent().build();
    }

}
