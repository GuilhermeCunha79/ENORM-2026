package pt.isep.enorm.ref.dto;

public record AuthenticationResult(String token, String username, String role) {
}
