package com.example.rating.info.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.rating.info.service")
public class RatingInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RatingInfoServiceApplication.class, args);
	}

}
