package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FsdApplication {

	public static void main(String[] args) {
		SpringApplication.run(FsdApplication.class, args);
		System.out.println("Welcome to CRUD APP");
	}

}
