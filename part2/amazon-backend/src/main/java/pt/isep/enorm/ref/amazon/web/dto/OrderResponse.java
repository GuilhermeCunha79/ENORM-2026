package pt.isep.enorm.ref.amazon.web.dto;

import java.time.LocalDate;
import java.util.List;

public record OrderResponse(
    Long id,
    String orderCode,
    LocalDate orderDate,
    String buyerUsername,
    List<OrderItemResponse> items
) {

    public OrderResponse {
        items = items == null ? List.of() : List.copyOf(items);
    }
}
