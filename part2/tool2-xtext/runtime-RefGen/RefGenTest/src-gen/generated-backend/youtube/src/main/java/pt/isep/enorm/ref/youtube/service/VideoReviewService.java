package pt.isep.enorm.ref.youtube.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.youtube.repository.VideoReviewRepository;
import pt.isep.enorm.ref.youtube.service.generated.GeneratedVideoReviewService;

@Service
public class VideoReviewService extends GeneratedVideoReviewService {
    public VideoReviewService(VideoReviewRepository repository) {
        super(repository);
    }
}
