package pt.isep.enorm.ref.amazon.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.amazon.domain.generated.GeneratedAmazonUser;

/** Manual extension point — edit scenario-specific user logic here. */
@Entity
@Table(name = "users")
public class AmazonUser extends GeneratedAmazonUser {
}
