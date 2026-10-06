package com.naissant.naissantapp.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.time.OffsetDateTime;

/** Body returned for every handled error. Keeps the success/message pair used by {@link ResponseDto}. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public record ErrorResponse(
        boolean success,
        int status,
        String error,
        String message,
        String path,
        OffsetDateTime timestamp) {
}
