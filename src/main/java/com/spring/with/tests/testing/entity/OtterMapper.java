package com.spring.with.tests.testing.entity;

import lombok.val;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.regex.Pattern;

@Component
public class OtterMapper {
    public OtterDto map(Otter otter) {
        // int age = (int)ChronoUnit.YEARS.between(Instant.now(), otter.getBirthDate().toInstant());
        // TODO: Fixme
        val numbersInNameRegex = Pattern.compile("\\d");
        val matcher = numbersInNameRegex.matcher(otter.getName());
        val hasNumbersInName = matcher.find();

        return OtterDto.builder()
                .name(otter.getName())
                .age(12) // TODO: calculate properly
                .hasNumbersInName(hasNumbersInName)
                .build();
    }
}
