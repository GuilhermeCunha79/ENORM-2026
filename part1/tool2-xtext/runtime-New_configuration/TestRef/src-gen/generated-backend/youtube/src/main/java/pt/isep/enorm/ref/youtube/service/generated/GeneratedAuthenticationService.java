package pt.isep.enorm.ref.youtube.service.generated;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.youtube.domain.YoutubeUser;
import pt.isep.enorm.ref.youtube.domain.enums.Role;
import pt.isep.enorm.ref.youtube.repository.YoutubeUserRepository;

@Service
public class GeneratedAuthenticationService {
    private final YoutubeUserRepository userRepository;

    public GeneratedAuthenticationService(YoutubeUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public YoutubeUser register(String username, String password, Role role) {
        YoutubeUser user = new YoutubeUser();
        user.setUsername(username);
        user.setPassword(password);
        user.setRole(role);
        return userRepository.save(user);
    }
}
