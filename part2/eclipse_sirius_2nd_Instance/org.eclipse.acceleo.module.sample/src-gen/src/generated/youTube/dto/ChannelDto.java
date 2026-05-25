package generated.youTube.dto;

import java.net.URI;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public record ChannelDto(
        String id , String name , String description , LocalDate creationDate
) {}
