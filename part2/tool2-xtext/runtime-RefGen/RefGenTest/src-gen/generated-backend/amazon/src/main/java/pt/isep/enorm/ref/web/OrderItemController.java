package pt.isep.enorm.ref.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.isep.enorm.ref.service.OrderItemService;
import pt.isep.enorm.ref.web.generated.GeneratedOrderItemController;

@RestController
@RequestMapping("/api/order-items")
public class OrderItemController extends GeneratedOrderItemController {
    public OrderItemController(OrderItemService service) {
        super(service);
    }
}
