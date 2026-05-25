package generated.reddit.governance;

import java.util.List;

public final class RedditGovernance {
    private RedditGovernance() {
    }

    public record AuthorizationSpec(String name, String action, String actor, String context, String resourceTarget, String feedbackTarget) {}
    public record ValidationSpec(String name, String kind, String severity, String appliesToResource, String appliesToFeedback) {}
    public record ModerationPolicySpec(String name, String mode, String trigger, String decision, String monitorsResource, String monitorsFeedback) {}
    public record VerificationPolicySpec(String name, String mode, String appliesWhen, String verifies) {}
    public record SortingPolicySpec(String name, String criterion, String direction, String appliesToResource, String appliesToFeedback, String inContext) {}

    public static List<AuthorizationSpec> authorizations() {
        return List.of(
                new AuthorizationSpec("UserReadSubreddit", "READ", "User", , "Subreddit", null),
                new AuthorizationSpec("UserCreateCommentOnPost", "COMMENT", "User", , "Post", "CommentOnPost"),
                new AuthorizationSpec("UserReplyToComment", "COMMENT", "User", , "Comment", "ReplyToComment"),
                new AuthorizationSpec("UserVoteContent", "VOTE", "User", , "Content", "VoteOnContent"),
                new AuthorizationSpec("UserReportContent", "REPORT", "User", , "Content", "ReportContent"),
                new AuthorizationSpec("UserSubscribeSubreddit", "SUBSCRIBE", "User", , "Subreddit", "SubscribeToSubreddit"),
                new AuthorizationSpec("ModeratorModeratePost", "MODERATE", "Moderator", , "Post", null),
                new AuthorizationSpec("ModeratorModerateComment", "MODERATE", "Moderator", , "Comment", null),
                new AuthorizationSpec("ModeratorValidateContent", "VALIDATE", "Moderator", , "Content", null)        );
    }

    public static List<ValidationSpec> validations() {
        return List.of(
                new ValidationSpec("PostContentPolicyCheck", "AUTOMATIC", "WARNING", "Post", null),
                new ValidationSpec("CommentContentPolicyCheck", "AUTOMATIC", "WARNING", "Comment", null),
                new ValidationSpec("ReportThresholdEscalation", "AUTOMATIC", "ERROR", null, "ReportContent")        );
    }

    public static List<ModerationPolicySpec> moderationPolicies() {
        return List.of(
                new ModerationPolicySpec("PostModerationPolicy", "HYBRID", "ON_RESOURCE_CREATE", "FLAGGED", "Post", null),
                new ModerationPolicySpec("CommentModerationPolicy", "HYBRID", "ON_RESOURCE_CREATE", "FLAGGED", "Comment", null),
                new ModerationPolicySpec("ReportModerationPolicy", "MANUAL", "ON_REPORT_THRESHOLD", "HIDDEN", "Content", "ReportContent")        );
    }

    public static List<VerificationPolicySpec> verificationPolicies() {
        return List.of(
                new VerificationPolicySpec("ModeratorReviewReports", "MANUAL", "ON_REPORT_SUBMITTED", "ReportContent")        );
    }

    public static List<SortingPolicySpec> sortingPolicies() {
        return List.of(
                new SortingPolicySpec("PostsNewestFirst", "DATE", "DESC", "Post", null, "SubredditCommunity"),
                new SortingPolicySpec("ContentByRelevance", "RELEVANCE", "DESC", "Content", null, "ContentChannel"),
                new SortingPolicySpec("ContentByScore", "VALUE", "DESC", "Content", null, "RedditPlatform")        );
    }
}
