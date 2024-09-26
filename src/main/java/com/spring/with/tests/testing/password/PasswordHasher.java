package com.spring.with.tests.testing.password;

import org.springframework.stereotype.Component;

@Component
public class PasswordHasher {
    public String hash(String password) {
        /*
@Test
public void givenRawPassword_whenEncodedWithArgon2_thenMatchesEncodedPassword() {
    String rawPassword = "Baeldung";
    Argon2PasswordEncoder arg2SpringSecurity = new Argon2PasswordEncoder(16, 32, 1, 60000, 10);
    String springBouncyHash = arg2SpringSecurity.encode(rawPassword);

    assertTrue(arg2SpringSecurity.matches(rawPassword, springBouncyHash));
}         */
        return "NEW_HASH+" + password;
    }
}
