package com.MongoCrud.Runner;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


import com.MongoCrud.service.RtoServices;

@Component
public class RtoOffice implements CommandLineRunner {

	@Autowired
	public RtoServices person;
	
	@Override
	public void run(String... args) throws Exception {
		
		
	}

}
