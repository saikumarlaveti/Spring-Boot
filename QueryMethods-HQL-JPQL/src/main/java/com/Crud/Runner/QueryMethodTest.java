package com.Crud.Runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.Crud.Repo.StudentRepo;
import com.Crud.entity.Student;

@Component
public class QueryMethodTest implements CommandLineRunner{
	@Autowired
	private StudentRepo std;
	
	@Override
	public void run(String... args) throws Exception {
		List<Student> result = std.SearchStudentsByRange(2,5);
		
		result.forEach(System.out :: println);
		
		List<Student> result1 = std.SearchStudentByNames("hello", "Lokesh", "Pradeep");
		result1.forEach(System.out :: println);
		
		List<Object[]> result2 = std.SearchStudentByNameAndAge("hello", "Lokesh", "Pradeep", 21);
		result2.forEach(row->{
			for(Object val:row)
				System.out.print(val+" ");
			System.out.println();
		});
		
		std.SearchByNames(1, 5).forEach(System.out :: println);
		
		System.out.println("Single Row");
		std.searchById(2).forEach(System.out :: println);
		

 			
	}

}
