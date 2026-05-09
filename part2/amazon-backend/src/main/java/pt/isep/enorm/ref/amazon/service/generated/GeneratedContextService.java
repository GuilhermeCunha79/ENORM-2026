package pt.isep.enorm.ref.amazon.service.generated;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import pt.isep.enorm.ref.amazon.domain.ContextResource;
import pt.isep.enorm.ref.amazon.domain.ContextType;
import pt.isep.enorm.ref.amazon.repository.ContextTypeRepository;
import pt.isep.enorm.ref.amazon.service.command.CreateContextCommand;
import pt.isep.enorm.ref.amazon.service.command.UpdateContextCommand;
import pt.isep.enorm.ref.amazon.web.error.ResourceNotFoundException;

@Transactional(readOnly = true)
public abstract class GeneratedContextService {

    private final ContextTypeRepository contextTypeRepository;

    protected GeneratedContextService(ContextTypeRepository contextTypeRepository) {
        this.contextTypeRepository = contextTypeRepository;
    }

    public List<ContextType> listContexts() {
        return contextTypeRepository.findAll();
    }

    public ContextType getContext(Long contextId) {
        return loadContext(contextId);
    }

    @Transactional
    public ContextType createContext(CreateContextCommand command) {
        ContextType contextType = new ContextType();
        contextType.setName(command.name());
        contextType.setKind(command.kind());
        for (String resource : command.resources()) {
            contextType.addResource(toResource(resource));
        }
        return contextTypeRepository.save(contextType);
    }

    @Transactional
    public ContextType updateContext(Long contextId, UpdateContextCommand command) {
        ContextType contextType = loadContext(contextId);
        if (command.name() != null && !command.name().isBlank()) {
            contextType.setName(command.name());
        }
        if (command.kind() != null) {
            contextType.setKind(command.kind());
        }
        if (command.resources() != null) {
            contextType.getResources().clear();
            for (String resource : command.resources()) {
                contextType.addResource(toResource(resource));
            }
        }
        return contextTypeRepository.save(contextType);
    }

    @Transactional
    public void deleteContext(Long contextId) {
        ContextType contextType = loadContext(contextId);
        contextTypeRepository.delete(contextType);
    }

    private ContextType loadContext(Long contextId) {
        return contextTypeRepository.findById(contextId)
            .orElseThrow(() -> new ResourceNotFoundException("Context '%s' was not found.".formatted(contextId)));
    }

    private ContextResource toResource(String resourceName) {
        if (resourceName == null || resourceName.isBlank()) {
            throw new IllegalArgumentException("Resource name is required.");
        }
        ContextResource resource = new ContextResource();
        resource.setResourceName(resourceName.trim());
        return resource;
    }
}
