package com.example.masale_app.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Masaledata{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private double prize;
	private String category;
	private String discription;
	
	public Masaledata() {
		
	}
	public Masaledata(String name,double prize,String category,String discription) {
		this.name = name;
		this.prize = prize;
		this.category = category;
		this.discription = discription;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrize(double prize) {
		this.prize = prize;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getPrize() {
		return prize;
	}
	public String getCategory() {
		return category;
	}
	public String getDiscription() {
		return discription;
	}
	
}