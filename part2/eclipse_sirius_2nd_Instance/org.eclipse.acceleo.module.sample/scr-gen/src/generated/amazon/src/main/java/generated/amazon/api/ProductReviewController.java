package generated.amazon.api;

import generated.amazon.domain.ProductReview;
import generated.amazon.service.ProductReviewService;
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
@RequestMapping("/api/productReviews")
public class ProductReviewController {
    private final ProductReviewService service;

    public ProductReviewController(ProductReviewService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductReview> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductReview get(@PathVariable String id) {
        return service.get(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductReview create(@RequestBody ProductReview entity) {
        return service.create(entity);
    }

    @PutMapping("/{id}")
    public ProductReview update(@PathVariable String id, @RequestBody ProductReview entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
