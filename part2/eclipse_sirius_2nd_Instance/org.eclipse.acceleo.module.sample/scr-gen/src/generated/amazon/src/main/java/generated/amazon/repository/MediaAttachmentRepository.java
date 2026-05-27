package generated.amazon.repository;

import generated.amazon.domain.MediaAttachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MediaAttachmentRepository extends JpaRepository<MediaAttachment, String> {
}
