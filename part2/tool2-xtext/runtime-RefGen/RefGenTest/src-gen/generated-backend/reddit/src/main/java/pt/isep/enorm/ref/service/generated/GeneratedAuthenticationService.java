package pt.isep.enorm.ref.service.generated;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pt.isep.enorm.ref.domain.UserType;
import pt.isep.enorm.ref.domain.enums.Role;
import pt.isep.enorm.ref.dto.AuthenticationResult;
import pt.isep.enorm.ref.repository.UserTypeRepository;
import pt.isep.enorm.ref.security.JwtService;

@Service
public class GeneratedAuthenticationService {
    private final UserTypeRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;

    public GeneratedAuthenticationService(UserTypeRepository userRepository,
                                          PasswordEncoder passwordEncoder, JwtService jwtService) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtService = jwtService;
    }

    public UserType register(String username, String password, Role role) {
        UserType user = new UserType();
        user.setUsername(username);
        user.setPassword(passwordEncoder.encode(password));
        user.setRole(role);
        return userRepository.save(user);
    }

    public AuthenticationResult login(String username, String password) {
        UserType user = userRepository.findByUsername(username)
            .orElseThrow(() -> new IllegalArgumentException("Invalid credentials"));
        if (!passwordEncoder.matches(password, user.getPassword())) {
            throw new IllegalArgumentException("Invalid credentials");
        }
        String token = jwtService.generateToken(user.getUsername(), user.getRole().name());
        return new AuthenticationResult(token, user.getUsername(), user.getRole().name());
    }
}
