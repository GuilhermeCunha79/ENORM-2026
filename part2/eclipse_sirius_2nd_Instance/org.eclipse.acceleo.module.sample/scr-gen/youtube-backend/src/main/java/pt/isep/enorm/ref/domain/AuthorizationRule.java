package pt.isep.enorm.ref.domain;

import pt.isep.enorm.ref.domain.generated.GeneratedAuthorizationRule;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "authorizationRule")
public class AuthorizationRule extends GeneratedAuthorizationRule {
}
