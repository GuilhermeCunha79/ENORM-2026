package pt.isep.enorm.ref.youtube.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.youtube.domain.generated.GeneratedYoutubeUser;

/** Manual extension point — edit scenario-specific user logic here. */
@Entity
@Table(name = "users")
public class YoutubeUser extends GeneratedYoutubeUser {
}
