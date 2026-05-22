package generated.reddit.model;

import java.util.List;

public final class Relations {

    private Relations() {
    }

    public record RelationSpec(
        String name,
        String sourceCardinality,
        String targetCardinality,
        boolean containment,
        boolean recursive,
        String source,
        String target
    ) {}

    public static List<RelationSpec> all() {
        return List.of(
new RelationSpec(
                "subredditContainsPosts",
                "1",
                "*",
                true,
                false,
                "Subreddit",
                "Post"
            ),
            new RelationSpec(
                "subredditHasCommunityRules",
                "1",
                "*",
                true,
                false,
                "Subreddit",
                "CommunityRule"
            ),
            new RelationSpec(
                "subredditEnforcesParticipationPolicies",
                "1",
                "*",
                true,
                false,
                "Subreddit",
                "ParticipationPolicy"
            ),
            new RelationSpec(
                "subredditValidatesContent",
                "1",
                "*",
                true,
                false,
                "Subreddit",
                "ContentValidationRule"
            ),
            new RelationSpec(
                "commentOnPost",
                "*",
                "1",
                false,
                false,
                "Comment",
                "Post"
            ),
            new RelationSpec(
                "commentRepliesToComment",
                "0..1",
                "*",
                false,
                true,
                "Comment",
                "Comment"
            ),
            new RelationSpec(
                "commentHasMediaAttachments",
                "1",
                "*",
                true,
                false,
                "Comment",
                "MediaAttachment"
            ),
            new RelationSpec(
                "postCheckedByModerationCheck",
                "1",
                "*",
                true,
                false,
                "Post",
                "PostModerationCheck"
            ),
            new RelationSpec(
                "commentCheckedByModerationCheck",
                "1",
                "*",
                true,
                false,
                "Comment",
                "CommentModerationCheck"
            )        );
    }
}
