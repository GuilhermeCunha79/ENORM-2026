package pt.isep.enorm.ref.youtube.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.youtube.repository.VideoLikeRepository;
import pt.isep.enorm.ref.youtube.service.generated.GeneratedVideoLikeService;

@Service
public class VideoLikeService extends GeneratedVideoLikeService {
    public VideoLikeService(VideoLikeRepository repository) {
        super(repository);
    }
}
