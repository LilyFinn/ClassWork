package com.qa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.pups.other.Puppy;

@Service
public class PuppyServiceList implements PuppyService {

	private List<Puppy> puppies = new ArrayList<>();

	public List<Puppy> getAllPuppies() {
		return puppies;

	}

	public void createPuppy(Puppy puppy) {
		this.puppies.add(puppy);

		System.out.println(puppy);
	}

	public Puppy getPuppy(int id) {
		Puppy found = this.puppies.get(id);
		return found;

	}

	public String deletePuppy(int id) {
		this.puppies.remove(id);
		return "Deleted puppy at index: " + id;
	}

	public Puppy replacePuppy(int id, Puppy newPuppy) {
		return this.puppies.set(id, newPuppy);
	}

	/*
	 * @PatchMapping("/patchPuppy/{id}") public String PatchPuppy(@PathVariable int
	 * id, @RequestBody Puppy puppy) { return "Updated pupy at index " + id; }
	 */
}
