package com.Crud.Runner;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.Crud.Repo.StudentRepo;

@Component
public class Runner implements CommandLineRunner {

	@Autowired
	public StudentRepo std;
	
	@Override
	public void run(String... args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the StudentName to search : ");
		String name = sc.nextLine();
		std.findByNameEquals(name).forEach(System.out::println);
		
		System.out.println("-----------------And---------------------");
		Integer age = 1;
		std.findByNameAndId(name,age).forEach(System.out::println);
		
		
	}

}
