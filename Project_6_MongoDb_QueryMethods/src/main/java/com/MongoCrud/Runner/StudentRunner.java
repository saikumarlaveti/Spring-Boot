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
	//	std.fetchAllDetails("Saikumar").forEach(System.out::println);
		
	//	std.fetchDetailsUsingNameAndAge("Saikumar", 25).forEach(System.out::println);
		
	//	std.allStudentByAgeRande(20, 24).forEach(System.out::println);
		
	//	std.fetchUsingNameAndLocation("Lokesh","Rajam").forEach(System.out::println);
		
    //	std.fetchNameUsingNameAndAge("Saikumar", 25).forEach(row->System.out.println(Arrays.toString(row)));
		
		std.fetchNameAndAgeUsingAddress("Hyderabad").forEach(row->System.out.println(Arrays.toString(row)));
	}

}
