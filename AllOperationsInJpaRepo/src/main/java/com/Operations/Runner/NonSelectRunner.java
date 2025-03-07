package com.Operations.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.Operations.Repo.BookRepo;

@Component
public class NonSelectRunner implements CommandLineRunner{
	
	@Autowired
	private BookRepo repos;

	@Override
	public void run(String... args) throws Exception {
		int result  =  repos.changeName("hello",5);
		System.out.println(result);
		
		int delete = repos.deleteBook(5);
		System.out.println(delete);
	}

}
