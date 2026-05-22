package generated.reddit.model;

import java.util.List;

public final class Users {

    private Users() {
    }

    public record UserTypeSpec(String name, String kind, List<String> superTypes) {}

    public static List<UserTypeSpec> all() {
        return List.of(
new UserTypeSpec(
                "User",
                "GENERIC",
                List.of()
            ),
            new UserTypeSpec(
                "Moderator",
                "MODERATOR",
                List.of("User")
            )        );
    }
}
