package com.spring.with.tests.testing.exercise;

import lombok.val;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class RemoveDuplicates {
    public String[] remove(String[] source) {
        return Arrays.stream(source)
                .distinct()
                .toArray(String[]::new);
    }
}
