package com.example.music.catalog.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.music.catalog.service")
public class MusicCatalogBootServiceApplication {

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@Bean
	public WebClient.Builder getWebClientBuilder() {
		return WebClient.builder();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MusicCatalogBootServiceApplication.class, args);

	}

}
