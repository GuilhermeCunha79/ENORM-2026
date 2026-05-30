package pt.isep.enorm.ref.youtube.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.youtube.repository.ReplyVideoCommentRepository;
import pt.isep.enorm.ref.youtube.service.generated.GeneratedReplyVideoCommentService;

@Service
public class ReplyVideoCommentService extends GeneratedReplyVideoCommentService {
    public ReplyVideoCommentService(ReplyVideoCommentRepository repository) {
        super(repository);
    }
}
