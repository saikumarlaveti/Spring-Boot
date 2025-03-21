package com.MongoCrud.Runner;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.MongoCrud.document.Student;
import com.MongoCrud.repo.StudentRepo;
import com.MongoCrud.service.StudentManagementService;

@Component
public class StudentRunner implements CommandLineRunner{
	
	@Autowired
	private StudentManagementService std;
	@Override
	public void run(String... args) throws Exception {
//	
//		std.getNameUsingRegx("^S").forEach(System.out::println);
//		
//		std.getNameUsingRegx("^L").forEach(System.out::println);
//		
//		std.getNameUsingRegx("p$").forEach(System.out::println);
//
//		System.out.println(std.getStudentCountByAgeRange(22, 24));
		
		
//		std.getascendingOrder().forEach(System.out::println);
//		
//		std.getDescendingOrder().forEach(System.out::println);
		
//		System.out.println(std.deleteByAddress("Rajam"));
		
		System.out.println(std.isExists("Lokesh"));

	}

}
