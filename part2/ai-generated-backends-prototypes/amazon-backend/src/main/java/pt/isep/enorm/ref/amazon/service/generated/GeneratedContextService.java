package pt.isep.enorm.ref.amazon.service.generated;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import pt.isep.enorm.ref.amazon.domain.ContextResource;
import pt.isep.enorm.ref.amazon.domain.ContextType;
import pt.isep.enorm.ref.amazon.repository.ContextTypeRepository;
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
    public ContextType createContext(ContextType request) {
        ContextType contextType = new ContextType();
        contextType.setName(request.getName());
        contextType.setKind(request.getKind());
        applyResources(request.getResources(), contextType);
        return contextTypeRepository.save(contextType);
    }

    @Transactional
    public ContextType updateContext(Long contextId, ContextType request) {
        ContextType contextType = loadContext(contextId);
        if (request.getName() != null && !request.getName().isBlank()) {
            contextType.setName(request.getName());
        }
        if (request.getKind() != null) {
            contextType.setKind(request.getKind());
        }
        if (request.getResources() != null) {
            contextType.getResources().clear();
            applyResources(request.getResources(), contextType);
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

    private void applyResources(List<ContextResource> resources, ContextType contextType) {
        if (resources == null) {
            return;
        }

        for (ContextResource resourceRequest : resources) {
            String resourceName = resourceRequest.getResourceName();
            if (resourceName == null || resourceName.isBlank()) {
                throw new IllegalArgumentException("Resource name is required.");
            }

            ContextResource resource = new ContextResource();
            resource.setResourceName(resourceName.trim());
            contextType.addResource(resource);
        }
    }
}
