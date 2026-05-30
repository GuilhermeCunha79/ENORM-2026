package pt.isep.enorm.ref.reddit.domain;

import pt.isep.enorm.ref.reddit.domain.generated.GeneratedSubscription;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "subscription")
public class Subscription extends GeneratedSubscription {
}
