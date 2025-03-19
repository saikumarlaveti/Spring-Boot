package com.MongoCrud.Runner;

import java.util.Arrays;
import java.util.List;
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
		 
		 std.findByAgeOrderByAgeAsc(25).forEach(System.out::println);
		 
		 std.fetchByName("Lokesh").forEach(System.out::println);
	}

}
