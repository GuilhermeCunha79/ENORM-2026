package pt.isep.enorm.ref.amazon.web.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record CreateProductRequest(
    @NotBlank @Size(max = 120) String name,
    @NotBlank @Size(max = 2000) String description,
    @NotNull @DecimalMin(value = "0.01") BigDecimal price,
    LocalDate createdAt
) {

    public CreateProductRequest {
        name = name == null ? null : name.trim();
        description = description == null ? null : description.trim();
    }
}