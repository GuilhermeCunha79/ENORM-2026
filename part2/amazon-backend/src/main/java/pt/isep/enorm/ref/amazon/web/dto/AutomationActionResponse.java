package pt.isep.enorm.ref.amazon.web.dto;

import pt.isep.enorm.ref.amazon.domain.enums.ActionResultKind;

public record AutomationActionResponse(Long id, String name, ActionResultKind kind, String message) {
}
