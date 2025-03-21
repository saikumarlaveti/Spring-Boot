package com.MongoCrud.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.MongoCrud.document.Student;

public interface StudentRepo extends MongoRepository<Student, String>{

	@Query(fields = "{}" ,value= "{name:?0}")
	public List<Student> fetchAllDetails(String name);
	
	@Query(fields = "{}" , value= "{name:?0,age:?1}")
	public List<Student> fetchDetailsUsingNameAndAge(String name , int age);
	
	@Query(value= "{age:{$gte:?0},age:{$lte:?1}}")
	public List<Student> allStudentByAgeRande(int startAge ,int endAge);
	
	@Query(value = "{$or:[{name:?0}, {address:?1}]}")
	public List<Student> fetchUsingNameAndLocation(String name,String address);
	
	@Query(fields = "{Name:1}" , value= "{name:?0,age:?1}")
	public List<Object[]> fetchNameUsingNameAndAge(String name , int age);
	
	@Query(fields = "{Id:0,Name:1,Age:1}", value="{address:?0}")
	public List<Object[]> fetchNameAndAgeUsingAddress(String address);
	
}
