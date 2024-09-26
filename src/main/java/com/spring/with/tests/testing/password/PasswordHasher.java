package com.spring.with.tests.testing.password;

import lombok.val;
import org.springframework.security.crypto.argon2.Argon2PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class PasswordHasher {
    private final Argon2PasswordEncoder arg2SpringSecurity = new Argon2PasswordEncoder(16, 32, 1, 60000, 10);

    public String hash(String password) {
        return arg2SpringSecurity.encode(password);
    }

    public boolean verify(String password, String hashedPassword) {
        return arg2SpringSecurity.matches(password, hashedPassword);
    }
}
