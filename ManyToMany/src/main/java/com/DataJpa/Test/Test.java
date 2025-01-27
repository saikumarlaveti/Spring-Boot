package com.DataJpa.Test;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.DataJpa.Entity.Courses_1;
import com.DataJpa.Entity.Student_1;
import com.DataJpa.Repo.Courses_Repo;
import com.DataJpa.Repo.Student_1repo;

@Component
public class Test implements CommandLineRunner {
	
	@Autowired
	private Student_1repo srepo;
	@Autowired
	private Courses_Repo crepo;
	

	@Override
	public void run(String... args) throws Exception {
		
		Courses_1 c1 = new Courses_1(10,"Physics");
		Courses_1 c2 = new Courses_1(20,"Chemistry");
		Courses_1 c3 = new Courses_1(30,"Maths");
		crepo.save(c1);
		crepo.save(c2);
		crepo.save(c3);

		Student_1 s1 = new Student_1(1,"Saikumar",Arrays.asList(c1,c2));
		Student_1 s2 = new Student_1(2,"Lokesh",Arrays.asList(c2,c3));
		Student_1 s3 = new Student_1(3,"Satish",Arrays.asList(c1,c2,c3));
		srepo.save(s1);
		srepo.save(s2);
		srepo.save(s3);

		
		
		
	}

}
