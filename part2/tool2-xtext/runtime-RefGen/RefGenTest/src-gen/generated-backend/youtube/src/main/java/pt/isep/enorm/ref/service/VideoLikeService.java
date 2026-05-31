package pt.isep.enorm.ref.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.repository.VideoLikeRepository;
import pt.isep.enorm.ref.service.generated.GeneratedVideoLikeService;

@Service
public class VideoLikeService extends GeneratedVideoLikeService {
    public VideoLikeService(VideoLikeRepository repository) {
        super(repository);
    }
}
