package pt.isep.enorm.ref.amazon.service.command;

import java.util.Objects;

public record OrderItemCommand(Long productId, Integer quantity) {

    public OrderItemCommand {
        productId = Objects.requireNonNull(productId, "productId is required");
        quantity = Objects.requireNonNull(quantity, "quantity is required");
    }
}
