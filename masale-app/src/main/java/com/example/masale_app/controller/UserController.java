package com.example.masale_app.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.masale_app.entities.Masaledata;
import com.example.masale_app.repository.MasaledataRepo;
import java.util.List;
@RestController
@RequestMapping("/api/user")
public class UserController{
	@Autowired
	private MasaledataRepo repo;
	
	@GetMapping("/getMenu")
	public List<Masaledata>getMenu(){
		return repo.findAll();
	}
}

































































