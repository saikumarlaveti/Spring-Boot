package com.Crud.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.Crud.Entity.Student;
import com.Crud.Repo.StudentRepo;

@Component
public class Test implements CommandLineRunner{
	@Autowired
	private StudentRepo service;
	
	@Override
	public void run(String... args) throws Exception {
		
		Student s = new Student(90,"Annotation",809);
		service.save(s);
	
	}

}
