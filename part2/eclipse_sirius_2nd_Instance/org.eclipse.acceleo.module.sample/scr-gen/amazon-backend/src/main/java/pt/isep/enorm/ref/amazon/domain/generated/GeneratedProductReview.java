package pt.isep.enorm.ref.amazon.domain.generated;

import pt.isep.enorm.ref.amazon.domain.enums.ReviewStatus;
import pt.isep.enorm.ref.amazon.domain.enums.VerificationType;
import pt.isep.enorm.ref.amazon.domain.AmazonUser;
import pt.isep.enorm.ref.amazon.domain.Product;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import java.time.Instant;

@MappedSuperclass
public abstract class GeneratedProductReview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id")
    private AmazonUser author;
    @Column(length = 2000)
    private String comment;
    private Integer rating;
    private Integer grade;
    @Enumerated(EnumType.STRING)
    private ReviewStatus status = ReviewStatus.PENDING;
    @Enumerated(EnumType.STRING)
    private VerificationType verificationType = VerificationType.AUTOMATIC;
    private boolean verifiedBuyerAtSubmission;
    private Instant submittedAt = Instant.now();

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }
    public AmazonUser getAuthor() { return author; }
    public void setAuthor(AmazonUser author) { this.author = author; }
    public String getComment() { return comment; }
    public void setComment(String comment) { this.comment = comment; }
    public Integer getRating() { return rating == null ? grade : rating; }
    public void setRating(Integer rating) { this.rating = rating; }
    public Integer getGrade() { return grade == null ? rating : grade; }
    public void setGrade(Integer grade) { this.grade = grade; }
    public ReviewStatus getStatus() { return status; }
    public void setStatus(ReviewStatus status) { this.status = status; }
    public VerificationType getVerificationType() { return verificationType; }
    public void setVerificationType(VerificationType verificationType) { this.verificationType = verificationType; }
    public boolean isVerifiedBuyerAtSubmission() { return verifiedBuyerAtSubmission; }
    public void setVerifiedBuyerAtSubmission(boolean verifiedBuyerAtSubmission) { this.verifiedBuyerAtSubmission = verifiedBuyerAtSubmission; }
    public Instant getSubmittedAt() { return submittedAt; }
    public void setSubmittedAt(Instant submittedAt) { this.submittedAt = submittedAt; }
}
