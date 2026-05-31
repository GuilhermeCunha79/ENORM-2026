package pt.isep.enorm.ref.domain;

import pt.isep.enorm.ref.domain.generated.GeneratedProduct;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class Product extends GeneratedProduct {
}
