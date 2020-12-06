package com.example.RepairProject.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

//this is where i make the Repair entity that is used throughout the app

@Entity
public class Repair {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String title, description;
	private int price;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date date;
	
	public Repair() {}
	
	public Repair(String title, String description, int price, Date date) {
		super();
		this.title = title;
		this.description = description;
		this.price = price;
		this.date = date;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
