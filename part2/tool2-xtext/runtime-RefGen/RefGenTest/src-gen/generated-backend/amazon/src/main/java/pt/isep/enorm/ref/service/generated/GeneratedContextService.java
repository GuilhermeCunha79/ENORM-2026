package pt.isep.enorm.ref.service.generated;

import java.util.List;
import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.domain.ContextType;
import pt.isep.enorm.ref.repository.ContextTypeRepository;
import pt.isep.enorm.ref.web.error.ResourceNotFoundException;

@Service
public class GeneratedContextService {
    private final ContextTypeRepository contextTypeRepository;

    public GeneratedContextService(ContextTypeRepository contextTypeRepository) {
        this.contextTypeRepository = contextTypeRepository;
    }

    public List<ContextType> findAll() {
        return contextTypeRepository.findAll();
    }

    public ContextType findById(Long id) {
        return contextTypeRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("ContextType not found: " + id));
    }

    public ContextType create(ContextType context) {
        return contextTypeRepository.save(context);
    }
}
