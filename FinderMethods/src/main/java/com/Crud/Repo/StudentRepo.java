package com.Crud.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Crud.Entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {
	
	//select *from  student where name=?
	public List<Student> findByNameEquals(String name);
	
	//select *from student where name=? and id =?
	public List<Student> findByNameAndId(String name , Integer Id);
	
	public List<Student> findByIdAndAgeGreaterThan(Integer id,Integer age);
	
	
}
