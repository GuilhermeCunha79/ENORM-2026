package pt.isep.enorm.ref.youtube.service;

import pt.isep.enorm.ref.youtube.service.generated.GeneratedVideoService;
import pt.isep.enorm.ref.youtube.repository.VideoRepository;
import org.springframework.stereotype.Service;

@Service
public class VideoService extends GeneratedVideoService {
    public VideoService(VideoRepository repository) {
        super(repository);
    }
}
