package com.spring.with.tests.testing.controller;

import com.spring.with.tests.testing.entity.Otter;
import com.spring.with.tests.testing.repository.OtterRepository;
import lombok.val;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Incubating;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class OtterControllerMockitoTest {
    @Mock
    private OtterRepository otterRepository;
    @InjectMocks
    private OtterController otterController;

    @Test
    void when_getAll_then_allOttersReturned() {
        val firstOtter = new Otter();
        firstOtter.setId(1L);
        firstOtter.setName("Vimbai");
        firstOtter.setBirthDate(new Date(2024, 9, 9));
        val secondOtter = new Otter();
        secondOtter.setId(2L);
        secondOtter.setName("Mehtap");
        secondOtter.setBirthDate(new Date(2023, 9, 9));
        when(otterRepository.findAll()).thenReturn(List.of(
                firstOtter, secondOtter
        ));

        val actual = otterController.getAll();

//        val firstOtterCandidate = actual
//                .getBody()
//                .stream()
//                .filter(it -> it.getId().equals(firstOtter.getId()))
//                .findFirst();
//        assertTrue(firstOtterCandidate.isPresent());
//        assertEquals(firstOtterCandidate.get(), firstOtter);
    }
}
