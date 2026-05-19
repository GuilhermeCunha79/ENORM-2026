package pt.isep.enorm.ref.youtube.service;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.youtube.repository.YoutubeUserRepository;
import pt.isep.enorm.ref.youtube.service.generated.GeneratedAuthenticationService;

@Service
public class AuthenticationService extends GeneratedAuthenticationService {
    public AuthenticationService(YoutubeUserRepository userRepository) {
        super(userRepository);
    }
}
