package pt.isep.enorm.ref.reddit.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.reddit.repository.CommentvoteRepository;
import pt.isep.enorm.ref.reddit.service.generated.GeneratedCommentvoteService;

@Service
public class CommentvoteService extends GeneratedCommentvoteService {
    public CommentvoteService(CommentvoteRepository repository) {
        super(repository);
    }
}
