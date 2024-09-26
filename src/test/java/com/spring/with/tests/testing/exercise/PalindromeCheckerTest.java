package com.spring.with.tests.testing.exercise;

import lombok.val;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PalindromeCheckerTest {
    @Autowired
    private PalindromeChecker palindromeChecker;

    @Test
    void when_singleLetter_then_returnsTrue() {
        val result = palindromeChecker.check("a");

        assertTrue(result);
    }

    @Test
    void when_doubleLetterNotPalindrome_then_returnsFalse() {
        val result = palindromeChecker.check("ab");

        assertFalse(result);
    }

    @Test
    void when_multipleLettersNotPalindrome_then_returnsFalse() {
        val result = palindromeChecker.check("helloh");

        assertFalse(result);
    }

    @Test
    void when_multipleLettersPalindrome_then_returnsTrue() {
        val result = palindromeChecker.check("abba");

        assertTrue(result);
    }
}