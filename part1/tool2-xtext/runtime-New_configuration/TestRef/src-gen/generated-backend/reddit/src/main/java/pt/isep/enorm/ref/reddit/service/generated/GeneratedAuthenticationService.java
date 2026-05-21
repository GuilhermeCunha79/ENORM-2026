package pt.isep.enorm.ref.reddit.service.generated;

import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.reddit.domain.RedditUser;
import pt.isep.enorm.ref.reddit.domain.enums.Role;
import pt.isep.enorm.ref.reddit.repository.RedditUserRepository;

@Service
public class GeneratedAuthenticationService {
    private final RedditUserRepository userRepository;

    public GeneratedAuthenticationService(RedditUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public RedditUser register(String username, String password, Role role) {
        RedditUser user = new RedditUser();
        user.setUsername(username);
        user.setPassword(password);
        user.setRole(role);
        return userRepository.save(user);
    }
}
