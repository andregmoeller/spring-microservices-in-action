package com.thoughtmechanix.licensingservice.licenses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@RefreshScope
@EnableDiscoveryClient
@EnableFeignClients
@EnableCircuitBreaker
public class LicensingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LicensingServiceApplication.class, args);
	}
}
