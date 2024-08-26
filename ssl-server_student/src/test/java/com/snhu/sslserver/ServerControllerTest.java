package com.snhu.sslserver;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(ServerController.class)
public class ServerControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testShowMyHash() throws Exception {
        String expectedData = "Bret Thex Check Sum!";
        String expectedHash = "SHA256  : 425e76b2cc7591c0b334b5b9ee6bcfa0f8912a67b15df6613dce71514605f800";

        mockMvc.perform(MockMvcRequestBuilders.get("/hash"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(org.hamcrest.Matchers.containsString(expectedData)))
                .andExpect(MockMvcResultMatchers.content().string(org.hamcrest.Matchers.containsString(expectedHash)));
    }
}