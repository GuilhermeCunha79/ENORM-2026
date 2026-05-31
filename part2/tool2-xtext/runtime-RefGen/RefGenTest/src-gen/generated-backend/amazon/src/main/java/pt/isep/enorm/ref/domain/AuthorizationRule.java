package pt.isep.enorm.ref.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.domain.generated.GeneratedAuthorizationRule;

/** Manual extension point — add bespoke behaviour here. */
@Entity
@Table(name = "authorization_rules")
public class AuthorizationRule extends GeneratedAuthorizationRule {
}
