package generated.youTube.dto;

import java.net.URI;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public record LikeHistoryDto(
        String id , String action , LocalDate timestamp
) {}
