package pt.isep.enorm.ref.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.repository.ReplyVideoCommentRepository;
import pt.isep.enorm.ref.service.generated.GeneratedReplyVideoCommentService;

@Service
public class ReplyVideoCommentService extends GeneratedReplyVideoCommentService {
    public ReplyVideoCommentService(ReplyVideoCommentRepository repository) {
        super(repository);
    }
}
