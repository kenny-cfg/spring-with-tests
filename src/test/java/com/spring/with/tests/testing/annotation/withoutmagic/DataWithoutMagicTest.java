package com.spring.with.tests.testing.annotation.withoutmagic;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataWithoutMagicTest {
    @Test
    void dataWithoutMagic() {
        val instance = DataWithoutMagic.builder()
                .stringField("poobum")
                .build();

        assertEquals(instance.getStringField(), "poobum");
    }
}