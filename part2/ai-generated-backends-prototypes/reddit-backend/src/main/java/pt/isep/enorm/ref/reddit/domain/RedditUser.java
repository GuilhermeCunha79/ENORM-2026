package pt.isep.enorm.ref.reddit.domain;

import java.util.Collection;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.reddit.domain.enums.Role;
import pt.isep.enorm.ref.reddit.domain.generated.GeneratedRedditUser;

@Entity(name = "RedditUser")
@Table(name = "users")
public class RedditUser extends GeneratedRedditUser implements UserDetails {

    @JsonIgnore
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Role role = getRole();
        if (role == Role.CREATOR) {
            return List.of(
                new SimpleGrantedAuthority("ROLE_" + role.name()),
                new SimpleGrantedAuthority("ROLE_" + Role.GENERIC.name())
            );
        }
        return List.of(new SimpleGrantedAuthority("ROLE_" + role.name()));
    }

    @JsonIgnore
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isEnabled() {
        return true;
    }
}


