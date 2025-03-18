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
//		Student s1 = new Student(null,"Saikumar" , 25,"Guravam",false);
//		System.out.println(std.registStudent(s1));
//		
//		
//		Student s2 = new Student(null,"Saikumar" , 25,"Rajam",false);
//		Student s3 = new Student(null,"Santosh" , 28,"Hyderabad",true);
//		Student s4 = new Student(null,"Lokesh" , 22,null,false);
//		
//		Student s5 = new Student();
//		s5.setName("Pradeep");
//		s5.setAge(29);
//		
//		String result = std.MultipleRegisterStudets(Arrays.asList(s2,s3,s4,s5));
//		System.out.println(result);
		
//		std.fetchAllRecord().forEach(System.out::println);
//		System.out.println("Sorting");
//		std.fetchBySorting(true, "name","age").forEach(System.out::println);
		
//		Optional<Student>opt = std.fetchById("67d91bd40c9d17480dfaca33");
//		
//		if(opt.isPresent()) {
//			System.out.println(opt.get());
//		}
//		else {
//			System.out.println("Student is not found");
//		}
//		
//		System.out.println(std.fetchById("67d91bd40c9d17480dfaca33"));
//		System.out.println(std.updateById("67d91bd40c9d17480dfaca33"));
		
		
		System.out.println(std.removeDocument("67d91e93df4011010df31c6799"));
	}

}
