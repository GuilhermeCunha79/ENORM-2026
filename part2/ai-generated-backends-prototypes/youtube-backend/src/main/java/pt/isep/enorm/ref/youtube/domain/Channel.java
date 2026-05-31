package pt.isep.enorm.ref.youtube.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.youtube.domain.generated.GeneratedChannel;

@Entity(name = "Channel")
@Table(name = "channels")
public class Channel extends GeneratedChannel {
}

