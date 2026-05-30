package pt.isep.enorm.ref.amazon.domain;

import pt.isep.enorm.ref.amazon.domain.generated.GeneratedProductReview;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "productReview")
public class ProductReview extends GeneratedProductReview {
}
