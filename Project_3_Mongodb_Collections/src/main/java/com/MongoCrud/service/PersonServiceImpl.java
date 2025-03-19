package com.MongoCrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MongoCrud.document.Person;
import com.MongoCrud.repo.PersonRepo;

@Service("Person_Service")
public class PersonServiceImpl implements PersonService{

	@Autowired
	private PersonRepo pr;
	@Override
	public String registerPerson(Person s) {
		return pr.save(s).getName()+" Person is Saved Successfully";
		
	}

}
