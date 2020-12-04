package com.example.RepairProject.domain;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<RepairUser, Long> {
	RepairUser findByUsername(String username);
}