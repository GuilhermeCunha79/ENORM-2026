package generated.youTube.model;

import java.util.List;

public final class Resources {
    private Resources() {
    }

    public record ChannelSpec(String type, boolean supportsMedia, List<String> superTypes, String restPath) {}
    public record ContentSpec(String type, boolean supportsMedia, List<String> superTypes, String restPath) {}
    public record VideoSpec(String type, boolean supportsMedia, List<String> superTypes, String restPath) {}
    public record CommentSpec(String type, boolean supportsMedia, List<String> superTypes, String restPath) {}
    public record LikeSpec(String type, boolean supportsMedia, List<String> superTypes, String restPath) {}
    public record LikeHistorySpec(String type, boolean supportsMedia, List<String> superTypes, String restPath) {}
    public record ReportSpec(String type, boolean supportsMedia, List<String> superTypes, String restPath) {}
    public record SubscriptionSpec(String type, boolean supportsMedia, List<String> superTypes, String restPath) {}
    public record ChannelPermissionPolicySpec(String type, boolean supportsMedia, List<String> superTypes, String restPath) {}
    public record ContentValidationRuleSpec(String type, boolean supportsMedia, List<String> superTypes, String restPath) {}
    public record VideoModerationCheckSpec(String type, boolean supportsMedia, List<String> superTypes, String restPath) {}
    public record CommentModerationCheckSpec(String type, boolean supportsMedia, List<String> superTypes, String restPath) {}
    public record CommentSettingsChangeSpec(String type, boolean supportsMedia, List<String> superTypes, String restPath) {}

    public static List<Object> all() {
        return List.of(
                new ChannelSpec("Channel", true, List.of(), "/api/channels"),
                new ContentSpec("Content", true, List.of(), "/api/contents"),
                new VideoSpec("Video", true, List.of("Content"), "/api/videos"),
                new CommentSpec("Comment", false, List.of("Content"), "/api/comments"),
                new LikeSpec("Like", false, List.of(), "/api/likes"),
                new LikeHistorySpec("LikeHistory", false, List.of(), "/api/likeHistorys"),
                new ReportSpec("Report", false, List.of(), "/api/reports"),
                new SubscriptionSpec("Subscription", false, List.of(), "/api/subscriptions"),
                new ChannelPermissionPolicySpec("ChannelPermissionPolicy", false, List.of(), "/api/channelPermissionPolicys"),
                new ContentValidationRuleSpec("ContentValidationRule", false, List.of(), "/api/contentValidationRules"),
                new VideoModerationCheckSpec("VideoModerationCheck", false, List.of(), "/api/videoModerationChecks"),
                new CommentModerationCheckSpec("CommentModerationCheck", false, List.of(), "/api/commentModerationChecks"),
                new CommentSettingsChangeSpec("CommentSettingsChange", false, List.of(), "/api/commentSettingsChanges")        );
    }
}
