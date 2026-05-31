package pt.isep.enorm.ref.youtube.web.generated;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.validation.Valid;
import pt.isep.enorm.ref.youtube.domain.Video;
import pt.isep.enorm.ref.youtube.domain.YoutubeUser;
import pt.isep.enorm.ref.youtube.service.VideoService;

public abstract class GeneratedVideoController {

    private final VideoService videoService;

    protected GeneratedVideoController(VideoService videoService) {
        this.videoService = videoService;
    }

    @GetMapping("/videos")
    public List<Video> listVideos(@RequestParam Long channelId) {
        return videoService.listVideosForChannel(channelId);
    }

    @GetMapping("/videos/{videoId}")
    public Video getVideo(@PathVariable Long videoId) {
        return videoService.getVideo(videoId);
    }

    @PostMapping("/channels/{channelId}/videos")
    public ResponseEntity<Video> createVideo(
        @AuthenticationPrincipal YoutubeUser currentUser,
        @PathVariable Long channelId,
        @Valid @RequestBody Video request
    ) {
        Video savedVideo = videoService.createVideo(currentUser, channelId, request);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedVideo);
    }

    @PutMapping("/videos/{videoId}")
    public Video updateVideo(@PathVariable Long videoId, @Valid @RequestBody Video request) {
        return videoService.updateVideo(videoId, request);
    }

    @DeleteMapping("/videos/{videoId}")
    public ResponseEntity<Void> deleteVideo(@PathVariable Long videoId) {
        videoService.deleteVideo(videoId);
        return ResponseEntity.noContent().build();
    }
}

