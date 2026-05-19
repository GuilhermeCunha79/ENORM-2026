package pt.isep.enorm.ref.amazon.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.amazon.repository.TopthreadcommentRepository;
import pt.isep.enorm.ref.amazon.service.generated.GeneratedTopthreadcommentService;

@Service
public class TopthreadcommentService extends GeneratedTopthreadcommentService {
    public TopthreadcommentService(TopthreadcommentRepository repository) {
        super(repository);
    }
}
