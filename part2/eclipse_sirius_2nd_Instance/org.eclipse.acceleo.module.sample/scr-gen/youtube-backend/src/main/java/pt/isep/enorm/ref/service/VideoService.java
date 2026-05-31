package pt.isep.enorm.ref.service;

import pt.isep.enorm.ref.service.generated.GeneratedVideoService;
import pt.isep.enorm.ref.repository.VideoRepository;
import org.springframework.stereotype.Service;

@Service
public class VideoService extends GeneratedVideoService {
    public VideoService(VideoRepository repository) {
        super(repository);
    }
}
