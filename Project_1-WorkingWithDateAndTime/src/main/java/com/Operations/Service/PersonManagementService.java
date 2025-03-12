package com.Operations.Service;

import java.util.List;

import com.Operations.Entity.Person;

public interface PersonManagementService {
	
	public String personRegister(Person p);
	
	public List<Person> fetchDetails();

}
