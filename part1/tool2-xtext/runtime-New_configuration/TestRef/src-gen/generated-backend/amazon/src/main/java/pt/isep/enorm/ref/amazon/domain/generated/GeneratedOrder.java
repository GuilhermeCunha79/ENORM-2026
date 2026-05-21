package pt.isep.enorm.ref.amazon.domain.generated;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotNull;

@MappedSuperclass
public abstract class GeneratedOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

@NotNull
@Column(nullable = false, length = 2000)
private String orderId;

@NotNull
@Column(nullable = false)
private java.math.BigDecimal total;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
public String getOrderid() { return orderId; }
public void setOrderid(String orderId) { this.orderId = orderId; }
public java.math.BigDecimal getTotal() { return total; }
public void setTotal(java.math.BigDecimal total) { this.total = total; }
}
