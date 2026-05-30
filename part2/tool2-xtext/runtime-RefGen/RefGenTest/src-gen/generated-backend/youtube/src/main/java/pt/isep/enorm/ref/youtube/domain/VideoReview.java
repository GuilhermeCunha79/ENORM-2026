package pt.isep.enorm.ref.youtube.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.youtube.domain.generated.GeneratedVideoReview;

/** Manual extension point — add domain invariants or helpers here. */
@Entity
@Table(name = "videoreviews")
public class VideoReview extends GeneratedVideoReview {
}
