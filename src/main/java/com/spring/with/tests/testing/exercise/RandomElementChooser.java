package com.spring.with.tests.testing.exercise;

import lombok.val;

import java.util.Collection;
import java.util.Random;

public class RandomElementChooser {
    public <T> T choose(Collection<T> source) {
        val index = new Random().nextInt(source.size());
        return source.stream().toList().get(index);
    }
}
