package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.bean.Saikumar;

@SpringBootApplication
public class AutowiredApplication {

	public static void main(String[] args) {
		
	ApplicationContext context = 	SpringApplication.run(AutowiredApplication.class, args);
	 Saikumar sai = context.getBean("Laveti",Saikumar.class);
	 sai.status();
	}

}
