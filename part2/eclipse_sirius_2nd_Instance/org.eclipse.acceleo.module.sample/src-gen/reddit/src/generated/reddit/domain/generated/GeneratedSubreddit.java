package generated.reddit.domain.generated;

import java.net.URI;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class GeneratedSubreddit  {
private Long id;
private String name;
private String description;
private List<GeneratedPost> posts = new ArrayList<GeneratedPost>();
private List<GeneratedCommunityRule> communityRules = new ArrayList<GeneratedCommunityRule>();
private List<GeneratedParticipationPolicy> participationPolicys = new ArrayList<GeneratedParticipationPolicy>();
private List<GeneratedContentValidationRule> contentValidationRules = new ArrayList<GeneratedContentValidationRule>();
private GeneratedSubscription subscription;
}
