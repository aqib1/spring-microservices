package com.example.music.info.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.music.info.service")
public class MusicInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MusicInfoServiceApplication.class, args);
	}

}
