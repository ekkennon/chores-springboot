package com.krekapps.choresspringboot.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by raefo on 23-Jun-17.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class TaskControllerTests {

    @Autowired
    private MockMvc mvc;

    @Test
    public void viewUrlTest() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/tasks/view").accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
    }

    @Test
    public void addUrlTest() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/tasks/add").accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
    }
}
