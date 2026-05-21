package pt.isep.enorm.ref.youtube.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.youtube.domain.generated.GeneratedChannel;

/** Manual extension point — add domain invariants or helpers here. */
@Entity
@Table(name = "channels")
public class Channel extends GeneratedChannel {
}
