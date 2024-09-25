package com.spring.with.tests.testing.controller;

import com.spring.with.tests.testing.entity.Otter;
import com.spring.with.tests.testing.repository.OtterRepository;
import lombok.SneakyThrows;
import lombok.val;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Date;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class OtterControllerWithMvcTest {
    @MockBean
    private OtterRepository otterRepository;
    @Autowired
    private MockMvc mvc;

    @Test
    @SneakyThrows
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

        val json = mvc.perform(get("/otter"))
                .andExpect(status().isOk())
                .andReturn()
                .getResponse()
                .getContentAsString() ;
        System.out.println(json);
    }
}
