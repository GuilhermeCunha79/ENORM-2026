package pt.isep.enorm.ref.youtube.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import pt.isep.enorm.ref.youtube.repository.YoutubeUserRepository;

@Service
public class YoutubeUserDetailsService implements UserDetailsService {

    private final YoutubeUserRepository youtubeUserRepository;

    public YoutubeUserDetailsService(YoutubeUserRepository youtubeUserRepository) {
        this.youtubeUserRepository = youtubeUserRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return youtubeUserRepository.findByUsername(username)
            .orElseThrow(() -> new UsernameNotFoundException("User '%s' was not found.".formatted(username)));
    }
}

