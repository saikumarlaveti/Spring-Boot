package com.example.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Laveti")
public class Saikumar {

	@Autowired
	public Mobile mob;
	public void status() {
		mob.game();
	}
	
}
