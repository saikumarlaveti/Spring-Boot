package com.DataJpa.test;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.DataJpa.Entity.Books;
import com.DataJpa.Repo.BookRepository;

@Component
public class Test implements CommandLineRunner{

	@Autowired
	BookRepository ref;
	@Override
	public void run(String... args) throws Exception {
		Books b1 = new Books(1,"Saikumar",24);
		ref.save(b1);
		
		ref.saveAll(Arrays.asList(new Books(2,"Santosh Kumar",29),new Books(3,"Rajeswari",43),new Books(4,"AppalaNaidu",56)));
		
		Iterable<Books> data = ref.findAll();
		//data.forEach(System.out :: println);
		data.forEach(b->System.out.println(b));
		System.out.println(ref.count());
		System.out.println(ref.existsById(2));
	}

}
