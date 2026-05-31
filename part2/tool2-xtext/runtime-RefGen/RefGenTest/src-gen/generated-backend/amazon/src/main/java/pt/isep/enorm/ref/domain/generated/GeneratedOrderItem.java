package pt.isep.enorm.ref.domain.generated;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotNull;

@MappedSuperclass
public abstract class GeneratedOrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

@NotNull
@Column(nullable = false)
private java.math.BigDecimal quantity;

@jakarta.persistence.ManyToOne()
@jakarta.persistence.JoinColumn(name = "product_id")
private pt.isep.enorm.ref.domain.Product product;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
public java.math.BigDecimal getQuantity() { return quantity; }
public void setQuantity(java.math.BigDecimal quantity) { this.quantity = quantity; }
public pt.isep.enorm.ref.domain.Product getProduct() { return product; }
public void setProduct(pt.isep.enorm.ref.domain.Product product) { this.product = product; }
}
