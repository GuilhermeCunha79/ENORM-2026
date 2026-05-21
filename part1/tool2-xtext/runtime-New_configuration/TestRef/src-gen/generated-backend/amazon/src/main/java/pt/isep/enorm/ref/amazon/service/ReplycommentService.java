package pt.isep.enorm.ref.amazon.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.amazon.repository.ReplycommentRepository;
import pt.isep.enorm.ref.amazon.service.generated.GeneratedReplycommentService;

@Service
public class ReplycommentService extends GeneratedReplycommentService {
    public ReplycommentService(ReplycommentRepository repository) {
        super(repository);
    }
}
