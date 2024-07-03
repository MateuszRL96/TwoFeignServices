package com.example.folderdwa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class HealthyPlantsClient {

	public static void main(String[] args) {
		SpringApplication.run(HealthyPlantsClient.class, args);
	}

}
