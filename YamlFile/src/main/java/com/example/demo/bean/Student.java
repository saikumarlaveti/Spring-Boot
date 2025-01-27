package com.example.demo.bean;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties("your.student")
@Data
public class Student {
	public List<String> names;
	public Map<Integer ,String> versions;
	public Books book;
}
