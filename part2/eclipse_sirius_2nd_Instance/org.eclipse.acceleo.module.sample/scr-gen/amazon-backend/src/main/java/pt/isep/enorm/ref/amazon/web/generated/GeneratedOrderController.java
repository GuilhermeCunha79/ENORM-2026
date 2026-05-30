package pt.isep.enorm.ref.amazon.web.generated;

import pt.isep.enorm.ref.amazon.domain.Order;
import pt.isep.enorm.ref.amazon.service.generated.GeneratedOrderService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
public class GeneratedOrderController {
    private final GeneratedOrderService service;

    public GeneratedOrderController(GeneratedOrderService service) { this.service = service; }

    @GetMapping
    public List<Order> list() { return service.list(); }

    @GetMapping("/{orderId}")
    public Order get(@PathVariable String orderId) { return service.get(orderId); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Order create(@RequestBody Order payload) { return service.create(payload); }

    @PutMapping("/{orderId}")
    public Order update(@PathVariable String orderId, @RequestBody Order payload) { return service.update(orderId, payload); }

    @DeleteMapping("/{orderId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String orderId) { service.delete(orderId); }
}
