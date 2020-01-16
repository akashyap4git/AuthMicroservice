package com.ak4.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class AuthMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthMicroserviceApplication.class, args);
	}

}
