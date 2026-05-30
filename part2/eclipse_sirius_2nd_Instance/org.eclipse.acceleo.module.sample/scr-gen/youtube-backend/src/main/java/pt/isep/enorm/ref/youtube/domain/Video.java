package pt.isep.enorm.ref.youtube.domain;

import pt.isep.enorm.ref.youtube.domain.generated.GeneratedVideo;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "video")
public class Video extends GeneratedVideo {
}
