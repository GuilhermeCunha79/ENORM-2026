package pt.isep.enorm.ref.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.domain.generated.GeneratedVerificationPolicy;

/** Manual extension point — add bespoke behaviour here. */
@Entity
@Table(name = "verification_policies")
public class VerificationPolicy extends GeneratedVerificationPolicy {
}
