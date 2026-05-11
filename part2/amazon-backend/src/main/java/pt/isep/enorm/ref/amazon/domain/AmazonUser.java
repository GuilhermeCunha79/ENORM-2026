package pt.isep.enorm.ref.amazon.domain;

import java.util.Collection;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.amazon.domain.enums.Role;
import pt.isep.enorm.ref.amazon.domain.generated.GeneratedAmazonUser;

@Entity(name = "AmazonUser")
@Table(name = "users")
public class AmazonUser extends GeneratedAmazonUser implements UserDetails {

	@JsonIgnore
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Role role = getRole();
		if (role == Role.BUYER) {
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