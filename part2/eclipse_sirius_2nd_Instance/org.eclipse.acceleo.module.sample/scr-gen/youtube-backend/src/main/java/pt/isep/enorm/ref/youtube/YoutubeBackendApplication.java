package pt.isep.enorm.ref.youtube;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class YoutubeBackendApplication {

    public static final String MODEL_NAME = "YouTube";
    public static final String MODEL_VERSION = "3.2";
    public static final String RUNTIME_PROFILE = "media-feedback";

    public static void main(String... args) {
        SpringApplication.run(YoutubeBackendApplication.class, args);
    }
}
