package generated.youTube.model;

import java.util.List;

public final class Contexts {
private Contexts() {
}

public record ContextSpec(String name, String kind, List<String> contains) {}

public static List<ContextSpec> all() {
return List.of(
new ContextSpec("ChannelSpace", "CHANNEL", List.of("Channel", "Video", "Comment", "Like", "LikeHistory", "CommentSettingsChange", "Subscription", "ChannelPermissionPolicy"))
,new ContextSpec("PlatformGlobal", "GLOBAL", List.of("Channel", "Content", "Video", "Comment", "VideoModerationCheck", "CommentModerationCheck", "Report", "ContentValidationRule", "Like"))
,new ContextSpec("CreatorCommunity", "COMMUNITY", List.of("Channel", "Video", "Comment", "Subscription"))
);
}
}
