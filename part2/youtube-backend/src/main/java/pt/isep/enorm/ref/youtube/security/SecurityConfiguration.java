package pt.isep.enorm.ref.youtube.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import pt.isep.enorm.ref.youtube.domain.enums.Role;

@Configuration
@EnableMethodSecurity
public class SecurityConfiguration {

    @Bean
    SecurityFilterChain securityFilterChain(
        HttpSecurity http,
        JwtAuthenticationFilter jwtAuthenticationFilter,
        AuthenticationProvider authenticationProvider
    ) throws Exception {
        http
            .csrf(csrf -> csrf.disable())
            .headers(headers -> headers.frameOptions(frameOptions -> frameOptions.sameOrigin()))
            .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
            .authenticationProvider(authenticationProvider)
            .addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class)
            .authorizeHttpRequests(authorize -> authorize
                .requestMatchers("/api/auth/**", "/h2-console/**").permitAll()
                .requestMatchers(HttpMethod.GET, "/api/channels/**", "/api/videos/**", "/api/comments/**").permitAll()
                .requestMatchers(HttpMethod.POST, "/api/channels").hasRole(Role.CREATOR.name())
                .requestMatchers(HttpMethod.POST, "/api/channels/*/videos").hasRole(Role.CREATOR.name())
                .requestMatchers(HttpMethod.POST, "/api/videos/*/comments").hasAnyRole(Role.GENERIC.name(), Role.CREATOR.name(), Role.MODERATOR.name())
                .requestMatchers(HttpMethod.POST, "/api/likes/**").hasAnyRole(Role.GENERIC.name(), Role.CREATOR.name(), Role.MODERATOR.name())
                .requestMatchers(HttpMethod.POST, "/api/subscriptions/**").hasAnyRole(Role.GENERIC.name(), Role.CREATOR.name(), Role.MODERATOR.name())
                .requestMatchers(HttpMethod.POST, "/api/reports/**").hasAnyRole(Role.GENERIC.name(), Role.CREATOR.name(), Role.MODERATOR.name())
                .requestMatchers("/api/moderation/**").hasRole(Role.MODERATOR.name())
                .requestMatchers("/api/policies/**").hasAnyRole(Role.CREATOR.name(), Role.MODERATOR.name())
                .anyRequest().authenticated()
            );

        return http.build();
    }

    @Bean
    AuthenticationProvider authenticationProvider(UserDetailsService userDetailsService, PasswordEncoder passwordEncoder) {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setUserDetailsService(userDetailsService);
        provider.setPasswordEncoder(passwordEncoder);
        return provider;
    }

    @Bean
    AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}

