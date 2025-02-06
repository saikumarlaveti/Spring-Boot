package com.Crud.Runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.Crud.Entity.Family;
import com.Crud.Repository.FamilyRepo;

@Component
public class NonSelectRunner implements CommandLineRunner {

	@Autowired
	private FamilyRepo repo;
	
	@Override
	public void run(String... args) throws Exception {
		List<Family> result = repo.findAll();
		result.forEach(System.out :: println);
		
		int result1 = repo.updateId("Saikumar Laveti",1);
		System.out.println(result1);
		
		int result2 = repo.deleteBetweenRange(1, 2);
		System.out.println(result2);
	}

}
