package com.spring.with.tests.testing.controller;

import com.spring.with.tests.testing.entity.RegistrationRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
@RequiredArgsConstructor
public class UserController {
    @PostMapping
    public ResponseEntity<Void> register(@RequestBody RegistrationRequest request) {
        return ResponseEntity.noContent().build();
    }
}
