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

import jakarta.validation.Valid;
import pt.isep.enorm.ref.youtube.domain.Channel;
import pt.isep.enorm.ref.youtube.domain.YoutubeUser;
import pt.isep.enorm.ref.youtube.service.ChannelService;

public abstract class GeneratedChannelController {

    private final ChannelService channelService;

    protected GeneratedChannelController(ChannelService channelService) {
        this.channelService = channelService;
    }

    @GetMapping("/channels")
    public List<Channel> listChannels() {
        return channelService.listChannels();
    }

    @GetMapping("/channels/{channelId}")
    public Channel getChannel(@PathVariable Long channelId) {
        return channelService.getChannel(channelId);
    }

    @PostMapping("/channels")
    public ResponseEntity<Channel> createChannel(
        @AuthenticationPrincipal YoutubeUser currentUser,
        @Valid @RequestBody Channel request
    ) {
        Channel savedChannel = channelService.createChannel(currentUser, request);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedChannel);
    }

    @PutMapping("/channels/{channelId}")
    public Channel updateChannel(@PathVariable Long channelId, @Valid @RequestBody Channel request) {
        return channelService.updateChannel(channelId, request);
    }

    @DeleteMapping("/channels/{channelId}")
    public ResponseEntity<Void> deleteChannel(@PathVariable Long channelId) {
        channelService.deleteChannel(channelId);
        return ResponseEntity.noContent().build();
    }
}

