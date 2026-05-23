package generated.amazon.model;

import java.util.List;

public final class Contexts {
private Contexts() {
}

public record ContextSpec(String name, String kind, List<String> contains) {}

public static List<ContextSpec> all() {
return List.of(
new ContextSpec("AmazonCatalog", "CATALOG", List.of("Product", "Order", "OrderItem", "ProductReview", "MediaAttachment", "HelpfulVote", "ReviewPolicy", "RatingPolicy"))
,new ContextSpec("ModerationBackoffice", "GLOBAL", List.of("ProductReview", "ReviewModerationCheck", "VerificationProcess"))
);
}
}
