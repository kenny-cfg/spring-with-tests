package com.spring.with.tests.testing.annotation.withoutmagic;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorExampleTest {
    @Test
    void canUseRequiredConstructor() {
        val instance = new ConstructorExample(69);

        assertEquals(instance.getIntegerValue(), 69);
    }

    @Test
    void canUseAllConstructor() {
        val instance = new ConstructorExample("pooBum", 69);

        assertEquals(instance.getIntegerValue(), 69);
        assertEquals(instance.getStringValue(), "pooBum");
    }
}