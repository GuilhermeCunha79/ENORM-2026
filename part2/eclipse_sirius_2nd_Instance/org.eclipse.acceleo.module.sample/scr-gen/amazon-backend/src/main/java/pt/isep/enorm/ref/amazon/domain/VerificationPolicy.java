package pt.isep.enorm.ref.amazon.domain;

import pt.isep.enorm.ref.amazon.domain.generated.GeneratedVerificationPolicy;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "verificationPolicy")
public class VerificationPolicy extends GeneratedVerificationPolicy {
}
