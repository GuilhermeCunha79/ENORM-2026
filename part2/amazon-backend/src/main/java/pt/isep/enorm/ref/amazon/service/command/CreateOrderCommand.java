package pt.isep.enorm.ref.amazon.service.command;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public record CreateOrderCommand(String orderCode, LocalDate orderDate, List<OrderItemCommand> items) {

    public CreateOrderCommand {
        items = Objects.requireNonNull(items, "items are required");
    }
}
