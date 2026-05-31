package pt.isep.enorm.ref.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.repository.ContextTypeRepository;
import pt.isep.enorm.ref.service.generated.GeneratedContextService;

@Service
public class ContextService extends GeneratedContextService {
    public ContextService(ContextTypeRepository contextTypeRepository) {
        super(contextTypeRepository);
    }
}
