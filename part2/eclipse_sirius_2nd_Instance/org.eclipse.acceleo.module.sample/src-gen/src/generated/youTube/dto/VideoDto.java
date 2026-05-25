package generated.youTube.dto;

import java.net.URI;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public record VideoDto(
        String id , String title , String description , LocalDate uploadDate , Double duration , String commentStatus
) {}
