package com.example.masale_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.masale_app.entities.Masaledata;
public interface MasaledataRepo extends JpaRepository<Masaledata, Integer>{
	
}