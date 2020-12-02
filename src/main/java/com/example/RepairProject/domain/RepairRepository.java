package com.example.RepairProject.domain;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface RepairRepository extends CrudRepository<Repair, Long> {

	List<Repair> findByDateDesc(Date date);
	
}
