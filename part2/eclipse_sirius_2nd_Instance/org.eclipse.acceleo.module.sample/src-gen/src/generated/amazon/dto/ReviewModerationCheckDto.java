package generated.amazon.dto;

import java.net.URI;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public record ReviewModerationCheckDto(
        String id , String reason , String result , LocalDateTime timestamp
) {}
