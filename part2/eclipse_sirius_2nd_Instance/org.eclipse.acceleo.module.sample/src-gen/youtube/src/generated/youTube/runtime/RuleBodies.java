package generated.youTube.runtime;

public final class RuleBodies {
private RuleBodies() {
}

public static final String VIDEOCOPYRIGHTVALIDATION_EXPRESSION = "Validate uploaded video metadata for copyright-risk indicators before publication.";
public static final String VIDEOCOPYRIGHTVALIDATION_IMPLEMENTATION = "impl: let desc = lower(coalesce(attr_video_description,'')); let title = lower(coalesce(attr_video_title,'')); let risky = containsAny(desc + ' ' + title, ['copyright','reupload','unlicensed']); if risky then create VideoModerationCheck(type='COPYRIGHT', result='FLAGGED', timestamp=now()); set video.status='UNDER_REVIEW'; notify moderator with video id and matched terms; return ERROR; else set video.status='READY'; return OK; end";
public static final String VIDEOCOMMUNITYGUIDELINESVALIDATION_EXPRESSION = "Validate video lifecycle fields and status transitions against platform community-guidelines rules.";
public static final String VIDEOCOMMUNITYGUIDELINESVALIDATION_IMPLEMENTATION = "impl: require attr_content_status; if matches(attr_content_status,'REMOVED') then return WARNING; end; if trim(coalesce(attr_video_description,'')) = '' then emit creator warning 'Description should be present'; end; if attr_video_comment_status not in ['OPEN','HELD','DISABLED'] then set video.status='UNDER_REVIEW'; notify moderator; end; return OK";
public static final String COMMENTPOLICYVALIDATION_EXPRESSION = "Validate comment text against spam, toxicity, and blocked-term moderation rules.";
public static final String COMMENTPOLICYVALIDATION_IMPLEMENTATION = "impl: let text = lower(trim(attr_comment_text)); let risky = containsAny(text, ['spam','toxicity','blocked-word']); if risky then create CommentModerationCheck(type='POLICY', result='FLAGGED', timestamp=now()); set comment.status='UNDER_REVIEW'; notify moderator with comment id and matched terms; return WARNING; else return OK; end";
public static final String REPORTTHRESHOLDVALIDATION_EXPRESSION = "Validate whether reported content reached the moderation threshold and must be escalated immediately.";
public static final String REPORTTHRESHOLDVALIDATION_IMPLEMENTATION = "impl: if attr_content_status = 'UNDER_REVIEW' then hide content; create moderation escalation record; notify moderator queue; return ERROR; else return OK; end";
public static final String AUTOVIDEOCOPYRIGHTCHECK_FLAGVIDEO_BODY = "impl: set video.status='UNDER_REVIEW'; create VideoModerationCheck(type='COPYRIGHT', result='FLAGGED', timestamp=now()); attach moderation reason to video state.";
public static final String AUTOVIDEOCOPYRIGHTCHECK_NOTIFYMODERATORABOUTVIDEO_BODY = "impl: send moderation notification with channel id, video id, title, description excerpt, and matched copyright-risk keywords.";
public static final String AUTOVIDEOGUIDELINESCHECK_WARNCREATOR_BODY = "impl: display creator warning when description is missing, status transition is invalid, or comment settings conflict with platform rules.";
public static final String AUTOCOMMENTMODERATIONCHECK_FLAGCOMMENT_BODY = "impl: set comment.status='UNDER_REVIEW'; create CommentModerationCheck(type='POLICY', result='FLAGGED', timestamp=now()); keep comment hidden until moderator decision.";
public static final String AUTOCOMMENTMODERATIONCHECK_NOTIFYMODERATORABOUTCOMMENT_BODY = "impl: publish moderator event with comment id, video id, author id, normalized text, and policy terms that triggered the check.";
public static final String AUTOREPORTESCALATION_HIDEREPORTEDCONTENT_BODY = "impl: set content.visibility='HIDDEN'; persist escalation record; freeze recommendation exposure until moderator resolution.";
public static final String AUTOREPORTESCALATION_NOTIFYMODERATORABOUTREPORTEDCONTENT_BODY = "impl: send escalation packet containing content id, report count, threshold rule, last status, and moderation history summary.";
}
