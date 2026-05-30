package pt.isep.enorm.ref.amazon.domain;

import pt.isep.enorm.ref.amazon.domain.generated.GeneratedUserType;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "userType")
public class UserType extends GeneratedUserType {
}
