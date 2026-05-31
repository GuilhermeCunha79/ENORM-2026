package pt.isep.enorm.ref.amazon.web.generated;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import jakarta.validation.Valid;
import pt.isep.enorm.ref.amazon.domain.AmazonUser;
import pt.isep.enorm.ref.amazon.domain.Order;
import pt.isep.enorm.ref.amazon.service.OrderService;

public abstract class GeneratedOrderController {

    private final OrderService orderService;

    protected GeneratedOrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<Order> listOrders(@AuthenticationPrincipal AmazonUser currentUser) {
        return orderService.listOrders(currentUser.getUsername());
    }

    @GetMapping("/{orderId}")
    public Order getOrder(@AuthenticationPrincipal AmazonUser currentUser, @PathVariable Long orderId) {
        return orderService.getOrder(orderId, currentUser.getUsername());
    }

    @PostMapping
    public ResponseEntity<Order> createOrder(
        @AuthenticationPrincipal AmazonUser currentUser,
        @Valid @RequestBody Order request
    ) {
        Order order = orderService.createOrder(currentUser.getUsername(), request);
        return ResponseEntity.status(HttpStatus.CREATED).body(order);
    }

    @PutMapping("/{orderId}")
    public Order updateOrder(
        @AuthenticationPrincipal AmazonUser currentUser,
        @PathVariable Long orderId,
        @Valid @RequestBody Order request
    ) {
        return orderService.updateOrder(orderId, currentUser.getUsername(), request);
    }

    @DeleteMapping("/{orderId}")
    public ResponseEntity<Void> deleteOrder(@AuthenticationPrincipal AmazonUser currentUser, @PathVariable Long orderId) {
        orderService.deleteOrder(orderId, currentUser.getUsername());
        return ResponseEntity.noContent().build();
    }

}
