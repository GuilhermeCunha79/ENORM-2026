package pt.isep.enorm.ref.youtube.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.youtube.domain.generated.GeneratedSubscription;

@Entity(name = "Subscription")
@Table(name = "subscriptions")
public class Subscription extends GeneratedSubscription {
}

