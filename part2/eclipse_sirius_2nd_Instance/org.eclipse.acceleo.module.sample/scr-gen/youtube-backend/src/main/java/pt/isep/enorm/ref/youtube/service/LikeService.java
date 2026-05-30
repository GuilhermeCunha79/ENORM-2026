package pt.isep.enorm.ref.youtube.service;

import pt.isep.enorm.ref.youtube.service.generated.GeneratedLikeService;
import pt.isep.enorm.ref.youtube.repository.LikeRepository;
import org.springframework.stereotype.Service;

@Service
public class LikeService extends GeneratedLikeService {
    public LikeService(LikeRepository repository) {
        super(repository);
    }
}
