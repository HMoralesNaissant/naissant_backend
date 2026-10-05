package com.naissant.naissantapp.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.naissant.naissantapp.entity.Users;
import com.naissant.naissantapp.repository.UsersRepository;
import java.util.List;
import org.junit.jupiter.api.Test;

class AuthServiceTest {

    // 'Clave#123' encrypted with CryptoJS.AES.encrypt(pass, 'secret key 123')
    private static final String STORED = "U2FsdGVkX19LvB2CY1VsRxc7dK9N1Iy9VMU7QM3Xp+A=";

    private AuthService service(char status) {
        Users u = new Users();
        u.setUserName("carlos");
        u.setPassword(STORED);
        u.setStatus(status);
        UsersRepository repo = mock(UsersRepository.class);
        when(repo.findByUserName("carlos")).thenReturn(List.of(u));
        return new AuthService(repo, "secret key 123");
    }

    @Test
    void acceptsCorrectPassword() {
        assertTrue(service('A').authenticate("carlos", "Clave#123").isPresent());
    }

    @Test
    void rejectsWrongPassword() {
        assertTrue(service('A').authenticate("carlos", "otra").isEmpty());
    }

    @Test
    void rejectsInactiveUser() {
        assertTrue(service('I').authenticate("carlos", "Clave#123").isEmpty());
    }

    @Test
    void jwtRoundTripAndTypeCheck() {
        JwtService jwt = new JwtService("0123456789abcdef0123456789abcdef", 60, 24);
        String access = jwt.createAccessToken(7, "carlos");
        assertEquals("7", jwt.parse(access, JwtService.ACCESS).getSubject());
        assertNull(jwt.parse(access, JwtService.REFRESH));
        assertNull(jwt.parse(access + "x", JwtService.ACCESS));
    }
}
