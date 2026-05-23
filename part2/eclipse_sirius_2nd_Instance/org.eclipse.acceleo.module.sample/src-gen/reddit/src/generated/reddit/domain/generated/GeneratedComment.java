package generated.reddit.domain.generated;

import java.net.URI;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class GeneratedComment extends GeneratedContent {
private String body;
private Boolean supportsVote;
private Boolean supportsReport;
private GeneratedPost post;
private List<GeneratedComment> children = new ArrayList<GeneratedComment>();
private List<GeneratedMediaAttachment> mediaAttachments = new ArrayList<GeneratedMediaAttachment>();
private List<GeneratedCommentModerationCheck> commentModerationChecks = new ArrayList<GeneratedCommentModerationCheck>();
private GeneratedComment parent;
}
