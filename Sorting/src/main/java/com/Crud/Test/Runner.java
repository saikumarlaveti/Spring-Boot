package com.Crud.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.Crud.Entity.Student;
import com.Crud.Repo.Crud;
import com.Crud.RepoImpl.CrudRepo;

@Component
public class Runner implements CommandLineRunner {

	@Autowired
	private CrudRepo crudRepo;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Print Student details by order");

		try {
			Iterable<Student> students = crudRepo.printByOrder(true, "Name"); // Example: Sorting by name in ascending order
			students.forEach(student -> System.out.println(student));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
