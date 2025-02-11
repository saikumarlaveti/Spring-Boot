package com.Crud.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.Crud.delete.Student;
import com.Crud.repo.deleteOperations;
import com.Crud.services.ServicesImpl;
@Component
public class Runner implements CommandLineRunner {
	
	@Autowired
	private ServicesImpl  service;
	
	@Override
	public void run(String... args) throws Exception {
		
		Student std1 = new Student(1,"Saikumar",2000,"Saikumarlaveti@gmail.com","MCA");
		Student std2 = new Student(2,"Lokesh",2002,"Lokeshkarri@gmail.com","MCA");
		Student std3 = new Student(3,"Pradeep",1995,"PradeepKota@gmail.com","MBA");
		Student std4 = new Student(4,"Satish",2001,"Satish@gmail.com","MSC");
		Student std5 = new Student(5,"Mahesh",1996,"Mahesh@gmail.com","M.com");
		List<Student> students = Arrays.asList(std1,std2,std3,std4,std5);
		service.saveStudent(students);
		System.out.println("-------------------------------");
		
//		System.out.println("Delete by id");
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter id to delete the Student details : ");
//		int a = sc.nextInt();
//		service.deleteUsingID(a);
//		
//		System.out.println("-------------------------------");
//		System.out.println("Delete All Students");
//		service.removeAllStudent();
		
		service.isAvailable(2);
		
		System.out.println("-------------------------------");
		System.out.println("Delete All Students using Ids :");
		List<Integer> s = List.of(1,2);
		service.removeAllbyUsingId(s);
		
	}

}
