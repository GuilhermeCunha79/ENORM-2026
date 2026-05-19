package pt.isep.enorm.ref.amazonscenario.domain.generated;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotNull;

@MappedSuperclass
public abstract class GeneratedProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

@NotNull
@Column(nullable = false, length = 2000)
private String title;

@NotNull
@Column(nullable = false)
private java.math.BigDecimal price;

@Column(nullable = true, length = 2000)
private String sku;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
public String getTitle() { return title; }
public void setTitle(String title) { this.title = title; }
public java.math.BigDecimal getPrice() { return price; }
public void setPrice(java.math.BigDecimal price) { this.price = price; }
public String getSku() { return sku; }
public void setSku(String sku) { this.sku = sku; }
}
