package com.example.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.bean.Student;

@Component
public class display implements CommandLineRunner{

	@Autowired
	public Student std;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(std);
		
	}

}
