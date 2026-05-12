package pt.isep.enorm.ref.youtube.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.youtube.domain.generated.GeneratedVideoModerationCheck;

@Entity(name = "VideoModerationCheck")
@Table(name = "video_moderation_checks")
public class VideoModerationCheck extends GeneratedVideoModerationCheck {
}

