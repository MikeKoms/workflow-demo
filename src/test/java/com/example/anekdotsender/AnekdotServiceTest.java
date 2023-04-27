package com.example.anekdotsender;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class AnekdotServiceTest {
    @Autowired
    private AnekdotService anekdotService;

    @Test
    void getAll__hasAnekdots_returnCorrectCollectionSize() {
        List<String> all = anekdotService.getAll();

        assertEquals(6, all.size());
    }
}
