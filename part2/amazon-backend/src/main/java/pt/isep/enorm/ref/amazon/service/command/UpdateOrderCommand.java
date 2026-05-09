package pt.isep.enorm.ref.amazon.service.command;

import java.time.LocalDate;
import java.util.List;

public record UpdateOrderCommand(String orderCode, LocalDate orderDate, List<OrderItemCommand> items) {
}
