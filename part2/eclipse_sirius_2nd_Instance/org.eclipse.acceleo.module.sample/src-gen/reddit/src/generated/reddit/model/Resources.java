package generated.reddit.model;

import java.util.List;

public final class Resources {
private Resources() {
}

public static final class Subreddit {
public static final String TYPE = "Subreddit";
public static final boolean SUPPORTS_MEDIA = false;
private String id;
private String name;
private String description;
}
public static final class Content {
public static final String TYPE = "Content";
public static final boolean SUPPORTS_MEDIA = true;
private String id;
private LocalDate creationDate;
}
public static final class Post {
public static final String TYPE = "Post";
public static final boolean SUPPORTS_MEDIA = true;
public static final List<String> SUPER_TYPES = List.of("Content");
private String title;
private String body;
private String type;
private Boolean supportsVote;
private Boolean supportsReport;
}
public static final class Comment {
public static final String TYPE = "Comment";
public static final boolean SUPPORTS_MEDIA = true;
public static final List<String> SUPER_TYPES = List.of("Content");
private String body;
private Boolean supportsVote;
private Boolean supportsReport;
}
public static final class MediaAttachment {
public static final String TYPE = "MediaAttachment";
public static final boolean SUPPORTS_MEDIA = true;
private String id;
private String type;
private URI url;
}
public static final class CommunityRule {
public static final String TYPE = "CommunityRule";
public static final boolean SUPPORTS_MEDIA = false;
private String id;
private String title;
private String description;
}
public static final class ParticipationPolicy {
public static final String TYPE = "ParticipationPolicy";
public static final boolean SUPPORTS_MEDIA = false;
private String id;
private String action;
private String allowedWhen;
}
public static final class ContentValidationRule {
public static final String TYPE = "ContentValidationRule";
public static final boolean SUPPORTS_MEDIA = false;
private String id;
private String target;
private String severity;
private String condition;
}
public static final class PostModerationCheck {
public static final String TYPE = "PostModerationCheck";
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
public static final class Vote {
public static final String TYPE = "Vote";
public static final boolean SUPPORTS_MEDIA = false;
private String id;
private String value;
private LocalDateTime timestamp;
}
public static final class Report {
public static final String TYPE = "Report";
public static final boolean SUPPORTS_MEDIA = false;
private String id;
private String reason;
private String status;
private LocalDateTime timestamp;
}
public static final class Subscription {
public static final String TYPE = "Subscription";
public static final boolean SUPPORTS_MEDIA = false;
private String id;
private LocalDate date;
}
}
