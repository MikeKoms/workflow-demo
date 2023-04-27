package com.example.anekdotsender;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
@ConfigurationProperties(prefix = "anekdots")
@Primary
public class AnekdotsConfiguration {

    private String[] list;

    public String[] getList() {
        return list;
    }

    public void setList(String[] list) {
        this.list = list;
    }
}

