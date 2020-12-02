package com.example.RepairProject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.RepairProject.domain.Repair;
import com.example.RepairProject.domain.RepairRepository;

@SpringBootApplication
public class RepairProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(RepairProjectApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(RepairRepository repository) {
		return(args) -> {

		};
	}
	
}
