package com.DataJpaex.Test;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.DataJpaex.Entity.Student;
import com.DataJpaex.Repo.StudentRepo;

@Component
public class Test implements CommandLineRunner{

	@Autowired
	public StudentRepo ref;
	@Override
	public void run(String... args) throws Exception {
		
		ref.saveAll(Arrays.asList(
				new Student(1,"Saikumar",25),
				new Student(2,"Lokesh",23),
				new Student(3,"Pradeep",25),
				new Student(3,"Satish",23),
				new Student(4,"Navenn",22),
				new Student(5,"Mahesh",24),
				new Student(6,"Naresh",26),
				new Student(7,"Santosh",28),
				new Student(8,"Hari",27),
				new Student(9,"Venktesh",30),
				new Student(10,"Chinna",31)
				));
	
		Pageable  p = PageRequest.of(0,3);
		Page<Student> page = ref.findAll(p);
		
		List<Student> std = page.getContent();
		std.forEach(System.out :: println);
		
		System.out.println(page.isFirst());
		System.out.println(page.isLast());
		System.out.println(page.hasPrevious());
		System.out.println(page.getTotalPages());
		System.out.println(page.isEmpty());
		System.out.println(page.hasNext());
		System.out.println(page.nextPageable());
 	}
}
