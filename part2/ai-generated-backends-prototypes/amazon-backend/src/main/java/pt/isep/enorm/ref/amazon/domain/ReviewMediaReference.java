package pt.isep.enorm.ref.amazon.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.amazon.domain.generated.GeneratedReviewMediaReference;

@Entity(name = "ReviewMediaReference")
@Table(name = "review_media_references")
public class ReviewMediaReference extends GeneratedReviewMediaReference {
}