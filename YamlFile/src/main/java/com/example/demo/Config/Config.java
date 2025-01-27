package com.example.demo.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.bean.Books;
import com.example.demo.bean.Student;

@Component
public class Config implements CommandLineRunner{
	@Autowired
	public Books book;
	
	@Autowired
	public Student std;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(book);
		System.out.println(std);
		
	}
	
	
}
