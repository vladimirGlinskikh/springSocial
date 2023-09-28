package kz.zhelezyaka.springsocial.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest
class HomeControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void displayHomePageTest() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk());
    }
}