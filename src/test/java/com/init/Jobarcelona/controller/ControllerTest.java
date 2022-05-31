package com.init.Jobarcelona.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class ControllerTest {

    @Autowired
    PlayerController playerController;


    @Test
    public void contextLoads() throws Exception {
        assertThat(playerController).isNotNull();
    }
}
