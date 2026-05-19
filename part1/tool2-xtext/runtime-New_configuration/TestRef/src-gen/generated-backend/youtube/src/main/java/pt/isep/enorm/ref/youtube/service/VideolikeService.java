package pt.isep.enorm.ref.youtube.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.youtube.repository.VideolikeRepository;
import pt.isep.enorm.ref.youtube.service.generated.GeneratedVideolikeService;

@Service
public class VideolikeService extends GeneratedVideolikeService {
    public VideolikeService(VideolikeRepository repository) {
        super(repository);
    }
}
