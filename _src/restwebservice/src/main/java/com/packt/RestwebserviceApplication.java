package com.packt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RestwebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestwebserviceApplication.class, args);
	}
}
