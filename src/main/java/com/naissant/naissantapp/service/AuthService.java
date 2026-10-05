package com.naissant.naissantapp.service;

import com.naissant.naissantapp.entity.Users;
import com.naissant.naissantapp.repository.UsersRepository;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final UsersRepository users;
    private final String passwordKey;

    public AuthService(UsersRepository users, @Value("${auth.password-key}") String passwordKey) {
        this.users = users;
        this.passwordKey = passwordKey;
    }

    /** Active user whose password matches, or empty. Never says which of the two failed. */
    public Optional<Users> authenticate(String username, String password) {
        if (username == null || password == null) {
            return Optional.empty();
        }
        return users.findByUserName(username).stream()
                .filter(u -> u.getStatus() == 'A')
                .filter(u -> passwordMatches(u.getPassword(), password))
                .findFirst();
    }

    public Optional<Users> findActive(int id) {
        return users.findById(id).filter(u -> u.getStatus() == 'A');
    }

    // Passwords are stored as CryptoJS AES(passphrase) output: base64("Salted__" + salt + ciphertext).
    private boolean passwordMatches(String stored, String candidate) {
        try {
            byte[] raw = Base64.getDecoder().decode(stored);
            byte[] salt = Arrays.copyOfRange(raw, 8, 16);
            byte[] keyIv = evpBytesToKey(passwordKey.getBytes(StandardCharsets.UTF_8), salt, 48);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE,
                    new SecretKeySpec(Arrays.copyOfRange(keyIv, 0, 32), "AES"),
                    new IvParameterSpec(Arrays.copyOfRange(keyIv, 32, 48)));
            byte[] plain = cipher.doFinal(raw, 16, raw.length - 16);
            return MessageDigest.isEqual(plain, candidate.getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) {
            return false;
        }
    }

    private static byte[] evpBytesToKey(byte[] pass, byte[] salt, int length) throws Exception {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        byte[] out = new byte[0];
        byte[] block = new byte[0];
        while (out.length < length) {
            md5.update(block);
            md5.update(pass);
            md5.update(salt);
            block = md5.digest();
            out = Arrays.copyOf(out, out.length + block.length);
            System.arraycopy(block, 0, out, out.length - block.length, block.length);
        }
        return Arrays.copyOf(out, length);
    }
}
