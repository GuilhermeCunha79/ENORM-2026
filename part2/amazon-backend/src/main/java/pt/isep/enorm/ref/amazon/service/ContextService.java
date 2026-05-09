package pt.isep.enorm.ref.amazon.service;

import org.springframework.stereotype.Service;

import pt.isep.enorm.ref.amazon.repository.ContextTypeRepository;
import pt.isep.enorm.ref.amazon.service.generated.GeneratedContextService;

@Service
public class ContextService extends GeneratedContextService {

    public ContextService(ContextTypeRepository contextTypeRepository) {
        super(contextTypeRepository);
    }
}
