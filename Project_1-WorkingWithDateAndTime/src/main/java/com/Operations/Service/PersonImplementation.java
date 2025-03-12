package com.Operations.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Operations.Entity.Person;
import com.Operations.Repo.PersonRepo;

@Service("personService")
public class PersonImplementation implements PersonManagementService{
	
	@Autowired
	private PersonRepo repo;

	@Override
	public String personRegister(Person p) {
		return repo.save(p).getPid() + " Person is saved";
	
	}

	@Override
	public List<Person> fetchDetails() {
		return repo.findAll();	}

	

	

}
