package pt.isep.enorm.ref.youtube.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.youtube.repository.VideoreviewRepository;
import pt.isep.enorm.ref.youtube.service.generated.GeneratedVideoreviewService;

@Service
public class VideoreviewService extends GeneratedVideoreviewService {
    public VideoreviewService(VideoreviewRepository repository) {
        super(repository);
    }
}
