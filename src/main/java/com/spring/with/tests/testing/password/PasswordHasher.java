package com.spring.with.tests.testing.password;

import org.springframework.stereotype.Component;

@Component
public class PasswordHasher {
    public String hash(String password) {
        return "NEW_HASH+" + password;
    }
}
