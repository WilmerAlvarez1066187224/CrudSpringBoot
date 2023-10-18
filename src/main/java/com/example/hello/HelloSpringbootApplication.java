package com.example.hello;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.example.hello")
@EntityScan("com.example.hello")
@SpringBootApplication
public class HelloSpringbootApplication {


	public static void main(String[] args) {
		SpringApplication.run(HelloSpringbootApplication.class, args);
	}


}



