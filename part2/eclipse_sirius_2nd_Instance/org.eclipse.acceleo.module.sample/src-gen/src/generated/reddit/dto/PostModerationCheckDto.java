package generated.reddit.dto;

import java.net.URI;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public record PostModerationCheckDto(
        String id , String type , String result , LocalDate timestamp
) {}
