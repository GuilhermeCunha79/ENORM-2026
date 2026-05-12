package pt.isep.enorm.ref.youtube.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.youtube.domain.generated.GeneratedVideo;

@Entity(name = "Video")
@Table(name = "videos")
public class Video extends GeneratedVideo {
}

