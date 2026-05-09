package pt.isep.enorm.ref.amazon.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.amazon.domain.generated.GeneratedProductReview;

@Entity(name = "ProductReview")
@Table(name = "product_reviews")
public class ProductReview extends GeneratedProductReview {
}