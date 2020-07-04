package com.rating.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableAutoConfiguration
@EnableWebMvc
@ComponentScan(basePackages="com.rating.client")
@EnableJpaRepositories("com.rating.client.persistance")
@CrossOrigin(origins="localhost:4200")
public class RatingClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(RatingClientApplication.class, args);
	}
	


}
