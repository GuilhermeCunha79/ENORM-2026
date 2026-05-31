package pt.isep.enorm.ref.youtube.service.projection;

public class AuthenticationResult {
    private final String token;
    private final String username;
    private final String role;

    public AuthenticationResult(String token, String username, String role) {
        this.token = token;
        this.username = username;
        this.role = role;
    }

    public String getToken() {
        return token;
    }

    public String getUsername() {
        return username;
    }

    public String getRole() {
        return role;
    }
}

