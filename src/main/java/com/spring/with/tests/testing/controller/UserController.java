package com.spring.with.tests.testing.controller;

import com.spring.with.tests.testing.entity.RegistrationRequest;
import com.spring.with.tests.testing.entity.User;
import com.spring.with.tests.testing.password.PasswordHasher;
import com.spring.with.tests.testing.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
@RequiredArgsConstructor
public class UserController {
    private final UserRepository userRepository;
    private final PasswordHasher passwordHasher;

    @PostMapping
    public ResponseEntity<Void> register(@RequestBody RegistrationRequest request) {
        val hashedPassword = passwordHasher.hash(request.getPassword());
        val user = new User();
        user.setUsername(request.getUsername());
        user.setHashedPassword(hashedPassword);
        userRepository.save(user);
        return ResponseEntity.noContent().build();
    }
}
