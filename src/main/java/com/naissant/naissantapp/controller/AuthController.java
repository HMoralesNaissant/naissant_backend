package com.naissant.naissantapp.controller;

import com.naissant.naissantapp.config.CurrentUser;
import com.naissant.naissantapp.entity.Persons;
import com.naissant.naissantapp.entity.Users;
import com.naissant.naissantapp.service.AuthService;
import com.naissant.naissantapp.service.JwtService;
import io.jsonwebtoken.Claims;
import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    public record LoginRequest(String username, String password) {}

    public record RefreshRequest(String refresh_token) {}

    private final AuthService auth;
    private final JwtService jwt;

    public AuthController(AuthService auth, JwtService jwt) {
        this.auth = auth;
        this.jwt = jwt;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest req) {
        return auth.authenticate(req.username(), req.password())
                .<ResponseEntity<?>>map(u -> ResponseEntity.ok(tokens(u)))
                .orElseGet(() -> unauthorized("Usuario o contraseña incorrectos"));
    }

    @PostMapping("/refresh")
    public ResponseEntity<?> refresh(@RequestBody RefreshRequest req) {
        Claims claims = req.refresh_token() == null ? null : jwt.parse(req.refresh_token(), JwtService.REFRESH);
        if (claims == null) {
            return unauthorized("Sesión inválida");
        }
        return auth.findActive(Integer.parseInt(claims.getSubject()))
                .<ResponseEntity<?>>map(u -> ResponseEntity.ok(tokens(u)))
                .orElseGet(() -> unauthorized("Sesión inválida"));
    }

    @GetMapping("/me")
    public ResponseEntity<?> me() {
        return CurrentUser.get()
                .flatMap(cu -> auth.findActive(cu.id()))
                .<ResponseEntity<?>>map(u -> {
                    Persons p = u.getPersonId();
                    Map<String, Object> body = new LinkedHashMap<>();
                    body.put("id", u.getId());
                    body.put("username", u.getUserName());
                    body.put("name", p == null ? u.getUserName() : p.getName() + " " + p.getSurnames());
                    body.put("email", p == null ? null : p.getEmail());
                    body.put("photoFileId", u.getPhotoFileId());
                    body.put("profileId", u.getProfileId() == null ? null : Map.of("id", u.getProfileId().getId()));
                    if (p != null) {
                        body.put("personId", Map.of("id", p.getId()));
                        body.put("companyId", p.getCompanyId());
                        body.put("departmentsId", p.getDepartmentsId() == null ? null : Map.of("id", p.getDepartmentsId().getId()));
                    }
                    return ResponseEntity.ok(body);
                })
                .orElseGet(() -> unauthorized("Sesión inválida"));
    }

    private Map<String, Object> tokens(Users u) {
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("access_token", jwt.createAccessToken(u.getId(), u.getUserName()));
        body.put("token_type", "bearer");
        body.put("expires_in", jwt.accessSeconds());
        body.put("refresh_token", jwt.createRefreshToken(u.getId(), u.getUserName()));
        return body;
    }

    private ResponseEntity<?> unauthorized(String message) {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(Map.of("message", message));
    }
}
