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
import pt.isep.enorm.ref.amazon.service.command.CreateContextCommand;
import pt.isep.enorm.ref.amazon.service.command.UpdateContextCommand;
import pt.isep.enorm.ref.amazon.web.dto.ContextResponse;
import pt.isep.enorm.ref.amazon.web.dto.CreateContextRequest;
import pt.isep.enorm.ref.amazon.web.dto.UpdateContextRequest;

public abstract class GeneratedContextController {

    private final ContextService contextService;

    protected GeneratedContextController(ContextService contextService) {
        this.contextService = contextService;
    }

    @GetMapping
    public List<ContextResponse> listContexts() {
        return contextService.listContexts().stream()
            .map(this::toResponse)
            .toList();
    }

    @GetMapping("/{contextId}")
    public ContextResponse getContext(@PathVariable Long contextId) {
        return toResponse(contextService.getContext(contextId));
    }

    @PostMapping
    public ResponseEntity<ContextResponse> createContext(@Valid @RequestBody CreateContextRequest request) {
        ContextType context = contextService.createContext(toCreateCommand(request));
        return ResponseEntity.status(HttpStatus.CREATED).body(toResponse(context));
    }

    @PutMapping("/{contextId}")
    public ContextResponse updateContext(@PathVariable Long contextId, @Valid @RequestBody UpdateContextRequest request) {
        ContextType context = contextService.updateContext(contextId, toUpdateCommand(request));
        return toResponse(context);
    }

    @DeleteMapping("/{contextId}")
    public ResponseEntity<Void> deleteContext(@PathVariable Long contextId) {
        contextService.deleteContext(contextId);
        return ResponseEntity.noContent().build();
    }

    protected CreateContextCommand toCreateCommand(CreateContextRequest request) {
        return new CreateContextCommand(request.name(), request.kind(), request.resources());
    }

    protected UpdateContextCommand toUpdateCommand(UpdateContextRequest request) {
        return new UpdateContextCommand(request.name(), request.kind(), request.resources());
    }

    protected ContextResponse toResponse(ContextType context) {
        List<String> resources = context.getResources().stream()
            .map(resource -> resource.getResourceName())
            .toList();
        return new ContextResponse(context.getId(), context.getName(), context.getKind(), resources);
    }
}
