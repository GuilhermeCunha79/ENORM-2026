package generated.amazon.dto;

import java.net.URI;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public record RatingPolicyDto(
        String id , Double minValue , Double maxValue , Double step
) {}
