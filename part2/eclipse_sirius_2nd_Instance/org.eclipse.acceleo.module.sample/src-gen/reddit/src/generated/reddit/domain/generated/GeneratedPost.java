package generated.reddit.domain.generated;

import java.net.URI;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class GeneratedPost extends GeneratedContent {
private String title;
private String body;
private String type;
private Boolean supportsVote;
private Boolean supportsReport;
private List<GeneratedPostModerationCheck> postModerationChecks = new ArrayList<GeneratedPostModerationCheck>();
private GeneratedSubreddit subreddit;
private GeneratedComment comment;
}
