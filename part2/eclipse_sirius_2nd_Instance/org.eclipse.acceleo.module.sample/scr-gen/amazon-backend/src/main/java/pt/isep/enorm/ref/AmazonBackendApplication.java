package pt.isep.enorm.ref;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AmazonBackendApplication {

    public static final String MODEL_NAME = "Amazon";
    public static final String MODEL_VERSION = "3.0";
    public static final String RUNTIME_PROFILE = "catalog-commerce";

    public static void main(String... args) {
        SpringApplication.run(AmazonBackendApplication.class, args);
    }
}
