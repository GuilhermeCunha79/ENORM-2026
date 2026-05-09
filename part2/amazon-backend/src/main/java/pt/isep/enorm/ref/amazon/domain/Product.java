package pt.isep.enorm.ref.amazon.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.amazon.domain.generated.GeneratedProduct;

@Entity(name = "Product")
@Table(name = "products")
public class Product extends GeneratedProduct {
}