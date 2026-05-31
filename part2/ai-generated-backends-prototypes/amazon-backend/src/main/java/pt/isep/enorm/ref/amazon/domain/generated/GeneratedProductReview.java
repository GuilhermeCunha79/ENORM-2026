package pt.isep.enorm.ref.amazon.domain.generated;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
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
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import pt.isep.enorm.ref.amazon.domain.AmazonUser;
import pt.isep.enorm.ref.amazon.domain.Product;
import pt.isep.enorm.ref.amazon.domain.ProductReview;
import pt.isep.enorm.ref.amazon.domain.ReviewMediaReference;
import pt.isep.enorm.ref.amazon.domain.enums.ReviewStatus;
import pt.isep.enorm.ref.amazon.domain.enums.VerificationType;

@MappedSuperclass
public abstract class GeneratedProductReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "author_id", nullable = false)
    private AmazonUser author;

    @Column(nullable = false, length = 2000)
    private String comment;

    @Min(1)
    @Max(5)
    @Column(nullable = false)
    private int grade;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 16)
    private ReviewStatus status;

    @Enumerated(EnumType.STRING)
    @Column(name = "verification_type", nullable = false, length = 16)
    private VerificationType verificationType;

    @Column(name = "verified_buyer_at_submission", nullable = false)
    private boolean verifiedBuyerAtSubmission;

    @Column(name = "submitted_at", nullable = false)
    private Instant submittedAt;

    @OneToMany(mappedBy = "review", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ReviewMediaReference> mediaReferences = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public AmazonUser getAuthor() {
        return author;
    }

    public void setAuthor(AmazonUser author) {
        this.author = author;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public ReviewStatus getStatus() {
        return status;
    }

    public void setStatus(ReviewStatus status) {
        this.status = status;
    }

    public VerificationType getVerificationType() {
        return verificationType;
    }

    public void setVerificationType(VerificationType verificationType) {
        this.verificationType = verificationType;
    }

    public boolean isVerifiedBuyerAtSubmission() {
        return verifiedBuyerAtSubmission;
    }

    public void setVerifiedBuyerAtSubmission(boolean verifiedBuyerAtSubmission) {
        this.verifiedBuyerAtSubmission = verifiedBuyerAtSubmission;
    }

    public Instant getSubmittedAt() {
        return submittedAt;
    }

    public void setSubmittedAt(Instant submittedAt) {
        this.submittedAt = submittedAt;
    }

    public List<ReviewMediaReference> getMediaReferences() {
        return mediaReferences;
    }

    public void addMediaReference(ReviewMediaReference mediaReference) {
        mediaReference.setReview((ProductReview) this);
        mediaReferences.add(mediaReference);
    }
}