package pt.isep.enorm.ref.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.repository.VideoRepository;
import pt.isep.enorm.ref.service.generated.GeneratedVideoService;

@Service
public class VideoService extends GeneratedVideoService {
    public VideoService(VideoRepository repository) {
        super(repository);
    }
}
