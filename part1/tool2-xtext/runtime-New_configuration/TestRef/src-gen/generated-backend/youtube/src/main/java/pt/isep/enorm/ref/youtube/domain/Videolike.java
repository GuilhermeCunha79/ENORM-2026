package pt.isep.enorm.ref.youtube.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.youtube.domain.generated.GeneratedVideolike;

/** Manual extension point — add domain invariants or helpers here. */
@Entity
@Table(name = "videolikes")
public class Videolike extends GeneratedVideolike {
}
