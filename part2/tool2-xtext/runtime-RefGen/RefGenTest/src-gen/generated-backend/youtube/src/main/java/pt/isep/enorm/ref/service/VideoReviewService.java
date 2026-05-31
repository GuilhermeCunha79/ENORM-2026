package pt.isep.enorm.ref.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.repository.VideoReviewRepository;
import pt.isep.enorm.ref.service.generated.GeneratedVideoReviewService;

@Service
public class VideoReviewService extends GeneratedVideoReviewService {
    public VideoReviewService(VideoReviewRepository repository) {
        super(repository);
    }
}
