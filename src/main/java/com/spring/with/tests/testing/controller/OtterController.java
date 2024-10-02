package com.spring.with.tests.testing.controller;

import com.spring.with.tests.testing.entity.Otter;
import com.spring.with.tests.testing.entity.OtterDto;
import com.spring.with.tests.testing.entity.OtterMapper;
import com.spring.with.tests.testing.repository.OtterRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("otter")
@RequiredArgsConstructor
@Slf4j
/*
Spring automatically @Autowired on all constructor arguments if there is
only one constructor

Making the dependencies `final` means they are immutable, and required in
the constructor

`@RequiredArgsConstructor` will generate a constructor for you

Also: `@Slf4j` instantiates a logger
 */
public class OtterController {
    private final OtterRepository otterRepository;
    private final OtterMapper otterMapper;

    @GetMapping
    public ResponseEntity<Collection<OtterDto>> getAll() {
        log.info("Getting all");
        val allOtters = otterRepository.findAll();
        log.warn("Random warning");
        val allMappedOtters = allOtters.stream()
                .map(it -> otterMapper.map(it))
                .toList();
        return ResponseEntity.ok(allMappedOtters);
    }
}
