package pt.isep.enorm.ref.amazon.repository.generated;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import pt.isep.enorm.ref.amazon.domain.AmazonUser;

@NoRepositoryBean
public interface GeneratedAmazonUserRepository extends JpaRepository<AmazonUser, Long> {

	Optional<AmazonUser> findByUsername(String username);

	boolean existsByUsername(String username);
}