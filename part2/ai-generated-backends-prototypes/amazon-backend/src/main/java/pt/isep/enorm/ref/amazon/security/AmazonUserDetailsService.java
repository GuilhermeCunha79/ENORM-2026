package pt.isep.enorm.ref.amazon.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import pt.isep.enorm.ref.amazon.repository.AmazonUserRepository;

@Service
public class AmazonUserDetailsService implements UserDetailsService {

    private final AmazonUserRepository amazonUserRepository;

    public AmazonUserDetailsService(AmazonUserRepository amazonUserRepository) {
        this.amazonUserRepository = amazonUserRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return amazonUserRepository.findByUsername(username)
            .orElseThrow(() -> new UsernameNotFoundException("User '%s' was not found.".formatted(username)));
    }
}