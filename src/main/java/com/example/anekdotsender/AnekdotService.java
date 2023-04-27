package com.example.anekdotsender;

import ch.qos.logback.core.testUtil.RandomUtil;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnekdotService {
    private final String[] anekdots;

    public AnekdotService(AnekdotsConfiguration configuration) {
        this.anekdots = configuration.getList();
    }

    public String getRandom() {
        int positiveInt = RandomUtil.getPositiveInt() % anekdots.length;
        return anekdots[positiveInt];
    }

    public List<String> getAll() {
        return List.of(anekdots);
    }
}
