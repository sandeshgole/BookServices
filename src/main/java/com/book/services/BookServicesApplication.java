package com.book.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@EnableEurekaClient
public class BookServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookServicesApplication.class, args);
	}

}
