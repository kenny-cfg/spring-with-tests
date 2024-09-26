package com.spring.with.tests.testing.exercise;

import lombok.val;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Random;

public class RandomElementChooser {
    public String choose(Collection<String> source) {
        val index = new Random().nextInt(source.size());
        return source.stream().toList().get(index);
    }
}
