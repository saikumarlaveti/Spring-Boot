package com.MongoCrud.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.MongoCrud.document.Student;

public interface StudentRepo extends MongoRepository<Student, String>{
	
	public List<Student> findByAgeOrderByAgeAsc(int age);
	
	public List<Student> findByName(String name);

}
