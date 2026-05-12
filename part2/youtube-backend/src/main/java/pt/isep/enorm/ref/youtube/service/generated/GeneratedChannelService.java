package pt.isep.enorm.ref.youtube.service.generated;

import java.time.LocalDate;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import pt.isep.enorm.ref.youtube.domain.Channel;
import pt.isep.enorm.ref.youtube.domain.YoutubeUser;
import pt.isep.enorm.ref.youtube.repository.ChannelRepository;
import pt.isep.enorm.ref.youtube.web.error.ResourceNotFoundException;

@Transactional(readOnly = true)
public abstract class GeneratedChannelService {

    private final ChannelRepository channelRepository;

    protected GeneratedChannelService(ChannelRepository channelRepository) {
        this.channelRepository = channelRepository;
    }

    public List<Channel> listChannels() {
        return channelRepository.findAllByOrderByNameAsc();
    }

    public Channel getChannel(Long channelId) {
        return loadChannel(channelId);
    }

    @Transactional
    public Channel createChannel(YoutubeUser owner, Channel request) {
        if (owner == null) {
            throw new IllegalArgumentException("Owner is required.");
        }

        validateChannelRequest(request);

        Channel channel = new Channel();
        channel.setName(request.getName());
        channel.setDescription(request.getDescription());
        channel.setCreationDate(request.getCreationDate() == null ? LocalDate.now() : request.getCreationDate());
        channel.setOwner(owner);

        return channelRepository.save(channel);
    }

    @Transactional
    public Channel updateChannel(Long channelId, Channel request) {
        Channel channel = loadChannel(channelId);

        if (request.getName() != null && !request.getName().isBlank()) {
            channel.setName(request.getName());
        }

        if (request.getDescription() != null && !request.getDescription().isBlank()) {
            channel.setDescription(request.getDescription());
        }

        if (request.getCreationDate() != null) {
            channel.setCreationDate(request.getCreationDate());
        }

        return channelRepository.save(channel);
    }

    @Transactional
    public void deleteChannel(Long channelId) {
        Channel channel = loadChannel(channelId);
        channelRepository.delete(channel);
    }

    private Channel loadChannel(Long channelId) {
        return channelRepository.findById(channelId)
            .orElseThrow(() -> new ResourceNotFoundException("Channel '%s' was not found.".formatted(channelId)));
    }

    private void validateChannelRequest(Channel request) {
        if (request == null) {
            throw new IllegalArgumentException("Channel payload is required.");
        }

        if (request.getName() == null || request.getName().isBlank()) {
            throw new IllegalArgumentException("Channel name is required.");
        }

        if (request.getDescription() == null || request.getDescription().isBlank()) {
            throw new IllegalArgumentException("Channel description is required.");
        }
    }
}

