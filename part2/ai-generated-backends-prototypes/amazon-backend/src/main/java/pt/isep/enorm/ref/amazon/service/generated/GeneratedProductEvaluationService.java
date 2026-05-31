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
    public Product createProduct(Product request) {
        validateCreateProductRequest(request);

        Product product = new Product();
        product.setName(request.getName());
        product.setDescription(request.getDescription());
        product.setPrice(request.getPrice());
        product.setCreatedAt(request.getCreatedAt() == null ? LocalDate.now() : request.getCreatedAt());

        return productRepository.save(product);
    }

    @Transactional
    public ProductReview submitReview(String username, ProductReview request) {
        if (request.getProduct() == null || request.getProduct().getId() == null) {
            throw new IllegalArgumentException("Product id is required.");
        }

        return submitReview(username, request.getProduct().getId(), request);
    }

    @Transactional
    public ProductReview submitReview(String username, Long productId, ProductReview request) {
        AmazonUser user = loadUserByUsername(username);
        Product product = loadProduct(productId);

        validateReviewRequest(user, product, request);
        validateBusinessRules(product, user, request);

        ProductReview review = new ProductReview();
        boolean verifiedBuyer = isVerifiedBuyerForProduct(user, product);

        review.setProduct(product);
        review.setAuthor(user);
        review.setComment(request.getComment());
        review.setGrade(request.getGrade());
        review.setVerificationType(resolveVerificationType(user, product, verifiedBuyer));
        review.setStatus(resolveReviewStatus(user, product, verifiedBuyer));
        review.setVerifiedBuyerAtSubmission(verifiedBuyer);
        review.setSubmittedAt(Instant.now());

        applyMediaReferences(request.getMediaReferences(), review);

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

    protected void validateBusinessRules(Product product, AmazonUser user, ProductReview request) {
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

    private void validateCreateProductRequest(Product request) {
        if (request.getName() == null || request.getName().isBlank()) {
            throw new IllegalArgumentException("Product name is required.");
        }

        if (request.getDescription() == null || request.getDescription().isBlank()) {
            throw new IllegalArgumentException("Product description is required.");
        }

        if (request.getPrice() == null || request.getPrice().compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Product price must be greater than zero.");
        }
    }

    private void validateReviewRequest(AmazonUser user, Product product, ProductReview request) {
        if (user == null || product == null || request == null) {
            throw new IllegalArgumentException("User and product are required.");
        }

        if (request.getGrade() < 1 || request.getGrade() > 5) {
            throw new IllegalArgumentException("Grade must be between 1 and 5.");
        }

        if (request.getComment() == null || request.getComment().isBlank()) {
            throw new IllegalArgumentException("Comment is required.");
        }

        if (request.getMediaReferences() != null) {
            for (ReviewMediaReference mediaReference : request.getMediaReferences()) {
                if (mediaReference.getUrl() == null || mediaReference.getUrl().isBlank()) {
                    throw new IllegalArgumentException("Media reference URL is required.");
                }
            }
        }
    }

    private void applyMediaReferences(List<ReviewMediaReference> mediaReferences, ProductReview review) {
        if (mediaReferences == null) {
            return;
        }

        for (ReviewMediaReference mediaReferenceRequest : mediaReferences) {
            ReviewMediaReference mediaReference = new ReviewMediaReference();
            mediaReference.setMediaType(mediaReferenceRequest.getMediaType());
            mediaReference.setUrl(mediaReferenceRequest.getUrl());
            review.addMediaReference(mediaReference);
        }
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
