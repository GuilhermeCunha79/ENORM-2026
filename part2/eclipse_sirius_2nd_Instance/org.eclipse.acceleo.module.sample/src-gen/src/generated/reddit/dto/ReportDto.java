package generated.reddit.dto;

import java.net.URI;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public record ReportDto(
        String id , String reason , String status , LocalDateTime timestamp
) {}
