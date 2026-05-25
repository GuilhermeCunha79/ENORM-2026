package generated.youTube.dto;

import java.net.URI;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public record ContentValidationRuleDto(
        String id , String target , String policyType , String severity
) {}
