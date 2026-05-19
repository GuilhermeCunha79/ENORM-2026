package pt.isep.enorm.ref.youtube.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.youtube.repository.TopvideocommentRepository;
import pt.isep.enorm.ref.youtube.service.generated.GeneratedTopvideocommentService;

@Service
public class TopvideocommentService extends GeneratedTopvideocommentService {
    public TopvideocommentService(TopvideocommentRepository repository) {
        super(repository);
    }
}
