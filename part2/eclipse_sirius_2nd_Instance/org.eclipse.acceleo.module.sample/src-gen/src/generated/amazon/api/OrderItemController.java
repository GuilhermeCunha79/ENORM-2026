package generated.amazon.api;

import generated.amazon.dto.OrderItemDto;
import generated.amazon.service.OrderItemService;
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
public class OrderItemController {
    private final OrderItemService service;

    public OrderItemController(OrderItemService service) {
        this.service = service;
    }

    @GetMapping
    public List<OrderItemDto> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public OrderItemDto get(@PathVariable String id) {
        return service.get(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public OrderItemDto create(@RequestBody OrderItemDto dto) {
        return service.create(dto);
    }

    @PutMapping("/{id}")
    public OrderItemDto update(@PathVariable String id, @RequestBody OrderItemDto dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

    @GetMapping("/{id}/orderItemProduct")
    public String product(@PathVariable String id) {
        service.get(id);
        return "Generated relation endpoint for orderItemProduct";
    }
}
