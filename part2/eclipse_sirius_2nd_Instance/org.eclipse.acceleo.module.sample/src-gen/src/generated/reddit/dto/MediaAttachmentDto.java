package generated.reddit.dto;

import java.net.URI;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public record MediaAttachmentDto(
        String id , String type , URI url
) {}
