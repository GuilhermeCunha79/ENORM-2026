package pt.isep.enorm.ref.amazon.web.dto;

import java.time.LocalDate;
import java.util.List;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;

public record UpdateOrderRequest(String orderCode, LocalDate orderDate, @NotEmpty @Valid List<OrderItemRequest> items) {
}
