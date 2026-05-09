package pt.isep.enorm.ref.amazon.web.dto;

import jakarta.validation.constraints.NotNull;

public record ProductReferenceRequest(@NotNull Long id) {
}