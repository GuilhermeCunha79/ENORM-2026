package pt.isep.enorm.ref.youtube.web.generated;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.validation.Valid;
import pt.isep.enorm.ref.youtube.domain.Like;
import pt.isep.enorm.ref.youtube.domain.YoutubeUser;
import pt.isep.enorm.ref.youtube.service.LikeService;

public abstract class GeneratedLikeController {

    private final LikeService likeService;

    protected GeneratedLikeController(LikeService likeService) {
        this.likeService = likeService;
    }

    @GetMapping("/likes")
    public List<Like> listLikes(@RequestParam(required = false) Long videoId, @RequestParam(required = false) Long commentId) {
        if ((videoId == null && commentId == null) || (videoId != null && commentId != null)) {
            throw new IllegalArgumentException("Provide either videoId or commentId.");
        }
        return videoId != null ? likeService.listLikesForVideo(videoId) : likeService.listLikesForComment(commentId);
    }

    @PostMapping("/likes")
    public ResponseEntity<Like> createLike(
        @AuthenticationPrincipal YoutubeUser currentUser,
        @RequestParam(required = false) Long videoId,
        @RequestParam(required = false) Long commentId,
        @Valid @RequestBody Like request
    ) {
        Like savedLike = likeService.createLike(currentUser, videoId, commentId, request);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedLike);
    }

    @DeleteMapping("/likes/{likeId}")
    public ResponseEntity<Void> deleteLike(@PathVariable Long likeId) {
        likeService.deleteLike(likeId);
        return ResponseEntity.noContent().build();
    }
}

