package pt.isep.enorm.ref.amazon.web.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public record ProductResponse(Long id, String name, String description, BigDecimal price, LocalDate createdAt) {
}