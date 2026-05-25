package generated.reddit.dto;

import java.net.URI;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public record CommentDto(
        String id , String body , Boolean supportsVote , Boolean supportsReport
) {}
