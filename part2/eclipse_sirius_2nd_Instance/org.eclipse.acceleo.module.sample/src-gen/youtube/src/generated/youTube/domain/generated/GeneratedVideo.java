package generated.youTube.domain.generated;

import java.net.URI;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class GeneratedVideo extends GeneratedContent {
private String title;
private String description;
private LocalDate uploadDate;
private Double duration;
private String commentStatus;
private List<GeneratedComment> comments = new ArrayList<GeneratedComment>();
private List<GeneratedVideoModerationCheck> videoModerationChecks = new ArrayList<GeneratedVideoModerationCheck>();
private List<GeneratedContentValidationRule> contentValidationRules = new ArrayList<GeneratedContentValidationRule>();
private GeneratedChannel channel;
private GeneratedCommentSettingsChange commentSettingsChange;
}
