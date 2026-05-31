package pt.isep.enorm.ref.amazon.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.amazon.domain.generated.GeneratedAuthorizationRule;

@Entity(name = "AuthorizationRule")
@Table(name = "authorization_rules")
public class AuthorizationRule extends GeneratedAuthorizationRule {
}
