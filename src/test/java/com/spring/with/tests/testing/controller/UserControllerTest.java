package com.spring.with.tests.testing.controller;

//import com.spring.with.tests.testing.repository.UserRepository;
import lombok.SneakyThrows;
import lombok.val;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//@SpringBootTest
//@AutoConfigureMockMvc
//class UserControllerTest {
//    @Autowired
//    private MockMvc mvc;
//    @MockBean
//    private UserRepository userRepository;
//
//    @Test
//    @SneakyThrows
//    void when_register_then_userCreated() {
//        val request = post("/user")
//                .header("Content-Type", "application/json")
//                .content("""
//                {
//                  "username": "Cherryl",
//                  "password": "123456"
//                }
//                """);
//
//        mvc.perform(request)
//                .andExpect(status().isNoContent());
//
//        verify(userRepository).save(any());
//    }
//}