package pt.isep.enorm.ref.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.isep.enorm.ref.service.OrderService;
import pt.isep.enorm.ref.web.generated.GeneratedOrderController;

@RestController
@RequestMapping("/api/orders")
public class OrderController extends GeneratedOrderController {
    public OrderController(OrderService service) {
        super(service);
    }
}
