package com.example.RepairProject;

import static org.assertj.core.api.Assertions.assertThat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;


import com.example.RepairProject.domain.Repair;
import com.example.RepairProject.domain.RepairRepository;




@DataJpaTest
public class RepairRepositoryTest {

    @Autowired
    private RepairRepository repository;

    
    

    @Test
    public void findByTitleTest() {
    	
    	
        List<Repair> repairs = repository.findByTitle("pegs");
        //here I checking that the repository exists and has a title names pegs
        assertThat(repairs).hasSize(1);
        assertThat(repairs.get(0).getTitle()).isEqualTo("pegs");
    }
    
    @Test
    public void createNewRepair() throws ParseException {
    	//here i am testing if i can make a new repair object and save it to the repository
    	
    	Date date = new SimpleDateFormat("dd/MM/yyy").parse("20/05/2020");
    	
    	Repair repair = new Repair("pegs", "changed pegs", 100, date);
    	repository.save(repair);
    	assertThat(repair.getId()).isNotNull();
    }    

}