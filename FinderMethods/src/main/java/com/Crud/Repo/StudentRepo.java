package com.Crud.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Crud.Entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {
	
	//select *from  student where name=?
	public List<Student> findByNameEquals(String name);
	
	public List<Student> findByNameAndId(String name , Integer Age);
}
