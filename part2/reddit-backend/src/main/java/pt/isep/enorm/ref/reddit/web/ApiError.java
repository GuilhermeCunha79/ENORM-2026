package pt.isep.enorm.ref.reddit.web;

import java.time.Instant;

public record ApiError(int status, String error, String message, Instant timestamp) {
}

