package pt.isep.enorm.ref.reddit.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import pt.isep.enorm.ref.reddit.repository.RedditUserRepository;

@Service
public class RedditUserDetailsService implements UserDetailsService {

    private final RedditUserRepository redditUserRepository;

    public RedditUserDetailsService(RedditUserRepository redditUserRepository) {
        this.redditUserRepository = redditUserRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return redditUserRepository.findByUsername(username)
            .orElseThrow(() -> new UsernameNotFoundException("User '%s' was not found.".formatted(username)));
    }
}


