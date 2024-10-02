package com.spring.with.tests.testing.annotation.withmagic;

import com.spring.with.tests.testing.annotation.withoutmagic.DataWithoutMagic;
import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataWithMagicTest {
    @Test
    void dataWithoutMagic() {
        val instance = DataWithMagic.builder()
                .stringField("poobum")
                .build();

        assertEquals(instance.getStringField(), "poobum");
    }
}