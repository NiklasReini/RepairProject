package com.example.RepairProject.domain;

import java.util.Date;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

//This is where i create the Crud repository for my repai objects

public interface RepairRepository extends CrudRepository<Repair, Long> {
	
	//the following two functions are for sorting by date and price
	
	List<Repair> findAllByOrderByDateDesc();
	
	List<Repair> findAllByOrderByPriceDesc();
	
	List<Repair> findByTitle(@Param("title")String title);
	
}
