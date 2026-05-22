package generated.reddit.runtime;

public final class RuleBodies {

    private RuleBodies() {
    }

    public static final String POSTCONTENTPOLICYCHECK_EXPRESSION = """
Validate post content against subreddit rules, keyword screens, and platform-level moderation heuristics.
    """;

    public static final String POSTCONTENTPOLICYCHECK_IMPLEMENTATION = """
impl: let body = lower(coalesce(attr_post_body,'')); let title = lower(coalesce(attr_post_title,'')); let risky = containsAny(title + ' ' + body, ['spam','offensive','banned-link']); if risky then create PostModerationCheck(type='POLICY', result='FLAGGED', timestamp=now()); set post.status='UNDER_REVIEW'; notify moderator with subreddit id, post id, and matched terms; return WARNING; else return OK; end
    """;

    public static final String COMMENTCONTENTPOLICYCHECK_EXPRESSION = """
Validate comment content against subreddit rules and abusive-language moderation patterns.
    """;

    public static final String COMMENTCONTENTPOLICYCHECK_IMPLEMENTATION = """
impl: let body = lower(trim(attr_comment_body)); let risky = containsAny(body, ['spam','offensive','abuse']); if risky then create CommentModerationCheck(type='POLICY', result='FLAGGED', timestamp=now()); set comment.status='UNDER_REVIEW'; notify moderator with comment id and matched terms; return WARNING; else return OK; end
    """;

    public static final String REPORTTHRESHOLDESCALATION_EXPRESSION = """
Validate whether report volume crossed the moderation threshold and the content must be hidden pending review.
    """;

    public static final String REPORTTHRESHOLDESCALATION_IMPLEMENTATION = """
impl: if hasFlag('report-threshold-reached') then set content.visibility='HIDDEN'; create threshold escalation record; notify moderator queue with report summary; return ERROR; else return OK; end
    """;

    public static final String AUTOPOSTCONTENTSCREENING_FLAGPOST_BODY = """
impl: set post.status='UNDER_REVIEW'; create PostModerationCheck(type='POLICY', result='FLAGGED', timestamp=now()); keep post visible only to moderators until review completes.
    """;

    public static final String AUTOPOSTCONTENTSCREENING_NOTIFYPOSTMODERATOR_BODY = """
impl: send moderation event with subreddit id, post id, title, body excerpt, author id, and matched policy keywords.
    """;

    public static final String AUTOCOMMENTCONTENTSCREENING_FLAGCOMMENT_BODY = """
impl: set comment.status='UNDER_REVIEW'; create CommentModerationCheck(type='POLICY', result='FLAGGED', timestamp=now()); collapse comment for regular users until moderator decision.
    """;

    public static final String AUTOCOMMENTCONTENTSCREENING_NOTIFYCOMMENTMODERATOR_BODY = """
impl: send moderator notification with subreddit id, comment id, parent target, author id, and matched rule keywords.
    """;

    public static final String AUTOREPORTTHRESHOLDESCALATION_HIDEREPORTEDCONTENT_BODY = """
impl: set content.visibility='HIDDEN'; remove item from ranking pipelines; persist audit record explaining threshold-based hide action.
    """;

    public static final String AUTOREPORTTHRESHOLDESCALATION_NOTIFYTHRESHOLDMODERATOR_BODY = """
impl: send escalation packet with content id, subreddit id, report count, recent reports, and audit trail reference.
    """;

}
