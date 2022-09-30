package com.hsbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient
@SpringBootApplication
public class MicroserviceTwoApp {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceTwoApp.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate createRest(RestTemplateBuilder builder) {
		return builder.build();
	}
}
