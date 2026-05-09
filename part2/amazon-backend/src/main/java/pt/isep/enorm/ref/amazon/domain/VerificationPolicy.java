package pt.isep.enorm.ref.amazon.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.amazon.domain.generated.GeneratedVerificationPolicy;

@Entity(name = "VerificationPolicy")
@Table(name = "verification_policies")
public class VerificationPolicy extends GeneratedVerificationPolicy {
}
