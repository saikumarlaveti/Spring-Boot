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
		
//		int result1  = repo.registerFamily(2, 28, 1997, "Santosh");
//		System.out.println(result1);
		
//		System.out.println(repo.showDate());
//		
//		int result = repo.createTable();
//		System.out.println(result);
		
		int result = repo.insertValues(5, 27, 1997, "Hema Laveti");
		System.out.println(result==1?"inserted successfully":"not inserted");
	}

}
