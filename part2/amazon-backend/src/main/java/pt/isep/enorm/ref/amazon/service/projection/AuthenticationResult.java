package pt.isep.enorm.ref.amazon.service.projection;

public record AuthenticationResult(String token, String username, String role) {
}