package generated.youTube.model;

import java.util.List;

public final class Resources {
private Resources() {
}

public static final class Channel {
public static final String TYPE = "Channel";
public static final boolean SUPPORTS_MEDIA = true;
private String id;
private String name;
private String description;
private LocalDate creationDate;
}
public static final class Content {
public static final String TYPE = "Content";
public static final boolean SUPPORTS_MEDIA = true;
private String id;
private LocalDate creationDate;
private String status;
}
public static final class Video {
public static final String TYPE = "Video";
public static final boolean SUPPORTS_MEDIA = true;
public static final List<String> SUPER_TYPES = List.of("Content");
private String title;
private String description;
private LocalDate uploadDate;
private Double duration;
private String commentStatus;
}
public static final class Comment {
public static final String TYPE = "Comment";
public static final boolean SUPPORTS_MEDIA = false;
public static final List<String> SUPER_TYPES = List.of("Content");
private String text;
}
public static final class Like {
public static final String TYPE = "Like";
public static final boolean SUPPORTS_MEDIA = false;
private String id;
private String value;
private LocalDate timestamp;
}
public static final class LikeHistory {
public static final String TYPE = "LikeHistory";
public static final boolean SUPPORTS_MEDIA = false;
private String id;
private String action;
private LocalDate timestamp;
}
public static final class Report {
public static final String TYPE = "Report";
public static final boolean SUPPORTS_MEDIA = false;
private String id;
private String reason;
private String status;
private LocalDate timestamp;
}
public static final class Subscription {
public static final String TYPE = "Subscription";
public static final boolean SUPPORTS_MEDIA = false;
private String id;
private LocalDate date;
}
public static final class ChannelPermissionPolicy {
public static final String TYPE = "ChannelPermissionPolicy";
public static final boolean SUPPORTS_MEDIA = false;
private String id;
private String action;
private String allowedFor;
}
public static final class ContentValidationRule {
public static final String TYPE = "ContentValidationRule";
public static final boolean SUPPORTS_MEDIA = false;
private String id;
private String target;
private String policyType;
private String severity;
}
public static final class VideoModerationCheck {
public static final String TYPE = "VideoModerationCheck";
public static final boolean SUPPORTS_MEDIA = false;
private String id;
private String type;
private String result;
private LocalDate timestamp;
}
public static final class CommentModerationCheck {
public static final String TYPE = "CommentModerationCheck";
public static final boolean SUPPORTS_MEDIA = false;
private String id;
private String type;
private String result;
private LocalDate timestamp;
}
public static final class CommentSettingsChange {
public static final String TYPE = "CommentSettingsChange";
public static final boolean SUPPORTS_MEDIA = false;
private String id;
private String newStatus;
private LocalDate timestamp;
}
}
