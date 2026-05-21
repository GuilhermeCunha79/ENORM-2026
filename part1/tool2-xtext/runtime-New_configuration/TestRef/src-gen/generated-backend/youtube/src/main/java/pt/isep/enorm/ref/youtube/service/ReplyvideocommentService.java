package pt.isep.enorm.ref.youtube.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.youtube.repository.ReplyvideocommentRepository;
import pt.isep.enorm.ref.youtube.service.generated.GeneratedReplyvideocommentService;

@Service
public class ReplyvideocommentService extends GeneratedReplyvideocommentService {
    public ReplyvideocommentService(ReplyvideocommentRepository repository) {
        super(repository);
    }
}
