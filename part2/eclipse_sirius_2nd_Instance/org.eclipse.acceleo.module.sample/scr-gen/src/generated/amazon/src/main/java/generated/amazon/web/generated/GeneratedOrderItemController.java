package generated.amazon.web.generated;

import generated.amazon.domain.OrderItem;
import generated.amazon.service.generated.GeneratedOrderItemService;
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
@RequestMapping("/api/orderItems")
public class GeneratedOrderItemController {
    protected final GeneratedOrderItemService service;

    public GeneratedOrderItemController(GeneratedOrderItemService service) {
        this.service = service;
    }

    @GetMapping
    public List<OrderItem> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public OrderItem get(@PathVariable String id) {
        return service.get(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public OrderItem create(@RequestBody OrderItem entity) {
        return service.create(entity);
    }

    @PutMapping("/{id}")
    public OrderItem update(@PathVariable String id, @RequestBody OrderItem entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
