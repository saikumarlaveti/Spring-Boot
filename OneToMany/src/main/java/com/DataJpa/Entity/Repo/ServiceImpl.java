package com.DataJpa.Entity.Repo;

import org.springframework.beans.factory.annotation.Autowired;

import com.DataJpa.Entity.Student;

@org.springframework.stereotype.Service("StudentService")
public class ServiceImpl implements Services{
	@Autowired
	public StudentRepo stu;
	
	@Autowired
	public CoursesRepo cou;
	@Override
	public String saveStudent(Student s) {
		
		return stu.save(s).getId() + " Saved" ;
	}

	
}
