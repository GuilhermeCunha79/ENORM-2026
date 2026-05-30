package pt.isep.enorm.ref.amazon.domain;

import pt.isep.enorm.ref.amazon.domain.generated.GeneratedAuthorizationRule;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "authorizationRule")
public class AuthorizationRule extends GeneratedAuthorizationRule {
}
