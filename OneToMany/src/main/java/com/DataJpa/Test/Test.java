package com.DataJpa.Test;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.DataJpa.Entity.Courses;
import com.DataJpa.Entity.Student;
import com.DataJpa.Repo.CourseRepo;
import com.DataJpa.Repo.StudentRepo;

@Component
public class Test implements CommandLineRunner{
	
	@Autowired
	private CourseRepo crepo;

	@Autowired
	private StudentRepo srepo;

	@Override
	public void run(String... args) throws Exception {
		
		Courses c1 = new Courses(501,"Java"); 
		Courses c2 = new Courses(502,"Spring Boot"); 
		Courses c3 = new Courses(503,"Mysql"); 
		crepo.save(c1);
		crepo.save(c2);
		crepo.save(c3);
		Student s1 = new Student(40,"Saikumar Laveti",24,Arrays.asList(c1,c2,c3));
		srepo.save(s1);
	}
	
	
}
