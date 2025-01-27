package com.example.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties("my.app")
public class Student {
	int id;
	String name;
	int age;

}
