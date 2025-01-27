package com.DataJpaex.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.DataJpaex.Entity.Student;
import com.DataJpaex.Repo.StudentRepo;

@Component
public class Test implements CommandLineRunner{
	@Autowired
	public StudentRepo ref;
	@Override
	public void run(String... args) throws Exception {
		Student s1 = new Student(1,"Saikumar","MCA");
		Student s2 = new Student(2,"Lokesh","MCA");
		ref.save(s1);
		ref.save(s2);
		System.out.println(ref.count());
		System.out.println(ref.existsById(2));
		System.out.println(ref.findAll());
		
		ref.deleteById(2);
		

		
	}
	
}
