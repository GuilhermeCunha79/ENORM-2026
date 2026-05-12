package pt.isep.enorm.ref.youtube.service;

import org.springframework.stereotype.Service;

import pt.isep.enorm.ref.youtube.repository.CommentModerationCheckRepository;
import pt.isep.enorm.ref.youtube.repository.CommentRepository;
import pt.isep.enorm.ref.youtube.repository.CommentSettingsChangeRepository;
import pt.isep.enorm.ref.youtube.repository.VideoModerationCheckRepository;
import pt.isep.enorm.ref.youtube.repository.VideoRepository;
import pt.isep.enorm.ref.youtube.service.generated.GeneratedModerationService;

@Service
public class ModerationService extends GeneratedModerationService {

    public ModerationService(
        VideoModerationCheckRepository videoModerationCheckRepository,
        CommentModerationCheckRepository commentModerationCheckRepository,
        CommentSettingsChangeRepository commentSettingsChangeRepository,
        VideoRepository videoRepository,
        CommentRepository commentRepository
    ) {
        super(
            videoModerationCheckRepository,
            commentModerationCheckRepository,
            commentSettingsChangeRepository,
            videoRepository,
            commentRepository
        );
    }
}

