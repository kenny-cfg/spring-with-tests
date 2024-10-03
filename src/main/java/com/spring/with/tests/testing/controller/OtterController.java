package com.spring.with.tests.testing.controller;

import com.spring.with.tests.testing.entity.Otter;
import com.spring.with.tests.testing.entity.OtterDto;
import com.spring.with.tests.testing.entity.OtterMapper;
//import com.spring.with.tests.testing.repository.OtterRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Map;

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
//    private final OtterRepository otterRepository;
    private final OtterMapper otterMapper;

    @GetMapping
    public ResponseEntity<Collection<OtterDto>> getAll() {
        log.debug("Getting all");
        return ResponseEntity.ok(List.of());
//        val allOtters = otterRepository.findAll();
//        log.warn("Random warning");
//        val allMappedOtters = allOtters.stream()
//                .map(it -> otterMapper.map(it))
//                .toList();
//        return ResponseEntity.ok(allMappedOtters);
    }

    @PostMapping("{id}")
    public ResponseEntity<String> example(
            @RequestBody ExamplePayload body,
            @PathVariable String id,
            @RequestParam String blah
    ) {
        return ResponseEntity.ok("id is: " + id + ", laila is: " + body.laila + ", blah is: " + blah);
    }

    @Data
    public static class ExamplePayload {
        private final String laila;
        private final String maryAnn;
    }
}
