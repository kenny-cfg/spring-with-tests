package com.spring.with.tests.testing.annotation.withoutmagic;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetterSetterExampleWithoutMagicTest {
    @Test
    void settersWork() {
        val instance = new GetterSetterExampleWithoutMagic();
        instance.setInteger(69);
        assertEquals(69, instance.getInteger());
        instance.setString("HELLO");
        assertEquals("HELLO", instance.getString());
    }
}