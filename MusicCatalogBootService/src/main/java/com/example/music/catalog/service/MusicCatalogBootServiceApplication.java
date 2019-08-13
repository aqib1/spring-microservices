package com.example.music.catalog.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.music.catalog.service")
public class MusicCatalogBootServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MusicCatalogBootServiceApplication.class, args);
	}

}
