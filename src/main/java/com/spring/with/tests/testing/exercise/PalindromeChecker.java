package com.spring.with.tests.testing.exercise;

import lombok.val;
import org.springframework.stereotype.Component;

@Component
public class PalindromeChecker {
    public boolean check(String source) {
        val lastCharacter = source.charAt(source.length() - 1);
        val firstCharacter = source.charAt(0);
        return firstCharacter == lastCharacter;
    }
}
