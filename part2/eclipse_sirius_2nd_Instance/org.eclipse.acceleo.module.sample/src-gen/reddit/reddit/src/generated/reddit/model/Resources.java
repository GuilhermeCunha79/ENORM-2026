package generated.reddit.model;

public final class Resources {

    private Resources() {
    }

    public static final class Subreddit {

        public static final String TYPE = "Subreddit";
        public static final boolean SUPPORTS_MEDIA = false;

        private String id;
        private String name;
        private String description;

        public Subreddit() {
        }

        public String getId() {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return this.description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

    }

    public static final class Content {

        public static final String TYPE = "Content";
        public static final boolean SUPPORTS_MEDIA = true;

        private String id;
        private java.time.LocalDate creationDate;

        public Content() {
        }

        public String getId() {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public java.time.LocalDate getCreationDate() {
            return this.creationDate;
        }

        public void setCreationDate(java.time.LocalDate creationDate) {
            this.creationDate = creationDate;
        }

    }

    public static final class Post {

        public static final String TYPE = "Post";
        public static final boolean SUPPORTS_MEDIA = true;
        public static final java.util.List<String> SUPER_TYPES = java.util.List.of("Content");

        private String title;
        private String body;
        private String type;
        private Boolean supportsVote;
        private Boolean supportsReport;

        public Post() {
        }

        public String getTitle() {
            return this.title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getBody() {
            return this.body;
        }

        public void setBody(String body) {
            this.body = body;
        }

        public String getType() {
            return this.type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Boolean getSupportsVote() {
            return this.supportsVote;
        }

        public void setSupportsVote(Boolean supportsVote) {
            this.supportsVote = supportsVote;
        }

        public Boolean getSupportsReport() {
            return this.supportsReport;
        }

        public void setSupportsReport(Boolean supportsReport) {
            this.supportsReport = supportsReport;
        }

    }

    public static final class Comment {

        public static final String TYPE = "Comment";
        public static final boolean SUPPORTS_MEDIA = true;
        public static final java.util.List<String> SUPER_TYPES = java.util.List.of("Content");

        private String body;
        private Boolean supportsVote;
        private Boolean supportsReport;

        public Comment() {
        }

        public String getBody() {
            return this.body;
        }

        public void setBody(String body) {
            this.body = body;
        }

        public Boolean getSupportsVote() {
            return this.supportsVote;
        }

        public void setSupportsVote(Boolean supportsVote) {
            this.supportsVote = supportsVote;
        }

        public Boolean getSupportsReport() {
            return this.supportsReport;
        }

        public void setSupportsReport(Boolean supportsReport) {
            this.supportsReport = supportsReport;
        }

    }

    public static final class MediaAttachment {

        public static final String TYPE = "MediaAttachment";
        public static final boolean SUPPORTS_MEDIA = true;

        private String id;
        private String type;
        private java.net.URI url;

        public MediaAttachment() {
        }

        public String getId() {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getType() {
            return this.type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public java.net.URI getUrl() {
            return this.url;
        }

        public void setUrl(java.net.URI url) {
            this.url = url;
        }

    }

    public static final class CommunityRule {

        public static final String TYPE = "CommunityRule";
        public static final boolean SUPPORTS_MEDIA = false;

        private String id;
        private String title;
        private String description;

        public CommunityRule() {
        }

        public String getId() {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return this.title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return this.description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

    }

    public static final class ParticipationPolicy {

        public static final String TYPE = "ParticipationPolicy";
        public static final boolean SUPPORTS_MEDIA = false;

        private String id;
        private String action;
        private String allowedWhen;

        public ParticipationPolicy() {
        }

        public String getId() {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getAction() {
            return this.action;
        }

        public void setAction(String action) {
            this.action = action;
        }

        public String getAllowedWhen() {
            return this.allowedWhen;
        }

        public void setAllowedWhen(String allowedWhen) {
            this.allowedWhen = allowedWhen;
        }

    }

    public static final class ContentValidationRule {

        public static final String TYPE = "ContentValidationRule";
        public static final boolean SUPPORTS_MEDIA = false;

        private String id;
        private String target;
        private String severity;
        private String condition;

        public ContentValidationRule() {
        }

        public String getId() {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTarget() {
            return this.target;
        }

        public void setTarget(String target) {
            this.target = target;
        }

        public String getSeverity() {
            return this.severity;
        }

        public void setSeverity(String severity) {
            this.severity = severity;
        }

        public String getCondition() {
            return this.condition;
        }

        public void setCondition(String condition) {
            this.condition = condition;
        }

    }

    public static final class PostModerationCheck {

        public static final String TYPE = "PostModerationCheck";
        public static final boolean SUPPORTS_MEDIA = false;

        private String id;
        private String type;
        private String result;
        private java.time.LocalDate timestamp;

        public PostModerationCheck() {
        }

        public String getId() {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getType() {
            return this.type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getResult() {
            return this.result;
        }

        public void setResult(String result) {
            this.result = result;
        }

        public java.time.LocalDate getTimestamp() {
            return this.timestamp;
        }

        public void setTimestamp(java.time.LocalDate timestamp) {
            this.timestamp = timestamp;
        }

    }

    public static final class CommentModerationCheck {

        public static final String TYPE = "CommentModerationCheck";
        public static final boolean SUPPORTS_MEDIA = false;

        private String id;
        private String type;
        private String result;
        private java.time.LocalDate timestamp;

        public CommentModerationCheck() {
        }

        public String getId() {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getType() {
            return this.type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getResult() {
            return this.result;
        }

        public void setResult(String result) {
            this.result = result;
        }

        public java.time.LocalDate getTimestamp() {
            return this.timestamp;
        }

        public void setTimestamp(java.time.LocalDate timestamp) {
            this.timestamp = timestamp;
        }

    }

}
