package com.example.masale_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.masale_app.entities.Userdata;
public interface UserReopsitory extends JpaRepository<Userdata, Integer>{
	
	Userdata findByUsername(String username);
}