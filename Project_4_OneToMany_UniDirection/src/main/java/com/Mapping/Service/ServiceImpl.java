package com.Mapping.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Mapping.Entity.Person;

@Service("otp")
public class ServiceImpl implements services{

	@Autowired
	private PersonRepo per;
	
	@Autowired
	private Ph_numberRepo ph;
	@Override
	public String saveDataUsingParent(Person p) {
		
		return per.save(p).pid + "Saved successful ";
	}

}
