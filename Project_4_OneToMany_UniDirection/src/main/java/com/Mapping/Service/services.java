package com.Mapping.Service;

import org.springframework.stereotype.Service;

import com.Mapping.Entity.Person;


public interface services {
	public String saveDataUsingParent(Person p);
	
	public void DataLoadingUsingParent();
	
	public String deleteParentAndItsChild(int pid);
}
