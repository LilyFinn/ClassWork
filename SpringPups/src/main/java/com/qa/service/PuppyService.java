package com.qa.service;

import java.util.List;

import com.qa.pups.other.Puppy;

public interface PuppyService {

	public void createPuppy(Puppy puppy);

	public List<Puppy> getAllPuppies();

	public Puppy getPuppy(int id);

	public Puppy replacePuppy(int id, Puppy newPuppy);

	public String deletePuppy(int id);

}
