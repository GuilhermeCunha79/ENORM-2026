package generated.reddit.model;

import java.util.List;

public final class Contexts {

    private Contexts() {
    }

    public record ContextSpec(String name, String kind, List<String> contains) {}

    public static List<ContextSpec> all() {
        return List.of(
new ContextSpec(
                "SubredditCommunity",
                "COMMUNITY",
                List.of("Subreddit", "Post", "Comment", "MediaAttachment", "CommunityRule", "ParticipationPolicy", "ContentValidationRule")
            ),
            new ContextSpec(
                "ContentChannel",
                "CHANNEL",
                List.of("Post", "Comment", "MediaAttachment", "PostModerationCheck", "CommentModerationCheck")
            ),
            new ContextSpec(
                "RedditPlatform",
                "GLOBAL",
                List.of("Subreddit", "Post", "Comment", "ParticipationPolicy", "ContentValidationRule", "PostModerationCheck", "CommentModerationCheck")
            )        );
    }
}
