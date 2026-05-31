package pt.isep.enorm.ref.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.domain.generated.GeneratedProductReviewMediaReference;

/** Manual extension point — add bespoke behaviour here. */
@Entity
@Table(name = "productreview_media")
public class ProductReviewMediaReference extends GeneratedProductReviewMediaReference {
}
