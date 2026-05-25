package generated.amazon.dto;

import java.net.URI;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public record VerificationProcessDto(
        String id , String type , String status , LocalDateTime timestamp
) {}
