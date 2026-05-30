package pt.isep.enorm.ref.reddit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditBackendApplication {

    public static final String MODEL_NAME = "Reddit";
    public static final String MODEL_VERSION = "3.2";
    public static final String RUNTIME_PROFILE = "community-discussion";

    public static void main(String... args) {
        SpringApplication.run(RedditBackendApplication.class, args);
    }
}
