package com.spring.with.tests.testing.exercise;

import lombok.val;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RandomElementChooserTest {
    private final RandomElementChooser randomElementChooser = new RandomElementChooser();

    @Test
    void choosesRandomElement() {
        val source = List.of(
                "hello",
                "goodbye",
                "blah",
                "poo",
                "bum"
        );

        val result = randomElementChooser.choose(source);

        assertTrue(source.contains(result));
    }

    @Test
    void choosesRandomElementFromIntegers() {
        val source = List.of(1, 2, 3);

        val result = randomElementChooser.choose(source);

        assertTrue(source.contains(result));
    }
}