package com.DataJpa.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.DataJpa.Entity.Movie;
import com.DataJpa.Impl.ManagementSerice;

@Component
public class Runner implements CommandLineRunner{

	@Autowired
	private ManagementSerice service;
	@Override
	
	public void run(String... args) throws Exception {
		Movie m = new Movie();
		m.setMovieName("RRR");
		
		try {
			System.out.println(service.MovieRegister(m));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(service.movieCount());
		
		
	}
	

}
