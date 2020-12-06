package com.example.RepairProject;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.RepairProject.domain.Repair;
import com.example.RepairProject.domain.RepairRepository;



@RunWith(SpringRunner.class)
@DataJpaTest
public class RepairRepositoryTest {

    @Autowired
    private RepairRepository repository;

    
    

    @Test
    public void findByTitleTest() {
    	
    	
        List<Repair> repairs = repository.findByTitle("pegs");
        
        assertThat(repairs).hasSize(1);
        assertThat(repairs.get(0).getTitle()).isEqualTo("pegs");
    }
    
    @Test
    public void createNewRepair() {
 
    	Repair repair = new Repair();
    	repository.save(repair);
    	assertThat(repair.getId()).isNotNull();
    }    

}