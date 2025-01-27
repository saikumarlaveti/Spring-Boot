package com.demo.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.demo.bean.Teacher;

@Configuration
public class AppConfig {
	
	@Bean
	public Teacher obj() {
		Teacher t = new Teacher();
		t.setId(40);
		t.setName("Saikumar Laveti");
	return t;
	}
}
