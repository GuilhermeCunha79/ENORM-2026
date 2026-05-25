package generated.reddit.dto;

import java.net.URI;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public record PostDto(
        String id , String title , String body , String type , Boolean supportsVote , Boolean supportsReport
) {}
