package com.example.RepairProject.domain;

import java.awt.Image;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Repair {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String title, description;
	private int price;
	private Image img;
	
	public Repair() {}
	
	public Repair(String title, String description, int price, Image img) {
		super();
		this.title = title;
		this.description = description;
		this.price = price;
		this.img = img;
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

	public Image getImg() {
		return img;
	}

	public void setImg(Image img) {
		this.img = img;
	}
	
	
	
}
