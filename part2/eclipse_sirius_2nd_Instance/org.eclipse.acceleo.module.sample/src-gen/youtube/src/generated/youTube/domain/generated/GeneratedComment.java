package generated.youTube.domain.generated;

import java.net.URI;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class GeneratedComment extends GeneratedContent {
private String text;
private List<GeneratedComment> children = new ArrayList<GeneratedComment>();
private List<GeneratedCommentModerationCheck> commentModerationChecks = new ArrayList<GeneratedCommentModerationCheck>();
private List<GeneratedContentValidationRule> contentValidationRules = new ArrayList<GeneratedContentValidationRule>();
private GeneratedVideo video;
private GeneratedComment parent;
}
