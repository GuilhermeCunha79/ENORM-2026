package generated.youTube.governance;

import java.util.List;

public final class YouTubeGovernance {
    private YouTubeGovernance() {
    }

    public record AuthorizationSpec(String name, String action, String actor, String context, String resourceTarget, String feedbackTarget) {}
    public record ValidationSpec(String name, String kind, String severity, String appliesToResource, String appliesToFeedback) {}
    public record ModerationPolicySpec(String name, String mode, String trigger, String decision, String monitorsResource, String monitorsFeedback) {}
    public record VerificationPolicySpec(String name, String mode, String appliesWhen, String verifies) {}
    public record SortingPolicySpec(String name, String criterion, String direction, String appliesToResource, String appliesToFeedback, String inContext) {}

    public static List<AuthorizationSpec> authorizations() {
        return List.of(
                new AuthorizationSpec("UserReadChannel", "READ", "User", , "Channel", null),
                new AuthorizationSpec("CreatorCreateVideo", "CREATE", "Creator", , "Video", null),
                new AuthorizationSpec("CreatorUpdateVideo", "UPDATE", "Creator", , "Video", null),
                new AuthorizationSpec("UserCommentVideo", "COMMENT", "User", , "Video", "CommentOnVideo"),
                new AuthorizationSpec("UserReplyComment", "COMMENT", "User", , "Comment", "ReplyToComment"),
                new AuthorizationSpec("UserReactContent", "VOTE", "User", , "Content", "LikeOnContent"),
                new AuthorizationSpec("UserReportContent", "REPORT", "User", , "Content", "ReportContent"),
                new AuthorizationSpec("UserSubscribeChannel", "SUBSCRIBE", "User", , "Channel", "SubscribeToChannel"),
                new AuthorizationSpec("ModeratorModerateVideo", "MODERATE", "Moderator", , "Video", null),
                new AuthorizationSpec("ModeratorModerateComment", "MODERATE", "Moderator", , "Comment", null),
                new AuthorizationSpec("ModeratorValidateContent", "VALIDATE", "Moderator", , "Content", null)        );
    }

    public static List<ValidationSpec> validations() {
        return List.of(
                new ValidationSpec("VideoCopyrightValidation", "AUTOMATIC", "ERROR", "Video", null),
                new ValidationSpec("VideoCommunityGuidelinesValidation", "AUTOMATIC", "WARNING", "Video", null),
                new ValidationSpec("CommentPolicyValidation", "AUTOMATIC", "WARNING", null, "CommentOnVideo"),
                new ValidationSpec("ReportThresholdValidation", "AUTOMATIC", "ERROR", null, "ReportContent")        );
    }

    public static List<ModerationPolicySpec> moderationPolicies() {
        return List.of(
                new ModerationPolicySpec("VideoCreationModeration", "HYBRID", "ON_RESOURCE_CREATE", "FLAGGED", "Video", null),
                new ModerationPolicySpec("CommentCreationModeration", "HYBRID", "ON_FEEDBACK_CREATE", "FLAGGED", "Video", "CommentOnVideo"),
                new ModerationPolicySpec("ReportedContentModeration", "MANUAL", "ON_REPORT_THRESHOLD", "HIDDEN", "Content", "ReportContent")        );
    }

    public static List<VerificationPolicySpec> verificationPolicies() {
        return List.of(
                new VerificationPolicySpec("ReportReviewVerification", "MANUAL", "ON_REPORT_SUBMITTED", "ReportContent"),
                new VerificationPolicySpec("CommentModerationVerification", "AUTOMATIC", "ON_FEEDBACK_CREATE", "CommentOnVideo")        );
    }

    public static List<SortingPolicySpec> sortingPolicies() {
        return List.of(
                new SortingPolicySpec("ChannelLatestVideos", "DATE", "DESC", "Video", null, "ChannelSpace"),
                new SortingPolicySpec("ChannelRelevantContent", "RELEVANCE", "DESC", "Content", null, "ChannelSpace"),
                new SortingPolicySpec("GlobalHighValueContent", "VALUE", "DESC", "Content", null, "PlatformGlobal")        );
    }
}
