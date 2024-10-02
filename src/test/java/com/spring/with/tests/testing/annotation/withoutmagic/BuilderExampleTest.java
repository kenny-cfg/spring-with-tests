package com.spring.with.tests.testing.annotation.withoutmagic;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuilderExampleTest {
    @Test
    void canInstantiate() {
        val instance = BuilderExample.builder()
                .integer(5)
                .stringValue("HELLO")
                .build();
        /*
        Is a lot nicer than:
        val instance = new BuilderExample();
        instance.integer = 5;
        instance.stringValue = "HELLO";
         */

        assertEquals(instance.integer, 5);
        assertEquals(instance.stringValue, "HELLO");
    }

}