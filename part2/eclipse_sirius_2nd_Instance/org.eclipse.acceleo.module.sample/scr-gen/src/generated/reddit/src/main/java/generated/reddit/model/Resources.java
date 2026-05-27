package generated.reddit.model;

import java.util.List;

public final class Resources {
    private Resources() {
    }

    public record SubredditSpec(String type, boolean supportsMedia, List<String> superTypes, String restPath) {}
    public record ContentSpec(String type, boolean supportsMedia, List<String> superTypes, String restPath) {}
    public record PostSpec(String type, boolean supportsMedia, List<String> superTypes, String restPath) {}
    public record CommentSpec(String type, boolean supportsMedia, List<String> superTypes, String restPath) {}
    public record MediaAttachmentSpec(String type, boolean supportsMedia, List<String> superTypes, String restPath) {}
    public record CommunityRuleSpec(String type, boolean supportsMedia, List<String> superTypes, String restPath) {}
    public record ParticipationPolicySpec(String type, boolean supportsMedia, List<String> superTypes, String restPath) {}
    public record ContentValidationRuleSpec(String type, boolean supportsMedia, List<String> superTypes, String restPath) {}
    public record PostModerationCheckSpec(String type, boolean supportsMedia, List<String> superTypes, String restPath) {}
    public record CommentModerationCheckSpec(String type, boolean supportsMedia, List<String> superTypes, String restPath) {}
    public record VoteSpec(String type, boolean supportsMedia, List<String> superTypes, String restPath) {}
    public record ReportSpec(String type, boolean supportsMedia, List<String> superTypes, String restPath) {}
    public record SubscriptionSpec(String type, boolean supportsMedia, List<String> superTypes, String restPath) {}

    public static List<Object> all() {
        return List.of(
                new SubredditSpec("Subreddit", false, List.of(), "/api/subreddits"),
                new ContentSpec("Content", true, List.of(), "/api/contents"),
                new PostSpec("Post", true, List.of("Content"), "/api/posts"),
                new CommentSpec("Comment", true, List.of("Content"), "/api/comments"),
                new MediaAttachmentSpec("MediaAttachment", true, List.of(), "/api/mediaAttachments"),
                new CommunityRuleSpec("CommunityRule", false, List.of(), "/api/communityRules"),
                new ParticipationPolicySpec("ParticipationPolicy", false, List.of(), "/api/participationPolicys"),
                new ContentValidationRuleSpec("ContentValidationRule", false, List.of(), "/api/contentValidationRules"),
                new PostModerationCheckSpec("PostModerationCheck", false, List.of(), "/api/postModerationChecks"),
                new CommentModerationCheckSpec("CommentModerationCheck", false, List.of(), "/api/commentModerationChecks"),
                new VoteSpec("Vote", false, List.of(), "/api/votes"),
                new ReportSpec("Report", false, List.of(), "/api/reports"),
                new SubscriptionSpec("Subscription", false, List.of(), "/api/subscriptions")        );
    }
}
