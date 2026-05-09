package pt.isep.enorm.ref.amazon.service.command;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public record CreateProductCommand(String name, String description, BigDecimal price, LocalDate createdAt) {

    public CreateProductCommand {
        name = Objects.requireNonNull(name, "name is required").trim();
        description = Objects.requireNonNull(description, "description is required").trim();
        price = Objects.requireNonNull(price, "price is required");
    }
}