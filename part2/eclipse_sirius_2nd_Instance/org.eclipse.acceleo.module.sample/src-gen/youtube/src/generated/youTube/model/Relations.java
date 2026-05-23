package generated.youTube.model;

import java.util.List;

public final class Relations {
private Relations() {
}

public record RelationSpec(String name, String sourceCardinality, String targetCardinality, boolean containment, boolean recursive, String source, String target) {}

public static List<RelationSpec> all() {
return List.of(
new RelationSpec("channelContainsVideo", "1", "*", true, false, "Channel", "Video")
,new RelationSpec("videoHasComments", "1", "*", true, false, "Video", "Comment")
,new RelationSpec("commentRepliesToComment", "0..1", "*", false, true, "Comment", "Comment")
,new RelationSpec("videoCheckedByModerationCheck", "1", "*", true, false, "Video", "VideoModerationCheck")
,new RelationSpec("commentCheckedByModerationCheck", "1", "*", true, false, "Comment", "CommentModerationCheck")
,new RelationSpec("commentSettingsChangeOnVideo", "*", "1", false, false, "CommentSettingsChange", "Video")
,new RelationSpec("likeOnContent", "*", "1", false, false, "Like", "Content")
,new RelationSpec("reportOnContent", "*", "1", false, false, "Report", "Content")
,new RelationSpec("subscriptionOnChannel", "*", "1", false, false, "Subscription", "Channel")
,new RelationSpec("channelHasPermissionPolicy", "*", "1", false, false, "ChannelPermissionPolicy", "Channel")
,new RelationSpec("videoValidatedBy", "1", "*", true, false, "Video", "ContentValidationRule")
,new RelationSpec("commentValidatedBy", "1", "*", true, false, "Comment", "ContentValidationRule")
,new RelationSpec("likeHistoryOnContent", "*", "1", false, false, "LikeHistory", "Content")
);
}
}
