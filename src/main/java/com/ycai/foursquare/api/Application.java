package com.ycai.foursquare.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@Configuration
//@ComponentScan("com.ycai.foursquare.api")
public class Application {
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		RestTemplate restTemplate = builder.build();
		
		return restTemplate;
	}
	

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
