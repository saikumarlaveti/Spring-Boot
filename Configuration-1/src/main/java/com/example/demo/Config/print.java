package com.example.demo.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.example.demo.bean.Student;

@Component
public class print implements CommandLineRunner {
	@Autowired
	public Student std;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(std);
		
	}

}
