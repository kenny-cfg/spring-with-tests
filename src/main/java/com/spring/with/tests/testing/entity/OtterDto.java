package com.spring.with.tests.testing.entity;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class OtterDto {
    private final String name;
    private final boolean hasNumbersInName;
    private final int age;
}
