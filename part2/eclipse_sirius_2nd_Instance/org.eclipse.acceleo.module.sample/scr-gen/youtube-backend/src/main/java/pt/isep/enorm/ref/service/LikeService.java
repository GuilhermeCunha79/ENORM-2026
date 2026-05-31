package pt.isep.enorm.ref.service;

import pt.isep.enorm.ref.service.generated.GeneratedLikeService;
import pt.isep.enorm.ref.repository.LikeRepository;
import org.springframework.stereotype.Service;

@Service
public class LikeService extends GeneratedLikeService {
    public LikeService(LikeRepository repository) {
        super(repository);
    }
}
