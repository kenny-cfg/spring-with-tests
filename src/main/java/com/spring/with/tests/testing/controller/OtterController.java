package com.spring.with.tests.testing.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("otter")
public class OtterController {
    @GetMapping
    public ResponseEntity<String> getOtter() {
        return ResponseEntity.ok("Otter");
    }
}
