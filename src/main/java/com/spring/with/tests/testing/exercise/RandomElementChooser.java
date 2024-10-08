package com.spring.with.tests.testing.exercise;

import lombok.val;

import java.util.Collection;
import java.util.Random;

public class RandomElementChooser {
    public <T> T choose(Collection<T> pooBum) {
        val index = new Random().nextInt(pooBum.size());
        return pooBum.stream().toList().get(index);
    }
}
