package pt.isep.enorm.ref.youtube.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.youtube.domain.generated.GeneratedCommentSettingsChange;

@Entity(name = "CommentSettingsChange")
@Table(name = "comment_settings_changes")
public class CommentSettingsChange extends GeneratedCommentSettingsChange {
}

