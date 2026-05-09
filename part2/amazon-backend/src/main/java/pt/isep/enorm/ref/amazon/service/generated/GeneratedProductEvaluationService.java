package pt.isep.enorm.ref.amazon.service.generated;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import pt.isep.enorm.ref.amazon.domain.AmazonUser;
import pt.isep.enorm.ref.amazon.domain.Product;
import pt.isep.enorm.ref.amazon.domain.ProductReview;
import pt.isep.enorm.ref.amazon.domain.ReviewMediaReference;
import pt.isep.enorm.ref.amazon.domain.enums.ReviewStatus;
import pt.isep.enorm.ref.amazon.domain.enums.VerificationType;
import pt.isep.enorm.ref.amazon.repository.AmazonUserRepository;
import pt.isep.enorm.ref.amazon.repository.ProductRepository;
import pt.isep.enorm.ref.amazon.repository.ProductReviewRepository;
import pt.isep.enorm.ref.amazon.service.command.CreateProductCommand;
import pt.isep.enorm.ref.amazon.service.command.MediaReferenceCommand;
import pt.isep.enorm.ref.amazon.service.command.SubmitProductReviewCommand;
import pt.isep.enorm.ref.amazon.service.projection.ProductRatingSummary;
import pt.isep.enorm.ref.amazon.web.error.ResourceNotFoundException;

@Transactional(readOnly = true)
public abstract class GeneratedProductEvaluationService {

    private final ProductRepository productRepository;
    private final AmazonUserRepository amazonUserRepository;
    private final ProductReviewRepository productReviewRepository;

    protected GeneratedProductEvaluationService(
        ProductRepository productRepository,
        AmazonUserRepository amazonUserRepository,
        ProductReviewRepository productReviewRepository
    ) {
        this.productRepository = productRepository;
        this.amazonUserRepository = amazonUserRepository;
        this.productReviewRepository = productReviewRepository;
    }

    public List<Product> listProducts() {
        return productRepository.findAllByOrderByNameAsc();
    }

    @Transactional
    public Product createProduct(CreateProductCommand command) {
        validateCreateProductRequest(command);

        Product product = new Product();
        product.setName(command.name());
        product.setDescription(command.description());
        product.setPrice(command.price());
        product.setCreatedAt(command.createdAt() == null ? LocalDate.now() : command.createdAt());

        return productRepository.save(product);
    }

    @Transactional
    public ProductReview submitReview(String username, SubmitProductReviewCommand command) {
        AmazonUser user = loadUserByUsername(username);
        Product product = loadProduct(command.productId());

        validateReviewRequest(user, product, command);
        validateBusinessRules(product, user, command);

        ProductReview review = new ProductReview();
        boolean verifiedBuyer = isVerifiedBuyerForProduct(user, product);

        review.setProduct(product);
        review.setAuthor(user);
        review.setComment(command.comment());
        review.setGrade(command.grade());
        review.setVerificationType(resolveVerificationType(user, product, verifiedBuyer));
        review.setStatus(resolveReviewStatus(user, product, verifiedBuyer));
        review.setVerifiedBuyerAtSubmission(verifiedBuyer);
        review.setSubmittedAt(Instant.now());

        for (MediaReferenceCommand mediaReferenceCommand : command.mediaReferences()) {
            review.addMediaReference(toMediaReference(mediaReferenceCommand));
        }

        ProductReview savedReview = productReviewRepository.save(review);
        afterReviewSubmitted(savedReview);
        return savedReview;
    }

    public ProductRatingSummary getRatingSummary(Long productId) {
        loadProduct(productId);

        Double average = productReviewRepository.findAverageGradeByProductIdAndStatus(productId, ReviewStatus.APPROVED);
        long totalReviews = productReviewRepository.countByProductIdAndStatus(productId, ReviewStatus.APPROVED);

        return new ProductRatingSummary(productId, roundAverage(average), totalReviews);
    }

    protected void validateBusinessRules(Product product, AmazonUser user, SubmitProductReviewCommand command) {
        if (productReviewRepository.existsByProductIdAndAuthorId(product.getId(), user.getId())) {
            throw new IllegalStateException("Each user can only submit one review per product.");
        }
    }

    protected void afterReviewSubmitted(ProductReview savedReview) {
    }

    protected boolean isVerifiedBuyerForProduct(AmazonUser user, Product product) {
        return user.isVerifiedBuyer();
    }

    protected VerificationType resolveVerificationType(AmazonUser user, Product product, boolean verifiedBuyer) {
        return verifiedBuyer ? VerificationType.AUTOMATIC : VerificationType.MANUAL;
    }

    protected ReviewStatus resolveReviewStatus(AmazonUser user, Product product, boolean verifiedBuyer) {
        return verifiedBuyer ? ReviewStatus.APPROVED : ReviewStatus.PENDING;
    }

    private Product loadProduct(Long productId) {
        return productRepository.findById(productId)
            .orElseThrow(() -> new ResourceNotFoundException("Product '%s' was not found.".formatted(productId)));
    }

    private AmazonUser loadUserByUsername(String username) {
        return amazonUserRepository.findByUsername(username)
            .orElseThrow(() -> new ResourceNotFoundException("User '%s' was not found.".formatted(username)));
    }

    private void validateCreateProductRequest(CreateProductCommand command) {
        if (command.name().isBlank()) {
            throw new IllegalArgumentException("Product name is required.");
        }

        if (command.description().isBlank()) {
            throw new IllegalArgumentException("Product description is required.");
        }

        if (command.price().compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Product price must be greater than zero.");
        }
    }

    private void validateReviewRequest(AmazonUser user, Product product, SubmitProductReviewCommand command) {
        if (user == null || product == null) {
            throw new IllegalArgumentException("User and product are required.");
        }

        if (command.grade() < 1 || command.grade() > 5) {
            throw new IllegalArgumentException("Grade must be between 1 and 5.");
        }

        if (command.comment().isBlank()) {
            throw new IllegalArgumentException("Comment is required.");
        }

        for (MediaReferenceCommand mediaReferenceCommand : command.mediaReferences()) {
            if (mediaReferenceCommand.url().isBlank()) {
                throw new IllegalArgumentException("Media reference URL is required.");
            }
        }
    }

    private ReviewMediaReference toMediaReference(MediaReferenceCommand mediaReferenceCommand) {
        ReviewMediaReference mediaReference = new ReviewMediaReference();
        mediaReference.setMediaType(mediaReferenceCommand.mediaType());
        mediaReference.setUrl(mediaReferenceCommand.url());
        return mediaReference;
    }

    private double roundAverage(Double average) {
        if (average == null) {
            return 0.0;
        }

        return BigDecimal.valueOf(average)
            .setScale(2, RoundingMode.HALF_UP)
            .doubleValue();
    }
}
