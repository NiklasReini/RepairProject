package com.example.RepairProject.domain;

import java.awt.Image;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.web.multipart.MultipartFile;

@Entity
public class Repair {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String title, description;
	private int price;
	private MultipartFile image;
	
	public Repair() {}
	
	public Repair(String title, String description, int price, MultipartFile image) {
		super();
		this.title = title;
		this.description = description;
		this.price = price;
		this.image = image;
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

	public MultipartFile getImage() {
		return image;
	}

	public void setImage(MultipartFile image) {
		this.image = image;
	}
	
	
	
}
