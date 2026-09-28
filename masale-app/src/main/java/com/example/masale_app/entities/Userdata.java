package com.example.masale_app.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Userdata{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String userName;
	private String password;
	private String role;
	
	public Userdata() {
		
	}
	
	public Userdata(String userName,String password,String role) {
		this.userName = userName;
		this.password = password;
		this.role = role;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setUsername(String userName) {
		this.userName = userName;
	}
	public void setPassword(String password ) {
		this.password=password;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public String getUsername() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	public String getRole() {
		return role;
	}
}