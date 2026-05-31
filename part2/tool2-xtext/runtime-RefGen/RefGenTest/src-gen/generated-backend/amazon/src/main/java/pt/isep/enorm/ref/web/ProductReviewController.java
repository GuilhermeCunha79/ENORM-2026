package pt.isep.enorm.ref.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.isep.enorm.ref.service.ProductReviewService;
import pt.isep.enorm.ref.web.generated.GeneratedProductReviewController;

@RestController
@RequestMapping("/api/product-reviews")
public class ProductReviewController extends GeneratedProductReviewController {
    public ProductReviewController(ProductReviewService service) {
        super(service);
    }
}
