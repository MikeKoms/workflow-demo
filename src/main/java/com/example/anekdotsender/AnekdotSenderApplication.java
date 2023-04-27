package com.example.anekdotsender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AnekdotsConfiguration.class)
public class AnekdotSenderApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnekdotSenderApplication.class, args);
	}

}
