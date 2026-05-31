package pt.isep.enorm.ref.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.repository.ReplyCommentRepository;
import pt.isep.enorm.ref.service.generated.GeneratedReplyCommentService;

@Service
public class ReplyCommentService extends GeneratedReplyCommentService {
    public ReplyCommentService(ReplyCommentRepository repository) {
        super(repository);
    }
}
