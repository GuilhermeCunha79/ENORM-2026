package generated.amazon.model;

public final class Resources {

    private Resources() {
    }

    public static final class Product {

        public static final String TYPE = "Product";
        public static final boolean SUPPORTS_MEDIA = true;

        private String id;
        private String name;
        private String description;

        public Product() {
        }

        public String getId() {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return this.description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

    }

    public static final class Order {

        public static final String TYPE = "Order";
        public static final boolean SUPPORTS_MEDIA = false;

        private String id;
        private java.time.LocalDate date;

        public Order() {
        }

        public String getId() {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public java.time.LocalDate getDate() {
            return this.date;
        }

        public void setDate(java.time.LocalDate date) {
            this.date = date;
        }

    }

    public static final class OrderItem {

        public static final String TYPE = "OrderItem";
        public static final boolean SUPPORTS_MEDIA = false;

        private Double quantity;

        public OrderItem() {
        }

        public Double getQuantity() {
            return this.quantity;
        }

        public void setQuantity(Double quantity) {
            this.quantity = quantity;
        }

    }

    public static final class ProductReview {

        public static final String TYPE = "ProductReview";
        public static final boolean SUPPORTS_MEDIA = true;

        private String id;
        private Double rating;
        private String text;
        private java.time.LocalDate creationDate;
        private Boolean verifiedPurchase;

        public ProductReview() {
        }

        public String getId() {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Double getRating() {
            return this.rating;
        }

        public void setRating(Double rating) {
            this.rating = rating;
        }

        public String getText() {
            return this.text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public java.time.LocalDate getCreationDate() {
            return this.creationDate;
        }

        public void setCreationDate(java.time.LocalDate creationDate) {
            this.creationDate = creationDate;
        }

        public Boolean getVerifiedPurchase() {
            return this.verifiedPurchase;
        }

        public void setVerifiedPurchase(Boolean verifiedPurchase) {
            this.verifiedPurchase = verifiedPurchase;
        }

    }

    public static final class MediaAttachment {

        public static final String TYPE = "MediaAttachment";
        public static final boolean SUPPORTS_MEDIA = true;

        private String id;
        private String type;
        private java.net.URI url;

        public MediaAttachment() {
        }

        public String getId() {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getType() {
            return this.type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public java.net.URI getUrl() {
            return this.url;
        }

        public void setUrl(java.net.URI url) {
            this.url = url;
        }

    }

    public static final class HelpfulVote {

        public static final String TYPE = "HelpfulVote";
        public static final boolean SUPPORTS_MEDIA = false;

        private String id;
        private String value;
        private java.time.LocalDateTime timestamp;

        public HelpfulVote() {
        }

        public String getId() {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getValue() {
            return this.value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public java.time.LocalDateTime getTimestamp() {
            return this.timestamp;
        }

        public void setTimestamp(java.time.LocalDateTime timestamp) {
            this.timestamp = timestamp;
        }

    }

    public static final class VerificationProcess {

        public static final String TYPE = "VerificationProcess";
        public static final boolean SUPPORTS_MEDIA = false;

        private String id;
        private String type;
        private String status;
        private java.time.LocalDateTime timestamp;

        public VerificationProcess() {
        }

        public String getId() {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getType() {
            return this.type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getStatus() {
            return this.status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public java.time.LocalDateTime getTimestamp() {
            return this.timestamp;
        }

        public void setTimestamp(java.time.LocalDateTime timestamp) {
            this.timestamp = timestamp;
        }

    }

    public static final class ReviewPolicy {

        public static final String TYPE = "ReviewPolicy";
        public static final boolean SUPPORTS_MEDIA = false;

        private String id;
        private Boolean requiresVerifiedPurchase;
        private String verificationRequirement;
        private Boolean oneReviewPerOrderItem;

        public ReviewPolicy() {
        }

        public String getId() {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Boolean getRequiresVerifiedPurchase() {
            return this.requiresVerifiedPurchase;
        }

        public void setRequiresVerifiedPurchase(Boolean requiresVerifiedPurchase) {
            this.requiresVerifiedPurchase = requiresVerifiedPurchase;
        }

        public String getVerificationRequirement() {
            return this.verificationRequirement;
        }

        public void setVerificationRequirement(String verificationRequirement) {
            this.verificationRequirement = verificationRequirement;
        }

        public Boolean getOneReviewPerOrderItem() {
            return this.oneReviewPerOrderItem;
        }

        public void setOneReviewPerOrderItem(Boolean oneReviewPerOrderItem) {
            this.oneReviewPerOrderItem = oneReviewPerOrderItem;
        }

    }

    public static final class ReviewModerationCheck {

        public static final String TYPE = "ReviewModerationCheck";
        public static final boolean SUPPORTS_MEDIA = false;

        private String id;
        private String reason;
        private String result;
        private java.time.LocalDateTime timestamp;

        public ReviewModerationCheck() {
        }

        public String getId() {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getReason() {
            return this.reason;
        }

        public void setReason(String reason) {
            this.reason = reason;
        }

        public String getResult() {
            return this.result;
        }

        public void setResult(String result) {
            this.result = result;
        }

        public java.time.LocalDateTime getTimestamp() {
            return this.timestamp;
        }

        public void setTimestamp(java.time.LocalDateTime timestamp) {
            this.timestamp = timestamp;
        }

    }

}
