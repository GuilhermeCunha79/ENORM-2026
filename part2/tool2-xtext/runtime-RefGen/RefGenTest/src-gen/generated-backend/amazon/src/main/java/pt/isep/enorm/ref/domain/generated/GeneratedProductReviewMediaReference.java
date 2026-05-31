package pt.isep.enorm.ref.domain.generated;

import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import pt.isep.enorm.ref.domain.ProductReview;

@MappedSuperclass
public abstract class GeneratedProductReviewMediaReference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "media_type", length = 16)
    private String mediaType;

    @Column(length = 1000)
    private String url;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "productreview_id")
    private ProductReview productReview;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getMediaType() { return mediaType; }
    public void setMediaType(String mediaType) { this.mediaType = mediaType; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
    public ProductReview getProductReview() { return productReview; }
    public void setProductReview(ProductReview productReview) { this.productReview = productReview; }
}
