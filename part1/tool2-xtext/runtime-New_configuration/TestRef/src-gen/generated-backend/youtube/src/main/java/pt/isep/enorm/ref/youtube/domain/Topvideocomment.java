package pt.isep.enorm.ref.youtube.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.isep.enorm.ref.youtube.domain.generated.GeneratedTopvideocomment;

/** Manual extension point — add domain invariants or helpers here. */
@Entity
@Table(name = "topvideocomments")
public class Topvideocomment extends GeneratedTopvideocomment {
}
