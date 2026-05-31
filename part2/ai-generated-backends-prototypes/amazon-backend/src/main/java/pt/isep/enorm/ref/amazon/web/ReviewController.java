package pt.isep.enorm.ref.amazon.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.isep.enorm.ref.amazon.service.ProductEvaluationService;
import pt.isep.enorm.ref.amazon.web.generated.GeneratedReviewController;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController extends GeneratedReviewController {

    public ReviewController(ProductEvaluationService productEvaluationService) {
        super(productEvaluationService);
    }
}