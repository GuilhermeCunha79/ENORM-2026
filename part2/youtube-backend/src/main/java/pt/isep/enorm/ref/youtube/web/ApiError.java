package pt.isep.enorm.ref.youtube.web;

import java.time.Instant;

public record ApiError(int status, String error, String message, Instant timestamp) {
}

