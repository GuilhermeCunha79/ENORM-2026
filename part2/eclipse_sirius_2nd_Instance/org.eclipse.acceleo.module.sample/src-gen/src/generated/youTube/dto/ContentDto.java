package generated.youTube.dto;

import java.net.URI;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public record ContentDto(
        String id , LocalDate creationDate , String status
) {}
