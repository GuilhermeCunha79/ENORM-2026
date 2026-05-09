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
import pt.isep.enorm.ref.amazon.domain.OrderItem;
import pt.isep.enorm.ref.amazon.service.OrderService;
import pt.isep.enorm.ref.amazon.service.command.CreateOrderCommand;
import pt.isep.enorm.ref.amazon.service.command.OrderItemCommand;
import pt.isep.enorm.ref.amazon.service.command.UpdateOrderCommand;
import pt.isep.enorm.ref.amazon.web.dto.CreateOrderRequest;
import pt.isep.enorm.ref.amazon.web.dto.OrderItemRequest;
import pt.isep.enorm.ref.amazon.web.dto.OrderItemResponse;
import pt.isep.enorm.ref.amazon.web.dto.OrderResponse;
import pt.isep.enorm.ref.amazon.web.dto.UpdateOrderRequest;

public abstract class GeneratedOrderController {

    private final OrderService orderService;

    protected GeneratedOrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<OrderResponse> listOrders(@AuthenticationPrincipal AmazonUser currentUser) {
        return orderService.listOrders(currentUser.getUsername()).stream()
            .map(this::toOrderResponse)
            .toList();
    }

    @GetMapping("/{orderId}")
    public OrderResponse getOrder(@AuthenticationPrincipal AmazonUser currentUser, @PathVariable Long orderId) {
        return toOrderResponse(orderService.getOrder(orderId, currentUser.getUsername()));
    }

    @PostMapping
    public ResponseEntity<OrderResponse> createOrder(
        @AuthenticationPrincipal AmazonUser currentUser,
        @Valid @RequestBody CreateOrderRequest request
    ) {
        Order order = orderService.createOrder(currentUser.getUsername(), toCreateCommand(request));
        return ResponseEntity.status(HttpStatus.CREATED).body(toOrderResponse(order));
    }

    @PutMapping("/{orderId}")
    public OrderResponse updateOrder(
        @AuthenticationPrincipal AmazonUser currentUser,
        @PathVariable Long orderId,
        @Valid @RequestBody UpdateOrderRequest request
    ) {
        Order order = orderService.updateOrder(orderId, currentUser.getUsername(), toUpdateCommand(request));
        return toOrderResponse(order);
    }

    @DeleteMapping("/{orderId}")
    public ResponseEntity<Void> deleteOrder(@AuthenticationPrincipal AmazonUser currentUser, @PathVariable Long orderId) {
        orderService.deleteOrder(orderId, currentUser.getUsername());
        return ResponseEntity.noContent().build();
    }

    protected CreateOrderCommand toCreateCommand(CreateOrderRequest request) {
        return new CreateOrderCommand(request.orderCode(), request.orderDate(), toOrderItemCommands(request.items()));
    }

    protected UpdateOrderCommand toUpdateCommand(UpdateOrderRequest request) {
        return new UpdateOrderCommand(request.orderCode(), request.orderDate(), toOrderItemCommands(request.items()));
    }

    protected List<OrderItemCommand> toOrderItemCommands(List<OrderItemRequest> items) {
        return items.stream()
            .map(item -> new OrderItemCommand(item.productId(), item.quantity()))
            .toList();
    }

    protected OrderResponse toOrderResponse(Order order) {
        List<OrderItemResponse> items = order.getItems().stream()
            .map(this::toOrderItemResponse)
            .toList();

        return new OrderResponse(order.getId(), order.getOrderCode(), order.getOrderDate(), order.getBuyer().getUsername(), items);
    }

    protected OrderItemResponse toOrderItemResponse(OrderItem item) {
        return new OrderItemResponse(item.getId(), item.getProduct().getId(), item.getQuantity());
    }
}
