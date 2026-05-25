package generated.amazon.dto;

import java.net.URI;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public record ReviewPolicyDto(
        String id , Boolean requiresVerifiedPurchase , String verificationRequirement , Boolean oneReviewPerOrderItem
) {}
