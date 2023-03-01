package com.example.springdatajpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringdatajpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdatajpaApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner (StudentRepository studentRepository) {
		return args -> {
			Student tushar = new Student("Naimul MD", "Shahariar", "shahariartushar@gmail.com", 27);
			studentRepository.save(tushar);
		};
	}

}
