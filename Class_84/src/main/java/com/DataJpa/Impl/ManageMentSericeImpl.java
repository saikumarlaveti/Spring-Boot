package com.DataJpa.Impl;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DataJpa.Entity.Movie;
import com.DataJpa.Repo.IbommaRepo;

@Service
public class ManageMentSericeImpl  {
	
	@Autowired
	public IbommaRepo movieRepo;

//	@Override
	public String MovieRegister(Movie movie) {
		System.out.println("InMemory proxy class name :: " +movieRepo.getClass()+ "........." + Arrays.toString(movieRepo.getClass().getInterfaces()));
		System.out.println("Before saving movie");
		Movie movie1 = movieRepo.save(movie);
		System.out.println("After saving " + movie1);
		return "movie registered with id value" + movie1.getId();
	}

//	@Override
	public long movieCount() {
		long count = movieRepo.count();
		return count;
	}

}
