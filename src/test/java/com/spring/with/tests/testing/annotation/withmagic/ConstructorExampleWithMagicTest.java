package com.spring.with.tests.testing.annotation.withmagic;

import com.spring.with.tests.testing.annotation.withoutmagic.ConstructorExample;
import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorExampleWithMagicTest {
    @Test
    void canUseRequiredConstructor() {
        val instance = new ConstructorExampleWithMagic(69);

        assertEquals(instance.getIntegerValue(), 69);
    }

    @Test
    void canUseAllConstructor() {
        val instance = new ConstructorExampleWithMagic("pooBum", 69);

        assertEquals(instance.getIntegerValue(), 69);
        assertEquals(instance.getStringValue(), "pooBum");
    }
}