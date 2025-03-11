package com.Operations.Runner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.Operations.Entity.Books;
import com.Operations.Repo.BookRepo;

// This Runner have only Curd operations --> Okay
//1.save
//2.saveAll
//3.Read
//4.update
//@Component
public class Runner implements CommandLineRunner{

	@Autowired
	private BookRepo repo;
	@Override
	public void run(String... args) throws Exception {
		
		
//		Books b1 = new Books(1,"The Kite Runner","Khaled Hosseini",2001);
//		repo.save(b1);
//		Books b2 = new Books(2,"Atomic Habit","James Clear",2002);
//		Books b3 = new Books(3,"Energize Your Mind","Gaur Gopal Das",2003);
//		Books b4 = new Books(4,"The Power of Now ","Eckhart Tolle",2004);
//		repo.saveAll(Arrays.asList(b2,b3,b4));
		
		List<Books> list = repo.findAll();
		list.forEach(i->System.out.println(i));
		

		Optional<Books> book  = repo.findById(1);//.orElseThrow(() -> new RuntimeException("Book is not Available"));
		if(book.isPresent()) {
			Books b = book.get();
			b.setPublishYear(2000);
			repo.save(b);
		}
		else {
			System.out.println("Book is not available");
			}
		}

}
