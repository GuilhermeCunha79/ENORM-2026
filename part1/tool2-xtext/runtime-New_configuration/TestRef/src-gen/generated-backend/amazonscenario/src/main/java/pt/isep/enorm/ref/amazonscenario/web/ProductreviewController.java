package pt.isep.enorm.ref.amazonscenario.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.isep.enorm.ref.amazonscenario.service.ProductreviewService;
import pt.isep.enorm.ref.amazonscenario.web.generated.GeneratedProductreviewController;

@RestController
@RequestMapping("/api/productreviews")
public class ProductreviewController extends GeneratedProductreviewController {
    public ProductreviewController(ProductreviewService service) {
        super(service);
    }
}
