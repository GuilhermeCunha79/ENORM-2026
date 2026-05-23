package generated.amazon.model;

import java.util.List;

public final class Resources {
private Resources() {
}

public static final class Product {
public static final String TYPE = "Product";
public static final boolean SUPPORTS_MEDIA = true;
private String id;
private String name;
private String description;
}
public static final class Order {
public static final String TYPE = "Order";
public static final boolean SUPPORTS_MEDIA = false;
private String id;
private LocalDate date;
}
public static final class OrderItem {
public static final String TYPE = "OrderItem";
public static final boolean SUPPORTS_MEDIA = false;
private Double quantity;
}
public static final class ProductReview {
public static final String TYPE = "ProductReview";
public static final boolean SUPPORTS_MEDIA = true;
private String id;
private Double rating;
private String text;
private LocalDate creationDate;
private Boolean verifiedPurchase;
}
public static final class MediaAttachment {
public static final String TYPE = "MediaAttachment";
public static final boolean SUPPORTS_MEDIA = true;
private String id;
private String type;
private URI url;
}
public static final class HelpfulVote {
public static final String TYPE = "HelpfulVote";
public static final boolean SUPPORTS_MEDIA = false;
private String id;
private String value;
private LocalDateTime timestamp;
}
public static final class VerificationProcess {
public static final String TYPE = "VerificationProcess";
public static final boolean SUPPORTS_MEDIA = false;
private String id;
private String type;
private String status;
private LocalDateTime timestamp;
}
public static final class ReviewPolicy {
public static final String TYPE = "ReviewPolicy";
public static final boolean SUPPORTS_MEDIA = false;
private String id;
private Boolean requiresVerifiedPurchase;
private String verificationRequirement;
private Boolean oneReviewPerOrderItem;
}
public static final class ReviewModerationCheck {
public static final String TYPE = "ReviewModerationCheck";
public static final boolean SUPPORTS_MEDIA = false;
private String id;
private String reason;
private String result;
private LocalDateTime timestamp;
}
public static final class RatingPolicy {
public static final String TYPE = "RatingPolicy";
public static final boolean SUPPORTS_MEDIA = false;
private Double minValue;
private Double maxValue;
private Double step;
}
}
