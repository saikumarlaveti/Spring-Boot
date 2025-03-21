package com.Crud.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.Crud.Entity.Student;
import com.Crud.Repo.Crud;

@Component
public class Runner implements CommandLineRunner{
	
	@Autowired
	private Crud ref;

	@Override
	public void run(String... args) throws Exception {
		Student s1 = new Student(1,"Saikumar",23);
		ref.save(s1);
		
		System.out.println("Students in Database :");
		Long count = ref.count();
		System.out.println(count);
		
		System.out.println("Find all Students ");
		Iterable<Student> list = ref.findAll();
		
		System.out.println(list);//print student details method-1
		Iterator<Student> it = list.iterator(); //print student details method-2
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("Find all Students By Ids"); 
		List<Integer> ids = List.of(2,3); //List of Ids
		Iterable<Student> list1 = ref.findAllById(ids);
		Iterator<Student> it1 = list1.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		System.out.println("Find by Id"); 
		Optional<Student> list2 = ref.findById(2);
		list2.ifPresent(s->System.out.println(s));
		
		System.out.println("If Student is Exists are not");
		boolean res = ref.existsById(3);
		System.out.println("is Student is Exist :" + res);
		
	}

}
