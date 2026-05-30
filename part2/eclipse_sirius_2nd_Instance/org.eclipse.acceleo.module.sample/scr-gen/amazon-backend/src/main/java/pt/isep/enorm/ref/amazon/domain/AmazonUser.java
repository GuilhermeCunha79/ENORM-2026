package pt.isep.enorm.ref.amazon.domain;

import pt.isep.enorm.ref.amazon.domain.generated.GeneratedAmazonUser;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "amazonUser")
public class AmazonUser extends GeneratedAmazonUser {
}
