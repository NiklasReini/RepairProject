package com.example.RepairProject;

import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.RepairProject.domain.User;
import com.example.RepairProject.domain.UserRepository;
import com.example.RepairProject.domain.Repair;
import com.example.RepairProject.domain.RepairRepository;

@SpringBootApplication
public class RepairProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(RepairProjectApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(RepairRepository repository, UserRepository userRepository) {
		return(args) -> {
			
			User user1 = new User("user", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "USER");
			User user2 = new User("admin", "$2a$10$0MMwY.IQqpsVc1jC8u7IJ.2rT8b0Cd3b3sfIBGV2zfgnPGtT4r0.C", "ADMIN");
			userRepository.save(user1);
			userRepository.save(user2);
			
		};
	}
	
}
