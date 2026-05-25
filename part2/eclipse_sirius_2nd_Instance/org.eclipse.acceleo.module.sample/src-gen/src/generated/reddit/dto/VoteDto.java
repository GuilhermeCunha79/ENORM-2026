package generated.reddit.dto;

import java.net.URI;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public record VoteDto(
        String id , String value , LocalDateTime timestamp
) {}
