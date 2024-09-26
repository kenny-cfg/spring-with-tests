package com.spring.with.tests.testing.entity;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RegistrationRequest {
    private String username;
    private String password;
}
