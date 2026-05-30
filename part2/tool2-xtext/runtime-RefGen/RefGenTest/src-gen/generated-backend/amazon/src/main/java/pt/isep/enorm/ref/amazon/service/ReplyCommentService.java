package pt.isep.enorm.ref.amazon.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.amazon.repository.ReplyCommentRepository;
import pt.isep.enorm.ref.amazon.service.generated.GeneratedReplyCommentService;

@Service
public class ReplyCommentService extends GeneratedReplyCommentService {
    public ReplyCommentService(ReplyCommentRepository repository) {
        super(repository);
    }
}
