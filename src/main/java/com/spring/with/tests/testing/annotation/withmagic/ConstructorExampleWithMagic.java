package com.spring.with.tests.testing.annotation.withmagic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class ConstructorExampleWithMagic {
    private String stringValue;
    private final int integerValue;
}
