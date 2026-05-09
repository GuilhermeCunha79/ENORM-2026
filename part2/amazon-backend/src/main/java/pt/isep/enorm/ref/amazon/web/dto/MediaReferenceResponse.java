package pt.isep.enorm.ref.amazon.web.dto;

import pt.isep.enorm.ref.amazon.domain.enums.MediaType;

public record MediaReferenceResponse(Long id, MediaType mediaType, String url) {
}