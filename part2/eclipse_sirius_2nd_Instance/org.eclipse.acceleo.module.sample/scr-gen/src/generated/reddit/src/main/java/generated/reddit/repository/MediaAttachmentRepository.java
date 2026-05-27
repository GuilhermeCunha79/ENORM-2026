package generated.reddit.repository;

import generated.reddit.domain.MediaAttachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MediaAttachmentRepository extends JpaRepository<MediaAttachment, String> {
}
