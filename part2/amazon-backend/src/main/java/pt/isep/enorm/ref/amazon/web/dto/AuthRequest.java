package pt.isep.enorm.ref.amazon.web.dto;

import jakarta.validation.constraints.NotBlank;

public record AuthRequest(@NotBlank String username, @NotBlank String password) {

    public AuthRequest {
        username = username == null ? null : username.trim();
        password = password == null ? null : password.trim();
    }
}