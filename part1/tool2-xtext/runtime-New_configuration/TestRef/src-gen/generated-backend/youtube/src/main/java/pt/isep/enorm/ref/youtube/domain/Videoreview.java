package pt.isep.enorm.ref.youtube.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.youtube.domain.generated.GeneratedVideoreview;

/** Manual extension point — add domain invariants or helpers here. */
@Entity
@Table(name = "videoreviews")
public class Videoreview extends GeneratedVideoreview {
}
