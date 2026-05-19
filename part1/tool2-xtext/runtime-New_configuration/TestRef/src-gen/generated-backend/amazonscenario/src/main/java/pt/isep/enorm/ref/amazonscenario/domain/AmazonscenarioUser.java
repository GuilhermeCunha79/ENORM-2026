package pt.isep.enorm.ref.amazonscenario.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.amazonscenario.domain.generated.GeneratedAmazonscenarioUser;

/** Manual extension point — edit scenario-specific user logic here. */
@Entity
@Table(name = "users")
public class AmazonscenarioUser extends GeneratedAmazonscenarioUser {
}
