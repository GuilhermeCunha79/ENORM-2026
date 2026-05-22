package generated.reddit.governance;

import java.util.List;

public final class RedditGovernance {

    public record AuthorizationSpec(
        String name,
        String allowedAction,
        String actor,
        String context,
        String resourceTarget,
        String feedbackTarget
    ) {}

    public record ValidationSpec(
        String name,
        String kind,
        String severity,
        String expression,
        String implementationBody,
        String appliesToResource,
        String appliesToFeedback,
        String invokedBy
    ) {}

    public record ModerationPolicySpec(
        String name,
        String mode,
        String trigger,
        String decision,
        String monitorsResource,
        String monitorsFeedback,
        List<String> executedBy,
        String inContext
    ) {}

    public record ConditionSpec(
        String name,
        String operator,
        String attribute,
        List<String> values
    ) {}

    public record ActionSpec(
        String name,
        String kind,
        String implementationBody
    ) {}

    public record AutomationSpec(
        String name,
        String trigger,
        String contextResource,
        String inContext,
        String onFeedback,
        String usesValidation,
        List<ConditionSpec> conditions,
        List<ActionSpec> actions
    ) {}

    public record VerificationPolicySpec(
        String name,
        String mode,
        String appliesWhen,
        String verifies
    ) {}

    public record SortingPolicySpec(
        String name,
        String criterion,
        String direction,
        String appliesToResource,
        String appliesToFeedback,
        String inContext
    ) {}

    public List<AuthorizationSpec> authorizations() {
        return List.of(
new AuthorizationSpec(
                "UserReadSubreddit",
                "READ",
                "User",
                "SubredditCommunity",
                "Subreddit",
                null
            ),
            new AuthorizationSpec(
                "UserCreateCommentOnPost",
                "COMMENT",
                "User",
                "ContentChannel",
                "Post",
                "CommentOnPost"
            ),
            new AuthorizationSpec(
                "UserReplyToComment",
                "COMMENT",
                "User",
                "ContentChannel",
                "Comment",
                "ReplyToComment"
            ),
            new AuthorizationSpec(
                "UserVoteContent",
                "VOTE",
                "User",
                "ContentChannel",
                "Content",
                "VoteOnContent"
            ),
            new AuthorizationSpec(
                "UserReportContent",
                "REPORT",
                "User",
                "ContentChannel",
                "Content",
                "ReportContent"
            ),
            new AuthorizationSpec(
                "UserSubscribeSubreddit",
                "SUBSCRIBE",
                "User",
                "SubredditCommunity",
                "Subreddit",
                "SubscribeToSubreddit"
            ),
            new AuthorizationSpec(
                "ModeratorModeratePost",
                "MODERATE",
                "Moderator",
                "RedditPlatform",
                "Post",
                null
            ),
            new AuthorizationSpec(
                "ModeratorModerateComment",
                "MODERATE",
                "Moderator",
                "RedditPlatform",
                "Comment",
                null
            ),
            new AuthorizationSpec(
                "ModeratorValidateContent",
                "VALIDATE",
                "Moderator",
                "RedditPlatform",
                "Content",
                null
            )        );
    }

    public List<ValidationSpec> validations() {
        return List.of(
new ValidationSpec(
                "PostContentPolicyCheck",
                "AUTOMATIC",
                "WARNING",
                """
Validate post content against subreddit rules, keyword screens, and platform-level moderation heuristics.
                """,
                """
impl: let body = lower(coalesce(attr_post_body,'')); let title = lower(coalesce(attr_post_title,'')); let risky = containsAny(title + ' ' + body, ['spam','offensive','banned-link']); if risky then create PostModerationCheck(type='POLICY', result='FLAGGED', timestamp=now()); set post.status='UNDER_REVIEW'; notify moderator with subreddit id, post id, and matched terms; return WARNING; else return OK; end
                """,
                "Post",
                null,
                "AutoPostContentScreening"
            ),
            new ValidationSpec(
                "CommentContentPolicyCheck",
                "AUTOMATIC",
                "WARNING",
                """
Validate comment content against subreddit rules and abusive-language moderation patterns.
                """,
                """
impl: let body = lower(trim(attr_comment_body)); let risky = containsAny(body, ['spam','offensive','abuse']); if risky then create CommentModerationCheck(type='POLICY', result='FLAGGED', timestamp=now()); set comment.status='UNDER_REVIEW'; notify moderator with comment id and matched terms; return WARNING; else return OK; end
                """,
                "Comment",
                null,
                "AutoCommentContentScreening"
            ),
            new ValidationSpec(
                "ReportThresholdEscalation",
                "AUTOMATIC",
                "ERROR",
                """
Validate whether report volume crossed the moderation threshold and the content must be hidden pending review.
                """,
                """
impl: if hasFlag('report-threshold-reached') then set content.visibility='HIDDEN'; create threshold escalation record; notify moderator queue with report summary; return ERROR; else return OK; end
                """,
                null,
                "ReportContent",
                "AutoReportThresholdEscalation"
            )        );
    }

    public List<ModerationPolicySpec> moderationPolicies() {
        return List.of(
new ModerationPolicySpec(
                "PostModerationPolicy",
                "HYBRID",
                "ON_RESOURCE_CREATE",
                "FLAGGED",
                "Post",
                null,
                List.of("Moderator"),
                "RedditPlatform"
            ),
            new ModerationPolicySpec(
                "CommentModerationPolicy",
                "HYBRID",
                "ON_RESOURCE_CREATE",
                "FLAGGED",
                "Comment",
                null,
                List.of("Moderator"),
                "RedditPlatform"
            ),
            new ModerationPolicySpec(
                "ReportModerationPolicy",
                "MANUAL",
                "ON_REPORT_THRESHOLD",
                "HIDDEN",
                "Content",
                "ReportContent",
                List.of("Moderator"),
                "RedditPlatform"
            )        );
    }

    public List<AutomationSpec> automations() {
        return List.of(
new AutomationSpec(
                "AutoPostContentScreening",
                "ON_RESOURCE_CREATE",
                "Post",
                "ContentChannel",
                "CommentOnPost",
                "PostContentPolicyCheck",
                List.of(
new ConditionSpec(
                        "PostBodyPresent",
                        "HAS_PROPERTY",
                        "body",
                        List.of("body")
                    ),
                    new ConditionSpec(
                        "PostContainsRiskKeywords",
                        "CONTAINS_KEYWORDS",
                        "body",
                        List.of("spam", "offensive", "banned-link")
                    )                ),
                List.of(
new ActionSpec(
                        "FlagPost",
                        "FLAG_CONTENT",
                        """
impl: set post.status='UNDER_REVIEW'; create PostModerationCheck(type='POLICY', result='FLAGGED', timestamp=now()); keep post visible only to moderators until review completes.
                        """
                    ),
                    new ActionSpec(
                        "NotifyPostModerator",
                        "NOTIFY_MODERATOR",
                        """
impl: send moderation event with subreddit id, post id, title, body excerpt, author id, and matched policy keywords.
                        """
                    )                )
            ),
            new AutomationSpec(
                "AutoCommentContentScreening",
                "ON_RESOURCE_CREATE",
                "Comment",
                "ContentChannel",
                "CommentOnPost",
                "CommentContentPolicyCheck",
                List.of(
new ConditionSpec(
                        "CommentBodyPresent",
                        "HAS_PROPERTY",
                        "body",
                        List.of("body")
                    ),
                    new ConditionSpec(
                        "CommentContainsRiskKeywords",
                        "CONTAINS_KEYWORDS",
                        "body",
                        List.of("spam", "offensive", "abuse")
                    )                ),
                List.of(
new ActionSpec(
                        "FlagComment",
                        "FLAG_CONTENT",
                        """
impl: set comment.status='UNDER_REVIEW'; create CommentModerationCheck(type='POLICY', result='FLAGGED', timestamp=now()); collapse comment for regular users until moderator decision.
                        """
                    ),
                    new ActionSpec(
                        "NotifyCommentModerator",
                        "NOTIFY_MODERATOR",
                        """
impl: send moderator notification with subreddit id, comment id, parent target, author id, and matched rule keywords.
                        """
                    )                )
            ),
            new AutomationSpec(
                "AutoReportThresholdEscalation",
                "ON_REPORT_THRESHOLD",
                "Content",
                "RedditPlatform",
                "ReportContent",
                "ReportThresholdEscalation",
                List.of(
new ConditionSpec(
                        "ReportThresholdMet",
                        "HAS_SPECIFIC_PROPERTY",
                        "id",
                        List.of("report-threshold-reached")
                    )                ),
                List.of(
new ActionSpec(
                        "HideReportedContent",
                        "HIDE_CONTENT",
                        """
impl: set content.visibility='HIDDEN'; remove item from ranking pipelines; persist audit record explaining threshold-based hide action.
                        """
                    ),
                    new ActionSpec(
                        "NotifyThresholdModerator",
                        "NOTIFY_MODERATOR",
                        """
impl: send escalation packet with content id, subreddit id, report count, recent reports, and audit trail reference.
                        """
                    )                )
            )        );
    }

    public List<VerificationPolicySpec> verificationPolicies() {
        return List.of(
new VerificationPolicySpec(
                "ModeratorReviewReports",
                "MANUAL",
                "ON_REPORT_SUBMITTED",
                "ReportContent"
            )        );
    }

    public List<SortingPolicySpec> sortingPolicies() {
        return List.of(
new SortingPolicySpec(
                "PostsNewestFirst",
                "DATE",
                "DESC",
                "Post",
                null,
                "SubredditCommunity"
            ),
            new SortingPolicySpec(
                "ContentByRelevance",
                "RELEVANCE",
                "DESC",
                "Content",
                null,
                "ContentChannel"
            ),
            new SortingPolicySpec(
                "ContentByScore",
                "VALUE",
                "DESC",
                "Content",
                null,
                "RedditPlatform"
            )        );
    }
}
