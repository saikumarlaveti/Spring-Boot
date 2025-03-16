package com.DataJpa.Runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.DataJpa.Entity.Courses;
import com.DataJpa.Entity.Student;
import com.DataJpa.Entity.Repo.ServiceImpl;

@Component
public class StudentRunner implements CommandLineRunner{

	@Autowired
	public ServiceImpl ref;
	@Override
	public void run(String... args) throws Exception {
		Courses c1 = new  Courses();
		c1.setC_Id(1);
		c1.setSubjects("Java");
		
		Courses c2 = new  Courses();
		c2.setC_Id(2);
		c2.setSubjects("Spring Boot");
		
		Student s1 = new Student();
		s1.setId(101);
		s1.setName("Saikumar Laveti");
		s1.setCourses(Arrays.asList(c1,c2));
		
		ref.saveStudent(s1);
		
		
		
		
		
	}

}
