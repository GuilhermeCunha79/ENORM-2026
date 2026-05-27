package generated.amazon.domain.generated;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import java.net.URI;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@MappedSuperclass
public abstract class GeneratedReviewPolicy {
    @Id
    @Column(name = "id", nullable = false, updatable = false)
    private String id;
    @Column(name = "requiresVerifiedPurchase")
    private Boolean requiresVerifiedPurchase;
    @Column(name = "verificationRequirement")
    private String verificationRequirement;
    @Column(name = "oneReviewPerOrderItem")
    private Boolean oneReviewPerOrderItem;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public Boolean getRequiresVerifiedPurchase() {
        return requiresVerifiedPurchase;
    }

    public void setRequiresVerifiedPurchase(Boolean requiresVerifiedPurchase) {
        this.requiresVerifiedPurchase = requiresVerifiedPurchase;
    }
    public String getVerificationRequirement() {
        return verificationRequirement;
    }

    public void setVerificationRequirement(String verificationRequirement) {
        this.verificationRequirement = verificationRequirement;
    }
    public Boolean getOneReviewPerOrderItem() {
        return oneReviewPerOrderItem;
    }

    public void setOneReviewPerOrderItem(Boolean oneReviewPerOrderItem) {
        this.oneReviewPerOrderItem = oneReviewPerOrderItem;
    }
}
