package com.naissant.naissantapp.service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import java.time.Duration;
import java.util.Date;
import javax.crypto.SecretKey;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class JwtService {

    public static final String ACCESS = "access";
    public static final String REFRESH = "refresh";

    private final SecretKey key;
    private final Duration accessTtl;
    private final Duration refreshTtl;

    public JwtService(@Value("${jwt.secret}") String secret,
            @Value("${jwt.access-minutes}") long accessMinutes,
            @Value("${jwt.refresh-hours}") long refreshHours) {
        this.key = Keys.hmacShaKeyFor(secret.getBytes(java.nio.charset.StandardCharsets.UTF_8));
        this.accessTtl = Duration.ofMinutes(accessMinutes);
        this.refreshTtl = Duration.ofHours(refreshHours);
    }

    public long accessSeconds() {
        return accessTtl.toSeconds();
    }

    public String createAccessToken(int userId, String username) {
        return create(userId, username, ACCESS, accessTtl);
    }

    public String createRefreshToken(int userId, String username) {
        return create(userId, username, REFRESH, refreshTtl);
    }

    /** Returns the claims if the token is valid, not expired and of the expected type; otherwise null. */
    public Claims parse(String token, String expectedType) {
        try {
            Claims claims = Jwts.parser().verifyWith(key).build().parseSignedClaims(token).getPayload();
            return expectedType.equals(claims.get("type", String.class)) ? claims : null;
        } catch (JwtException | IllegalArgumentException e) {
            return null;
        }
    }

    private String create(int userId, String username, String type, Duration ttl) {
        Date now = new Date();
        return Jwts.builder()
                .header().type("JWT").and()
                .subject(String.valueOf(userId))
                .claim("username", username)
                .claim("type", type)
                .issuedAt(now)
                .expiration(new Date(now.getTime() + ttl.toMillis()))
                .signWith(key)
                .compact();
    }
}
