package pt.isep.enorm.ref.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.domain.generated.GeneratedUserType;

/** Manual extension point — edit scenario-specific user logic here. */
@Entity
@Table(name = "users")
public class UserType extends GeneratedUserType {
}
