package com.spring.with.tests.testing.password;

import lombok.val;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PasswordHasherTest {
    @Autowired
    private PasswordHasher passwordHasher;

    @Test
    void canHashPassword() {
        val password = "password";

        val result = passwordHasher.hash(password);
        val secondResult = passwordHasher.hash(password);

        assertNotEquals(result.length(), 0);
        assertFalse(result.contains(password));
        assertNotEquals(result, secondResult);
    }

    @Test
    void canVerifyPassword() {
        val password = "secure_password";
        val wrongPassword = "wrong_password";
        val hash = passwordHasher.hash(password);

        val result = passwordHasher.verify(password, hash);
        val wrongResult = passwordHasher.verify(wrongPassword, hash);

        assertTrue(result);
        assertFalse(wrongResult);
    }
}