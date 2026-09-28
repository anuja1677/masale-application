package com.example.masale_app.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.masale_app.entities.Masaledata;
import com.example.masale_app.repository.MasaledataRepo;
import java.util.List;
@RestController
@RequestMapping("/api/admin")
public class AdminController{
	@Autowired
	private MasaledataRepo repo; 	
	
	@PostMapping("/addItem")
	public Masaledata addItem(@RequestBody Masaledata item) {
		return repo.save(item);
	}
	
	@GetMapping("/allItems")
	public List<Masaledata>getallItems(){
		return repo.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteItem(@PathVariable int id) {
		repo.deleteById(id);
		return "Item delete successfully";
	}
}