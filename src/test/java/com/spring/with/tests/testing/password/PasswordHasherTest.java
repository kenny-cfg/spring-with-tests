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

        assertNotEquals(result.length(), 0);
    }
}