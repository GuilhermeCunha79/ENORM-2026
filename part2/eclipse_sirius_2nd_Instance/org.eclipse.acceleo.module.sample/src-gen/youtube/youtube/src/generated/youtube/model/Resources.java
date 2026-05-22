package generated.youtube.model;

public final class Resources {

    private Resources() {
    }

    public static final class Channel {

        public static final String TYPE = "Channel";
        public static final boolean SUPPORTS_MEDIA = true;

        private String id;
        private String name;
        private String description;
        private java.time.LocalDate creationDate;

        public Channel() {
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

        public java.time.LocalDate getCreationDate() {
            return this.creationDate;
        }

        public void setCreationDate(java.time.LocalDate creationDate) {
            this.creationDate = creationDate;
        }

    }

    public static final class Content {

        public static final String TYPE = "Content";
        public static final boolean SUPPORTS_MEDIA = true;

        private String id;
        private java.time.LocalDate creationDate;
        private String status;

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

        public String getStatus() {
            return this.status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

    }

    public static final class Video {

        public static final String TYPE = "Video";
        public static final boolean SUPPORTS_MEDIA = true;
        public static final java.util.List<String> SUPER_TYPES = java.util.List.of("Content");

        private String title;
        private String description;
        private java.time.LocalDate uploadDate;
        private Double duration;
        private String commentStatus;

        public Video() {
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

        public java.time.LocalDate getUploadDate() {
            return this.uploadDate;
        }

        public void setUploadDate(java.time.LocalDate uploadDate) {
            this.uploadDate = uploadDate;
        }

        public Double getDuration() {
            return this.duration;
        }

        public void setDuration(Double duration) {
            this.duration = duration;
        }

        public String getCommentStatus() {
            return this.commentStatus;
        }

        public void setCommentStatus(String commentStatus) {
            this.commentStatus = commentStatus;
        }

    }

    public static final class Comment {

        public static final String TYPE = "Comment";
        public static final boolean SUPPORTS_MEDIA = false;
        public static final java.util.List<String> SUPER_TYPES = java.util.List.of("Content");

        private String text;

        public Comment() {
        }

        public String getText() {
            return this.text;
        }

        public void setText(String text) {
            this.text = text;
        }

    }

    public static final class LikeHistory {

        public static final String TYPE = "LikeHistory";
        public static final boolean SUPPORTS_MEDIA = false;

        private String id;
        private String action;
        private java.time.LocalDate timestamp;

        public LikeHistory() {
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

        public java.time.LocalDate getTimestamp() {
            return this.timestamp;
        }

        public void setTimestamp(java.time.LocalDate timestamp) {
            this.timestamp = timestamp;
        }

    }

    public static final class VideoModerationCheck {

        public static final String TYPE = "VideoModerationCheck";
        public static final boolean SUPPORTS_MEDIA = false;

        private String id;
        private String type;
        private String result;
        private java.time.LocalDate timestamp;

        public VideoModerationCheck() {
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

    public static final class CommentSettingsChange {

        public static final String TYPE = "CommentSettingsChange";
        public static final boolean SUPPORTS_MEDIA = false;

        private String id;
        private String newStatus;
        private java.time.LocalDate timestamp;

        public CommentSettingsChange() {
        }

        public String getId() {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getNewStatus() {
            return this.newStatus;
        }

        public void setNewStatus(String newStatus) {
            this.newStatus = newStatus;
        }

        public java.time.LocalDate getTimestamp() {
            return this.timestamp;
        }

        public void setTimestamp(java.time.LocalDate timestamp) {
            this.timestamp = timestamp;
        }

    }

}
