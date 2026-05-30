package generated.amazon.web.generated;

import generated.amazon.domain.Product;
import generated.amazon.service.generated.GeneratedProductService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class GeneratedProductController {

    private final GeneratedProductService productService;

    public GeneratedProductController(GeneratedProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> list() {
        return productService.list();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Product create(@RequestBody Product product) {
        return productService.create(product);
    }

    @GetMapping("/{productId}/average-rating")
    public double averageRating(@PathVariable String productId) {
        // Placeholder: aggregate over reviews when the review model is wired
        return 0.0;
    }

    @PostMapping("/{productId}/reviews")
    @ResponseStatus(HttpStatus.CREATED)
    public void createReview(@PathVariable String productId, @RequestBody Object payload) {
        // Placeholder: delegate to a review service when available
    }
}
