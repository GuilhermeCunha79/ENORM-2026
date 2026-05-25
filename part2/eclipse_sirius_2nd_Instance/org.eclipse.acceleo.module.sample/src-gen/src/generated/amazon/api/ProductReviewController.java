package generated.amazon.api;

import generated.amazon.dto.ProductReviewDto;
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
    public List<ProductReviewDto> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ProductReviewDto get(@PathVariable String id) {
        return service.get(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductReviewDto create(@RequestBody ProductReviewDto dto) {
        return service.create(dto);
    }

    @PutMapping("/{id}")
    public ProductReviewDto update(@PathVariable String id, @RequestBody ProductReviewDto dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

    @GetMapping("/{id}/reviewHasAttachments")
    public String mediaAttachments(@PathVariable String id) {
        service.get(id);
        return "Generated relation endpoint for reviewHasAttachments";
    }

    @GetMapping("/{id}/reviewHasVerification")
    public String verificationProcess(@PathVariable String id) {
        service.get(id);
        return "Generated relation endpoint for reviewHasVerification";
    }

    @GetMapping("/{id}/reviewHasModerationChecks")
    public String reviewModerationChecks(@PathVariable String id) {
        service.get(id);
        return "Generated relation endpoint for reviewHasModerationChecks";
    }

    @GetMapping("/{id}/reviewHasVotes")
    public String helpfulVotes(@PathVariable String id) {
        service.get(id);
        return "Generated relation endpoint for reviewHasVotes";
    }

    @GetMapping("/{id}/reviewUsesRatingPolicy")
    public String ratingPolicy(@PathVariable String id) {
        service.get(id);
        return "Generated relation endpoint for reviewUsesRatingPolicy";
    }

    @GetMapping("/{id}/reviewConstrainedByPolicy")
    public String reviewPolicy(@PathVariable String id) {
        service.get(id);
        return "Generated relation endpoint for reviewConstrainedByPolicy";
    }

    @PostMapping("/{id}/votes")
    public String helpfulVote(@PathVariable String id) {
        service.get(id);
        return "Vote review as helpful or not helpful";
    }

    @PostMapping("/{id}/verification")
    public String verifyReview(@PathVariable String id) {
        service.get(id);
        return "Start or update review verification process";
    }
}
