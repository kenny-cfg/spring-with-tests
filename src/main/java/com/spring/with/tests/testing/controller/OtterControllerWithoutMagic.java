package com.spring.with.tests.testing.controller;

import com.spring.with.tests.testing.entity.OtterDto;
import com.spring.with.tests.testing.entity.OtterMapper;
//import com.spring.with.tests.testing.repository.OtterRepository;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.logging.Logger;

@SuppressWarnings("SpringJavaAutowiredFieldsWarningInspection")
@RestController
@RequestMapping("otter-with-magic")
public class OtterControllerWithoutMagic {
//    @Autowired
//    private OtterRepository otterRepository;
    @Autowired
    private OtterMapper otterMapper;
    private final Logger log = Logger.getLogger(OtterControllerWithoutMagic.class.getName());

    @GetMapping
    public ResponseEntity<Collection<OtterDto>> getAll() {
        log.info("Getting all");
        throw new RuntimeException();
//        val allOtters = otterRepository.findAll();
//        log.warning("Random warning");
//        val allMappedOtters = allOtters.stream()
//                .map(it -> otterMapper.map(it))
//                .toList();
//        return ResponseEntity.ok(allMappedOtters);
    }
}
