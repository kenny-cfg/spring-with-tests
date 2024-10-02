package com.spring.with.tests.testing.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("health")
public class HealthController {
    @Value("${bumPoo}")
    private String testValue;

    @GetMapping
    public ResponseEntity<String> health() {
        return ResponseEntity.ok("The test value is " + testValue);
    }
}
