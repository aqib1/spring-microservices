package com.example.music.catalog.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableCircuitBreaker
@ComponentScan(basePackages = "com.example.music.catalog.service")
public class MusicCatalogBootServiceApplication {

//	@Bean
//	@LoadBalanced
//	public RestTemplate getRestTemplate() {
//		HttpComponentsClientHttpRequestFactory c = new HttpComponentsClientHttpRequestFactory();
//		c.setConnectTimeout(3000);
//		return new RestTemplate(c);
//	}

//	@Bean
//	public WebClient.Builder getWebClientBuilder() {
//		return WebClient.builder();
//	}
	
	public static void main(String[] args) {
		SpringApplication.run(MusicCatalogBootServiceApplication.class, args);

	}

}
