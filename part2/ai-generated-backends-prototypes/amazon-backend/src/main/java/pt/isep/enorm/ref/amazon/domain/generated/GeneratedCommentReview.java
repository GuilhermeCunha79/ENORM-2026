package pt.isep.enorm.ref.amazon.domain.generated;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToMany;
import pt.isep.enorm.ref.amazon.domain.CommentMediaReference;
import pt.isep.enorm.ref.amazon.domain.CommentReview;
import pt.isep.enorm.ref.amazon.domain.Product;
import pt.isep.enorm.ref.amazon.domain.value.CommentReviewCode;
import pt.isep.enorm.ref.amazon.domain.value.CommentReviewCreatedAt;
import pt.isep.enorm.ref.amazon.domain.value.CommentReviewText;

@MappedSuperclass
public abstract class GeneratedCommentReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private CommentReviewCode commentCode;

    @Embedded
    private CommentReviewText text;

    @Embedded
    private CommentReviewCreatedAt createdAt;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @OneToMany(mappedBy = "comment", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CommentMediaReference> mediaReferences = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCommentCode() {
        return commentCode == null ? null : commentCode.getValue();
    }

    public void setCommentCode(String commentCode) {
        this.commentCode = commentCode == null ? null : new CommentReviewCode(commentCode);
    }

    public String getText() {
        return text == null ? null : text.getValue();
    }

    public void setText(String text) {
        this.text = text == null ? null : new CommentReviewText(text);
    }

    public LocalDate getCreatedAt() {
        return createdAt == null ? null : createdAt.getValue();
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt == null ? null : new CommentReviewCreatedAt(createdAt);
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<CommentMediaReference> getMediaReferences() {
        return mediaReferences;
    }

    public void addMediaReference(CommentMediaReference mediaReference) {
        mediaReference.setComment((CommentReview) this);
        mediaReferences.add(mediaReference);
    }
}
