package com.springloadrest.springloadrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springloadrest.springloadrest.entities.Load;
import com.springloadrest.springloadrest.services.LoadService;

@RestController
public class MyController {
	
	@Autowired
	private LoadService loadService;
	
	@GetMapping("/home")
	public String home(){
		return "Welcome to Load API";
	}
	
	@GetMapping("/loads")
	public List<Load> getLoads(){
		return this.loadService.getLoads();
		
	}
	@GetMapping("/loads/{shipperId}")
	public Load getLoad(@PathVariable String shipperId) {
		
		return this.loadService.getLoad(Long.parseLong(shipperId));
	}
	
	@PostMapping("/loads")
	public Load addLoad(@RequestBody Load load) {
		
		return this.loadService.addLoad(load);
		
	}
	
	@PutMapping("/loads")
	public Load updateLoad(@RequestBody Load load) {
		return this.loadService.updateLoad(load);
	}
	
	@DeleteMapping("/loads/{shipperId}")
	public ResponseEntity<HttpStatus> deleteLoad(@PathVariable String shipperId){
		try {
			this.loadService.deleteLoad(Long.parseLong(shipperId));
			return new ResponseEntity<>(HttpStatus.OK);
		    
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	


}
