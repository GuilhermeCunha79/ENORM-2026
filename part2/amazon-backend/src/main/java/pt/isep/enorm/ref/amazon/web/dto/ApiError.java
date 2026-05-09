package pt.isep.enorm.ref.amazon.web.dto;

import java.time.Instant;

public record ApiError(int status, String error, String message, Instant timestamp) {
}