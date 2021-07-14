package com.qa.pups.other;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.qa.service.PuppyService;

@RestController
public class PupsController {

	private PuppyService service;

	public PupsController(PuppyService service) {
		super();
		this.service = service;
	}

	@GetMapping("/")
	public String hello() {
		return "Hello, World!";
	}

	@PostMapping("/createPuppy")
	public void createPuppy(@RequestBody Puppy puppy) {
		this.service.createPuppy(puppy);
	}

	@GetMapping("/puppy/all")
	public List<Puppy> getAllPuppies() {
		return this.service.getAllPuppies();
	}

	@GetMapping("/getPuppy")
	public Puppy getPuppy(@PathVariable int id) {
		return this.service.getPuppy(id);
	}

	@PutMapping("/replacePuppy/{id}")
	public Puppy replacePuppy(@PathVariable int id, @RequestBody Puppy newPuppy) {
		return this.service.replacePuppy(id, newPuppy);
	}

	@DeleteMapping("/deletePuppy/{id}")
	public String deletePuppy(@PathVariable int id) {
		return this.service.deletePuppy(id);
	}

}
