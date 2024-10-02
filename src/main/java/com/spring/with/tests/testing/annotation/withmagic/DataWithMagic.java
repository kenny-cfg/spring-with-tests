package com.spring.with.tests.testing.annotation.withmagic;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class DataWithMagic {
    private final String stringField;
}
