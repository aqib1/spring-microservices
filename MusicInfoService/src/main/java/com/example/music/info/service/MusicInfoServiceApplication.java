package com.example.music.info.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com.example.music.info.service")
public class MusicInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MusicInfoServiceApplication.class, args);
	}

}
