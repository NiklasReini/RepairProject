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
			Repair r1 = new Repair("Piston change", "Changed psiton", 150);
			Repair r2 = new Repair("new grips", "added new grips", 10);
			Repair r3 = new Repair("new seat", "Changed seat cover", 100);
			
			repository.save(r1);
			repository.save(r2);
			repository.save(r3);
		};
	}
	
}
