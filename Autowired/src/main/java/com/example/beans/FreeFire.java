package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class FreeFire implements Games{
	
	@Override
	public void status() {
		System.out.println("You are playing FreeFire");
		
	}


}
