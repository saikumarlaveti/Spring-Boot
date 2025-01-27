package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Status {
	
	@Autowired
	Games ge;
	
	public void display() {
		ge.status();
	}
}
