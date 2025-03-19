package com.MongoCrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.MongoCrud.document.Student;
import com.MongoCrud.repo.StudentRepo;

@Service("studentService")
public class StudentManagementIMpl implements StudentManagementService{
	@Autowired
	public StudentRepo sp;


	@Override
	public List<Student> fetchByName(String name) {
		return sp.findByName(name);
	}


	@Override
	public List<Student> findByAgeOrderByAgeAsc(int age) {
		return sp.findByAgeOrderByAgeAsc(25);
	}

}
	
