package com.naissant.naissantapp.config;

import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.server.ResponseStatusException;

/**
 * Authenticated user taken from the access token. It is the principal of the Spring Security
 * {@link Authentication}, so it can also be injected with {@code @AuthenticationPrincipal CurrentUser user}.
 */
public record CurrentUser(int id, String username) {

    /** The authenticated user, or empty if the request carried no valid access token. */
    public static Optional<CurrentUser> get() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        return auth != null && auth.getPrincipal() instanceof CurrentUser user ? Optional.of(user) : Optional.empty();
    }

    /** The authenticated user; responds 401 if there is none. */
    public static CurrentUser require() {
        return get().orElseThrow(() -> new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Sesión inválida"));
    }
}
