package com.naissant.naissantapp.exception;

import com.naissant.naissantapp.domain.ErrorResponse;
import jakarta.servlet.http.HttpServletRequest;
import java.time.OffsetDateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * Wraps every error in an {@link ErrorResponse}, keeping the status the error already carries:
 * Spring MVC and {@code ResponseStatusException} errors keep theirs, external API errors keep the API's
 * status (without its body), and anything else is a 500.
 */
@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    private static final Logger LOG = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /** An external API (WebClient) answered with an error: same status, generic message (details are only logged). */
    @ExceptionHandler(WebClientResponseException.class)
    public ResponseEntity<Object> externalApiError(WebClientResponseException ex, HttpServletRequest request) {
        LOG.error("External API error {} on {}: {}", ex.getStatusCode().value(), request.getRequestURI(),
                ex.getResponseBodyAsString(), ex);
        return build(ex.getStatusCode(), "No se pudo completar la solicitud", request.getRequestURI());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> unhandled(Exception ex, HttpServletRequest request) throws Exception {
        // Let Spring Security answer its own 401/403
        if (ex instanceof AuthenticationException || ex instanceof AccessDeniedException) {
            throw ex;
        }
        ResponseStatus annotated = AnnotatedElementUtils.findMergedAnnotation(ex.getClass(), ResponseStatus.class);
        HttpStatusCode status = annotated != null ? annotated.code() : HttpStatus.INTERNAL_SERVER_ERROR;
        LOG.error("Unhandled error on {}", request.getRequestURI(), ex);
        String message = status.is5xxServerError() ? "No se pudo completar"
                : (annotated.reason().isBlank() ? ex.getMessage() : annotated.reason());
        return build(status, message, request.getRequestURI());
    }

    /** Called for every Spring MVC / ResponseStatusException error handled by the parent class. */
    @Override
    protected ResponseEntity<Object> handleExceptionInternal(Exception ex, Object body, HttpHeaders headers,
            HttpStatusCode statusCode, WebRequest request) {
        String message = body instanceof ProblemDetail problem && problem.getDetail() != null
                ? problem.getDetail() : ex.getMessage();
        String path = request instanceof ServletWebRequest web ? web.getRequest().getRequestURI() : null;
        if (statusCode.is5xxServerError()) {
            LOG.error("Error {} on {}", statusCode.value(), path, ex);
        }
        return ResponseEntity.status(statusCode).headers(headers).body(error(statusCode, message, path));
    }

    private static ResponseEntity<Object> build(HttpStatusCode status, String message, String path) {
        return ResponseEntity.status(status).body(error(status, message, path));
    }

    private static ErrorResponse error(HttpStatusCode status, String message, String path) {
        HttpStatus known = HttpStatus.resolve(status.value());
        return new ErrorResponse(false, status.value(), known == null ? null : known.getReasonPhrase(), message,
                path, OffsetDateTime.now());
    }
}
