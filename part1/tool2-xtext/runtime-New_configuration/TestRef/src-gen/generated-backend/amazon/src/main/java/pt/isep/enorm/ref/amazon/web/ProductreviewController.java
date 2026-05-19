package pt.isep.enorm.ref.amazon.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.isep.enorm.ref.amazon.service.ProductreviewService;
import pt.isep.enorm.ref.amazon.web.generated.GeneratedProductreviewController;

@RestController
@RequestMapping("/api/productreviews")
public class ProductreviewController extends GeneratedProductreviewController {
    public ProductreviewController(ProductreviewService service) {
        super(service);
    }
}
