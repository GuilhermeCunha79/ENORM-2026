package generated.youTube.dto;

import java.net.URI;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public record CommentSettingsChangeDto(
        String id , String newStatus , LocalDate timestamp
) {}
