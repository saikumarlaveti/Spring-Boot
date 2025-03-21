package com.MongoCrud.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.MongoCrud.document.Student;

public interface StudentRepo extends MongoRepository<Student, String>{

	@Query(value="{name:{$regex:?0}}")  //regular expression
	public List<Student> getNameUsingRegx(String name);
	
	@Query(value="{age:{$gte:?0,$lte:?1}}",count=true)
	public int getStudentCountByAgeRange(int min,int max);
	
	@Query(value="{}",sort="{age:1}")
	public List<Student> getascendingOrder();
	
	@Query(value="{}",sort="{age:-1}")
	public List<Student> getDescendingOrder();
	
	@Query(value="{address:?0}",delete=true)
	public int deleteByAddress(String address);
	
	@Query(value="{name:?0}",exists=true)
	public boolean isExists(String name);
}
