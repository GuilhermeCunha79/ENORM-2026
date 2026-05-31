package pt.isep.enorm.ref.domain.generated;

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

@jakarta.persistence.ManyToOne()
@jakarta.persistence.JoinColumn(name = "product_id")
private pt.isep.enorm.ref.domain.Product product;

@jakarta.persistence.OneToMany(cascade = jakarta.persistence.CascadeType.ALL, orphanRemoval = true)
@jakarta.persistence.JoinColumn(name = "order_id")
private java.util.List<pt.isep.enorm.ref.domain.OrderItem> orderItems = new java.util.ArrayList<>();

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
public String getOrderId() { return orderId; }
public void setOrderId(String orderId) { this.orderId = orderId; }
public java.math.BigDecimal getTotal() { return total; }
public void setTotal(java.math.BigDecimal total) { this.total = total; }
public pt.isep.enorm.ref.domain.Product getProduct() { return product; }
public void setProduct(pt.isep.enorm.ref.domain.Product product) { this.product = product; }
public java.util.List<pt.isep.enorm.ref.domain.OrderItem> getOrderItems() { return orderItems; }
public void setOrderItems(java.util.List<pt.isep.enorm.ref.domain.OrderItem> orderItems) { this.orderItems = orderItems; }
}
