package pt.isep.enorm.ref.amazon.service.command;

import java.util.Objects;

import pt.isep.enorm.ref.amazon.domain.enums.MediaType;

public record MediaReferenceCommand(MediaType mediaType, String url) {

    public MediaReferenceCommand {
        mediaType = Objects.requireNonNull(mediaType, "mediaType is required");
        url = Objects.requireNonNull(url, "url is required").trim();
    }
}