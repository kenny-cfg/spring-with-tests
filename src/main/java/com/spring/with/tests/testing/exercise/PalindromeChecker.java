package com.spring.with.tests.testing.exercise;

import lombok.val;
import org.springframework.stereotype.Component;

@Component
public class PalindromeChecker {
    public boolean check(String source) {
        if (source == null) {
            return false;
        }
        if (source.length() <= 1) {
            return true;
        }
        val lastCharacter = source.charAt(source.length() - 1);
        val firstCharacter = source.charAt(0);
        if (firstCharacter != lastCharacter ) {
            return false;
        }
        return check(source.substring(1, source.length() - 1));
    }
}
